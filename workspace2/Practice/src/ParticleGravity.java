

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author Ben Matthews
 *
 * This class creates a gravity simulation of 50_000 particles using the
 * JavaFX packages to draw and render the particles
 */
public class ParticleGravity extends Application
{
  private static final int WINDOW_WIDTH = 700;
  private static final int WINDOW_HEIGHT = 700;
  private static final int MAX_SPEED = 20;
  private static int gravityMass = 2_000;
  private double numColors = 20; // double for color calculation

  private double gravityX, gravityY;

  private static final int PARTICLES = 50_000;

  private double[] x = new double[PARTICLES];
  private double[] y = new double[PARTICLES];
  private double[] velocityX = new double[PARTICLES];
  private double[] velocityY = new double[PARTICLES];
  private Color[] colors = new Color[(int) numColors];

  private PixelWriter pixelWriter;
  private GraphicsContext gfx;

  private final Random random = new Random();

  @Override
  /**
   * Overridden start method, takes a Stage element
   * 
   * Instantiates the fields and arrays as well as sets up the graphics elements
   * for drawing
   */
  public void start(final Stage primaryStage)
  {

    primaryStage.setTitle(PARTICLES + " Particle Gravity Simulation");
    gravityX = WINDOW_WIDTH / 2.0;
    gravityY = WINDOW_HEIGHT / 2.0;

    // instantiating particles:
    for (int i = 0; i < PARTICLES; i++)
    {
      x[i] = random.nextDouble() * WINDOW_WIDTH;
      y[i] = random.nextDouble() * WINDOW_HEIGHT;
      velocityX[i] = 0;
      velocityY[i] = 0;
    }
    for (int i = 0; i < numColors; i++)
    {
      double hue = ((numColors - i) / numColors) * 240d; // blue to red
      colors[i] = Color.hsb(hue, 1d, 1d); // max saturation and brightness
    }

    // setting up graphics elements
    Group root = new Group();
    Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
    gfx = canvas.getGraphicsContext2D();
    root.getChildren().add(canvas);
    Scene scene = new Scene(root, Color.BLACK);
    primaryStage.setScene(scene);
    primaryStage.show();

    pixelWriter = canvas.getGraphicsContext2D().getPixelWriter();

    canvas.addEventFilter(MouseEvent.MOUSE_DRAGGED, new MouseHandler());
    canvas.addEventFilter(MouseEvent.MOUSE_CLICKED, new MouseHandler());

    AnimationTimer gameLoop = new MainGameLoop();
    gameLoop.start();
  }

  /**
   * Helper method to retrieve the distance of a given particle from the gravity
   * point
   * 
   * @param x - the x position
   * @param y - the y position
   * @return the distance from the given point to the gravity point
   */
  public double distanceFromCenter(double x, double y)
  {
    double distX = gravityX - x;
    double distY = gravityY - y;
    return Math.sqrt((distX * distX + distY * distY));
  }

  /**
   * @author Ben Matthews
   *
   * This class contains the animation loop for the game and extends
   * AnimationTimer.
   */
  class MainGameLoop extends AnimationTimer
  {

    /**
     * The handle method takes a long representing the current system nano-time
     * and updates the positions of all of the particles
     * 
     * particle positions are updated using the force and gravity equations: a =
     * F/M Fgrav = (M1-M2)/D^2
     */
    @Override
    public void handle(long now)
    {
      gfx.setFill(Color.BLACK);
      gfx.fillRect(0, 0, 700, 700);

      for (int i = 0; i < PARTICLES; i++)
      {
        // acceleration calculations:
        double x1 = x[i];
        double y1 = y[i];

        double distX = x1 - gravityX;
        double distY = y1 - gravityY;

        double dist = distanceFromCenter(x1, y1);
        double angle = Math.atan(distY / distX);

        double force = gravityMass / (dist * dist);
        double forceX = force * Math.cos(angle);
        double forceY = force * Math.sin(angle);

        if (x1 < gravityX)
        {
          velocityX[i] += forceX;
          velocityY[i] += forceY;
        }
        else
        {
          velocityX[i] -= forceX;
          velocityY[i] -= forceY;
        }

        if (x[i] < 0)
        {
          x[i] = 0;
          velocityX[i] = 0;
        }
        if (x[i] > WINDOW_WIDTH)
        {
          x[i] = WINDOW_WIDTH;
          velocityX[i] = 0;
        }
        if (y[i] < 0)
        {
          y[i] = 0;
          velocityY[i] = 0;
        }
        if (y[i] > WINDOW_HEIGHT)
        {
          y[i] = WINDOW_HEIGHT;
          velocityY[i] = 0;
        }
        x[i] += velocityX[i];
        y[i] += velocityY[i];

        // color logic
        double hue = Math
            .sqrt((velocityX[i] * velocityX[i] + velocityY[i] * velocityY[i]));
        hue /= MAX_SPEED;
        if (hue > 1) hue = 1;
        hue *= numColors;
        hue--;
        if (hue < 0) hue = 0;

        pixelWriter.setColor((int) x1, (int) y1, colors[(int) hue]);
      }
    }
  }

  /**
   * @author Ben Matthews
   * 
   * This class implements an EventHandler with of type MouseEvent and
   * is used to listen to both mouse clicks and mouse drags
   */
  class MouseHandler implements EventHandler<MouseEvent>
  {
    @Override
    /**
     * updates the gravity position and prints the new position to the
     * System.out
     */
    public void handle(MouseEvent event)
    {
      System.out.println("Mouse Clicked at: ( x: " + event.getSceneX() + ", y: "
                         + event.getSceneY() + ")");
      gravityX = event.getSceneX();
      gravityY = event.getSceneY();
    }
  }

  /**
   * Main method - program entry point calls the launch method in Application
   * 
   * @param args - passed into the launch method
   *             - args[0] can be used to set the gravityMass
   */
  public static void main(String[] args)
  {
    
    //
    if (args.length != 0){
      try {
        gravityMass = Integer.parseInt(args[0]); 
      } catch(NumberFormatException e){
        System.out.println("Error: argument must be a valid number");
        System.exit(0);
      }
      if (gravityMass <= 0){
        System.out.println("Error: gravity must be > 0");
        System.exit(0);
      }
      
    }
    launch(args);
  }
}

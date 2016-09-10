import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Optional;

public class Main_JavaFX_Button extends Application  implements EventHandler<ActionEvent>
{

  private Button buttonDisplayText;
  private Button buttonErrorDialog;
  private Button buttonConformation;

  @Override
  public void start(Stage primaryStage)
  {
    primaryStage.setTitle("Hello World!");

    buttonDisplayText = new Button("Say 'Hello World'");
    buttonDisplayText.setOnAction(this);


    buttonErrorDialog = new Button("Display Error Dialog");
    buttonErrorDialog.setOnAction(this);


    buttonConformation = new Button("Confirmation Dialog");
    buttonConformation.setOnAction(this);

    HBox formButtonBox = new HBox(10);
    formButtonBox.setPadding(new Insets(10, 10, 10, 10));
    formButtonBox.getChildren().addAll(buttonDisplayText, buttonErrorDialog, buttonConformation);


    StackPane root = new StackPane();
    root.getChildren().add(formButtonBox);
    primaryStage.setScene(new Scene(root, 600, 250));
    primaryStage.show();
  }


  @Override
  public void handle(ActionEvent event)
  {
    Object source = event.getSource();

    if (source == buttonDisplayText)
    {
      System.out.println("Hello World!");
    }

    else if (source == buttonErrorDialog)
    {
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Error");
      alert.setContentText("Paper not loaded");
      alert.showAndWait();
    }

    else if (source == buttonConformation)
    {
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Confirmation");
      alert.setHeaderText("Exit application");
      alert.setContentText("Do you want to exit the application?");
      Optional<ButtonType> result = alert.showAndWait();
      if (result.get() == ButtonType.OK)
      {
        System.out.println("User clicked exit the program in Confirmation Dialog");
        Platform.exit();
      }
      else
      {
        System.out.println("User clicked Cancel in Confirmation Dialog");
      }
    }


  }


  public static void main(String[] args)
  {
    launch(args);
  }
}

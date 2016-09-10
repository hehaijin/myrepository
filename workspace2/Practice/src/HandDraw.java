import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;




public class HandDraw {
	
	private class DrawCanvas extends Canvas{
      public void paint(Graphics g)
      {
    	  g.drawImage(image, 0, 0, null);
      }
	}







	private final int AREA_WIDTH=500;
	
	private final int AREA_HEIGHT=400;
	
	private int preX=-1;
	private int preY=-1;
	PopupMenu pop=new PopupMenu();
	MenuItem red=new MenuItem("RED");
	MenuItem blue=new MenuItem("BLUE");
	MenuItem green=new MenuItem("GREEN");
  BufferedImage image=new BufferedImage(AREA_WIDTH,AREA_HEIGHT,BufferedImage.TYPE_INT_RGB);
  Graphics g=image.getGraphics();
  private Frame f=new Frame("SIMPLE HAND DRAW APP");
  private DrawCanvas drawarea=new DrawCanvas();
	public Color forecolor=new Color(255,0,0);
	
	
	public void init()
	{
		ActionListener menuListener= e->
		{ if(e.getActionCommand().equals("RED"))
		
			forecolor=new Color(255,0,0);
			
		
		if(e.getActionCommand().equals("GREEN"))
			forecolor=new Color(0,255,0);
		if(e.getActionCommand().equals("BLUE"))
			forecolor=new Color(0,0,255);
			
			
		};
		
		red.addActionListener(menuListener);
		green.addActionListener(menuListener);
		blue.addActionListener(menuListener);
		pop.add(red);
		pop.add(green);
		pop.add(blue);
		drawarea.add(pop);
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
		drawarea.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
		drawarea.addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent e)
			{
				if(preX>0 && preY>0)
				{
					g.setColor(forecolor);
					g.drawLine(preX, preY, e.getX(), e.getY());
					
				}
				preX=e.getX();
				preY=e.getY();
				e.getComponent().repaint();
			}
			
			
		});
		
		
		drawarea.addMouseListener(new MouseAdapter()
				{
			     public void mouseReleased(MouseEvent e)
			     {
			    	 if(e.isPopupTrigger())
			    		 pop.show(drawarea, e.getX(), e.getY());
			     
			     preX=-1;
			     preY=-1;
			     }
				});
		
		 f.add(drawarea);
		 f.pack();
		 f.setVisible(true);
		 f.addWindowListener(new WindowAdapter()
				 {
			    public void windowClosing(WindowEvent e)
			    {
			    	System.exit(0);
			    }
				 });
		 
		
	}
	
	
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HandDraw().init();

	}

}

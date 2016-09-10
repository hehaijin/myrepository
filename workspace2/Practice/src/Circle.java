

public class Circle {

	
	    private int radius;
	    private String sp="  ";
	    public Circle(int radius)
	    {
	      this.radius=radius;
	    }
	    private void drawStar(int position)
	    {
	      for(int i=0;i<(position-1);i++)
	      {
	        System.out.print(sp);
	      }
	      System.out.print("*");
	      for(int i=0;i<(2*(radius-position-1));i++)
	      {
	        System.out.print(sp);
	        
	      }
	      System.out.print("*");
	      System.out.println();
	    }
	    
	    public void draw()
	    {
	      for(int i=0;i<2*radius;i++)
	      {
	        int p=(int)(radius- Math.sqrt(radius*radius-(radius-i)*(radius-i)));
	        drawStar(p);
	      }
	    }
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Circle circle=new Circle(10);
        circle.draw();
        System.out.println(Math.random()*100);
       
       
	}

}

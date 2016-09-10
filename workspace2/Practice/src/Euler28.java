
public class Euler28 {
	
	public int[][] spiral=new int[1001][1001];
	int step=0;
	int length=1;
	int number=1;
	int direction=1;

	
	
	private class Point
	{
		int x;
		int y;

		
		public Point(int x,int y)
		{
			this.x=x;
			this.y=y;
		
		}
		
	}
	
	
	
	public Euler28()
	{ 
		spiral[500][500]=number;
		Point current=new Point(500,500);
		Point next=nextPoint(current);
		
		while(next.x <=1000 &&next.y <=1000)
		{ number++;
			spiral[next.x][next.y]=number;
	//		System.out.println(next.x +"   "+ next.y + " "+direction+"  "+ number);
			next=nextPoint(next);
		}
	}
	
	public Point nextPoint(Point current)
	{
		if(step<length)
		{
			if(direction%4==1) 
			{	 step++;
			   
			    return	new Point(current.x,current.y+1);
			}
			if(direction%4==2) 
			{
					step++;
			return new Point(current.x+1,current.y);
			}
			if(direction%4==3) 
			{
				step++;
				return new Point(current.x,current.y-1);
			}
			if(direction%4==0) 
			{
				step++;
				return 	new Point(current.x-1,current.y);
			}
		}
		
		//step=length
			direction++;
			if(direction%2==1) length++;
			step=0;
			return nextPoint(current);

	}
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Euler28 eu=new Euler28();
  long sum=0;
  for(int i=0;i<1001;i++)
	  sum=sum+eu.spiral[i][i]+eu.spiral[i][1000-i];
  System.out.println(sum);
    

	}

}

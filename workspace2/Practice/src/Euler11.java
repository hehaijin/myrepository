import java.util.Scanner;

public class Euler11 {
	
	public int[][] array=new int[20][20];
	

	
	public Euler11()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				array[i][j]=sc.nextInt();
		
		sc.close();
		
	}
	
	
	public void show()
	{
		for(int i=0;i<20;i++)
			for(int j=0;j<20;j++)
				System.out.println(array[i][j]);
	}
	
	
	
	
	public int product()
	{
		int p=0;
		
		for(int i=0;i<17;i++)
			for(int j=0;j<17;j++)
			{
				int h=array[i][j]*array[i][j+1]*array[i][j+2]*array[i][j+3];
				if(p<h) p=h;
				int v=array[i][j]*array[i+1][j]*array[i+2][j]*array[i+3][j];
				if(p<v) p=v;
				int d=array[i][j]*array[i+1][j+1]*array[i+2][j+2]*array[i+3][j+3];
				if(p<d) p=d;
			}
				
		for(int i=0;i<17;i++)
			for(int j=3;j<20;j++)
			{ 
				//this is where I got wrong first time. If I use i-1 j-1 the i,j range is different.
				int d=array[i][j]*array[i+1][j-1]*array[i+2][j-2]*array[i+3][j-3]; 
				if(p<d) p=d;
			}
			
		return p;
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(new Euler11().product());
	}
	

}

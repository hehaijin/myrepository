
public class Euler15 {

	private long array[][];
	public Euler15(int n)
	{
		array=new long[n+1][n+1];
		array[0][0]=1;
	
		
	}
	
	
	public void init()
	{
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array.length;j++)
			{
				if(i>=1 && j>=1 && array[i][j-1]>0 && array[i-1][j]>0) array[i][j]=array[i-1][j]+array[i][j-1];
				if(i==0 && j>=1 && array[i][j-1] >0) array[i][j]=array[i][j-1];
				if(i>=1 && j==0 && array[i-1][j] >0 ) array[i][j]=array[i-1][j];
			}
		
	}
	
	public void show()
	{
		for(int i=0;i<array.length;i++)
		{	for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]);
				System.out.print("                    ");
			}
		  System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Euler15 eu=new Euler15(20);
     eu.init();
     eu.show();
	}

}

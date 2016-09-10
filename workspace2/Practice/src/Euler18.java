import java.util.Scanner;

public class Euler18 {
   private int n;
   public int array[][];
   
   public Euler18(int n)
   {
	   this.n=n;
	   array=new int[n][];
	   for( int i=0;i<n;i++)
		   array[i]=new int[i+1];
   }
   
   public int sum(int i,int j)
   {
	   if(i==n-1) return array[i][j];
	   else return Math.max(array[i][j]+sum(i+1,j), array[i][j]+sum(i+1,j+1));
   }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    Euler18 eu=new Euler18(100);
    for(int i=0;i<100;i++)
    {
    	for(int j=0;j<=i;j++)
    	{
    		eu.array[i][j]=sc.nextInt();
    	}
    }
    
 /*   for(int i=0;i<15;i++)
    	for(int j=0;j<=i;j++)
    		System.out.println(eu.array[i][j]);
		*/
    
    System.out.println(eu.sum(50,0));
		
		
	}

}

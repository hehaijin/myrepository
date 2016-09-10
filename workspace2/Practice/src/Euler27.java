
public class Euler27 {
static long begintime=System.currentTimeMillis();

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=0;
		int a=0;
		int b=0;
		for(int i=-999;i<1000;i++)
		{
			for(int j=-999;j<1000;j++)
			{
			
				for(int n=0;n<10000;n++)
				{
					if(!NumberTheory.isPrime(Math.abs(n*n+i*n+j)))
					{	
					if(N<n) {
						N=n;
						a=i;
						b=j;
						System.out.println("for "+a +" and "+ b +" it's n is "+n);
					}
		     break;
				}
					
				}
				
				
				
				
			}
		}
		
		
		System.out.println(a*b);
		System.out.println("time spent "+ (System.currentTimeMillis()-begintime)+"ms");

	}

}

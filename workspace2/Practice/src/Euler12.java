
public class Euler12 {
	
	static public int  c=0;

	static long triangle(int n)
	{ long sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
	
	
	
	static public int divisorNumber(long n)
	{
		int count=0;
		//this is where the optimization can greatly speed up the app.
		for(long i=1;i<n/i+1;i++)
		{ 
			if(n%i==0)
			{	if(n==i*i) count++;
				else
				count=count+2;
			}
		}
		
		if(count >c)
	 {c=count;
		System.out.println(count);
	 }
		return count;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=1;
	  while(divisorNumber(triangle(n)) <500 )
	  {
		  n++;
		  
		  
	  }
		  
		System.out.println(triangle(n));
		
		
		
		
	}

}

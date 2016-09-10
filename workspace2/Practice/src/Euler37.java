
public class Euler37 {
	long tPrimes[]=new long[11];
	

	public static boolean isTruncatable(long n)
	{ 
		
	  String str=String.valueOf(n);
	  for(int i=0;i<str.length();i++)
	  {
		  long m=Long.parseLong(str.substring(0,i+1));
		  if(!NumberTheory.isPrime(m)) return false;
		  long m2=Long.parseLong(str.substring(str.length()-i-1));
		  if(!NumberTheory.isPrime(m2)) return false;
		  
	  } 
		
		
		return true;
		
		
	}
	
	public void show()
	{
		for(long l:tPrimes) System.out.println(l);
	}
	
	
	public void calculate(long limit)
	{ int index=0;
		for(long i=10;i<limit;i++)
		{
			if(NumberTheory.isPrime(i))
				 if(isTruncatable(i)) 
				 {
					 tPrimes[index]=i;
					 index++;
					 System.out.println("the "+index+"th tPrime is "+ i);
				 }
			
			
			
		}
		
		
	}
	
	public long sum()
	{ long sum=0;
		for(int i=0;i<11;i++)
			sum=sum+tPrimes[i];
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Euler37 eu=new Euler37();
		eu.calculate(1000000);
		
		System.out.println(eu.sum());
		
		
		
	}

}

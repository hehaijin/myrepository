
public class Euler46 {

	static public boolean isSumPS(long n)
	{
		for(int i=2;i<n;i++)
		{
			if(NumberTheory.isPrime(i) && (n-i)%2==0 && isSquare((n-i)/2)) 
        {
	       return true;
	       
         }
       
		}
		return false;
		
		
	}
	
	
	public static boolean isSquare(long n)
	{
		long m=(long)Math.sqrt(n);
    return m*m==n;		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  long i=9;
	  while(NumberTheory.isPrime(i)||(!NumberTheory.isPrime(i) && isSumPS(i))) i=i+2;
	  
	  System.out.println(i);

	}

}

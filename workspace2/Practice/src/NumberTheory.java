import java.math.BigInteger;
import java.util.HashSet;

public abstract class NumberTheory {
  public static final BigInteger B0=new BigInteger("0");
  public static final BigInteger B1=new BigInteger("1");
  public static final BigInteger B2=new BigInteger("2");
  public static final BigInteger B3=new BigInteger("3");
  
	public static BigInteger factorial(int n)
	{
		BigInteger b=NumberTheory.B1;
		for(int i=1;i<=n;i++)
			b=b.multiply(new BigInteger(String.valueOf(i)));
		return b;
	}
	
	
	
	public static long primesBelow(long n)
	{ long num=0;
		for(long i=2;i<n;i++)
		{
			if(NumberTheory.isPrime(i)) num++;
		}
		return num;
		
	}
	
  
  
	static public int divisorNumber(long n)
	{
		int count=0;
		for(long i=1;i<n/i+1;i++)
		{
			if(n%i==0)
			{	if(n==i*i) count++;
				else
				count=count+2;
			}
		}
	
		return count;
		
		
	}
	
	
  
	public static boolean isPrime(int a)
	{ a=Math.abs(a);
		for(int i=2;i<a/i+1;i++)
			if(a%i==0) return false;
		return true;
	}
	
	
	public static boolean isPrime(long a)
	{
		if(a==0 || a==1) return false;
		a=Math.abs(a);
		for(long i=2;i<a/i+1;i++)
			if(a%i==0) return false;
		return true;
	}
	
	
	public static boolean isPrime(BigInteger a)
	{ a=a.abs();
		for(BigInteger i=new BigInteger("2");a.divide(i).add(B1).compareTo(i)>0  ;i=i.add(new BigInteger("1")))
			if(a.remainder(i).compareTo(new BigInteger("0"))==0) return false;
		return true;
	}
	
	
	public static long gcd(long a,long b)
	{
		if(a==1 || b==1) return 1;
		if(a==0) return b;
		if(b==0) return a;
		if(a>b) return gcd(b,a%b);
		else return gcd(a,b%a);
	}
	
	//this functions returns a hashset that contains all the prime factors of this int n;
	public static HashSet<Integer> primeFactors(int n)
	{
		HashSet<Integer> hs=new HashSet<>();
	  primeFactors(hs,n);
	  return hs;
		
		
	}
	//this is a helper function for above function.
	private static void primeFactors(HashSet<Integer> hs, int n)
	{
		if(NumberTheory.isPrime(n)) 
			{hs.add(n);
			 return;
			}
		for(int i=2;i<n/i+1;i++)
		{
			if(NumberTheory.isPrime(i) && n%i==0) 
			{
				hs.add(i);
				primeFactors(hs,n/i);
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 for(int i=10;i<=10000000;i=10*i)
		 System.out.println("the number of primes below "+i/Math.log(i)+" is "+primesBelow(i));
		

	}

}

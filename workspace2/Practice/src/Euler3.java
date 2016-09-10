import java.math.BigInteger;

//@author Haijin




public class Euler3 {

	public static BigInteger biggestPrimefactor(BigInteger a)
	{  BigInteger n=new BigInteger("1") ;
		 for(BigInteger i=new BigInteger("2");a.divide(i).add(new BigInteger("2")).compareTo(i) >0; i=i.add(new BigInteger("1")))
		 {
			 if(NumberTheory.isPrime(i) && a.remainder(i).compareTo(new BigInteger("0"))==0) 
		      n=i;
		
        System.out.println(i); // BigInteger is slow. use this to indicate progress.
	   }
		
		 return n;
	}
	
	public static long biggestPrimefactor(long a)
	{  long n=1;
		 for(long i=2;i<a/i+1; i++)
		 {
			 if(NumberTheory.isPrime(i) && a%i==0) 
		      n=i;
       
	   }
		
		 return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(biggestPrimefactor(new BigInteger("600851475143")));
	}

}

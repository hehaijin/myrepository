import java.util.HashSet;

public class Euler47 {

	public static HashSet<Integer> primeFactors(int n)
	{
		HashSet<Integer> hs=new HashSet<>();
	  primeFactors(hs,n);
	  return hs;
		
		
	}
	
	public static void primeFactors(HashSet<Integer> hs, int n)
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
		for(int i=2;i<=1000000;i++)
		{
			if(primeFactors(i).size()==4 && primeFactors(i+1).size()==4 &&primeFactors(i+2).size()==4 &&primeFactors(i+3).size()==4 )
				System.out.println(i);
			
			
		}

	}

}






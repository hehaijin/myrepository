
public class Euler7 {

	public static int nthPrime(int n)
	{ int i=1;
	  int a=2;
		while(i<n)
		{
			a++;
			if(isPrime(a)) i++;
		}
		
		return a;
		
	}
	
	
	
	
	public static boolean isPrime(int a)
	{ 
		for(int i=2;i<a;i++)
		{
			if(a%i==0) return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthPrime(10001));

	}

}

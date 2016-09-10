



public class Euler10 {
	
	static public long sum(long a)
	{ long sum=0;
		for(long i=2;i<a;i++)
			if(NumberTheory.isPrime(i)) sum=sum+i;
		return sum;
			
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(2000000));
	}

}

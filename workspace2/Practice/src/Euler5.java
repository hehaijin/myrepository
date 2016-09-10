
public class Euler5 {

	static public long lcm(long a,long b)
	{
		return a*b/NumberTheory.gcd(a, b);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    long lcm=1;
		for(long i=1;i<21;i++)
		{	lcm=lcm(lcm,i);

		System.out.println(lcm);
		}
	}
	

}

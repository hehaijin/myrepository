import java.math.BigInteger;

public class Euler20 {

	public static BigInteger factorial(int n)
	{
		BigInteger b=NumberTheory.B1;
		for(int i=1;i<=n;i++)
			b=b.multiply(new BigInteger(String.valueOf(i)));
		return b;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s=factorial(100).toString();
   int sum=0;
   for(int i=0;i<s.length();i++)
	   sum=sum+s.charAt(i)-48;
	 System.out.println(sum);  
	 System.out.println(factorial(9));
	}

}

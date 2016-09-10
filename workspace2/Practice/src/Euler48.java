import java.math.BigInteger;

public class Euler48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BigInteger sum=NumberTheory.B0;
		for(int i=1;i<=1000;i++)
		{  BigInteger pow=NumberTheory.B1; 
			 for(int j=1;j<=i;j++)
			   pow=pow.multiply(BigInteger.valueOf((long)i));
			 sum=sum.add(pow);
			 
			
		}
		
		String s=sum.toString();
		System.out.println(s.substring(s.length()-10));
		
	}

}

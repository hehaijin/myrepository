import java.math.BigInteger;

public class Euler16 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BigInteger b=NumberTheory.B2;
		for(int i=0;i<1000-1;i++)
		    b=b.multiply(NumberTheory.B2);
		String s=b.toString();
		int sum=0;
		for(int i=0;i<s.length();i++)
			sum=sum+s.charAt(i)-48;
		System.out.println(sum);
		
	}

}

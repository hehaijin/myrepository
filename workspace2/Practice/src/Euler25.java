import java.math.BigInteger;

public class Euler25 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger b1=NumberTheory.B1;
		BigInteger b2=NumberTheory.B2;
		BigInteger b3=b1.add(b2);
		int index=4; //this one is tricky. as the series goes like 1,1,2,3

		while(b3.toString().length()<10000)
		{
			b1=b2;
			b2=b3;
			b3=b1.add(b2);
			index++;
		}
		System.out.println(b3);
		System.out.println(index);
		
	}

}

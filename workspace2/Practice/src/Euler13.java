import java.math.BigInteger;
import java.util.Scanner;

public class Euler13 {
	private String[] str;
	private BigInteger[] bigi;

	public Euler13()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input: ");
		str=new String[100];
		bigi=new BigInteger[100];
		for(int i=0;i<100;i++)
			{str[i]=sc.nextLine(); 
			//this is to deal with the fomat of the input.somehow every line begins with a " " excepte the first line.
			if(i!=0) str[i]=str[i].substring(1);
			
		  bigi[i]=new BigInteger(str[i]);
			}
		
		
		
	}
	
	public BigInteger add()
	{
		BigInteger sum=NumberTheory.B0;
		for(int i=0;i<100;i++)
		{
			sum=sum.add(bigi[i]);
		}

		return sum;
	}
	
	public void show()
	{
		for(int i=0;i<100;i++)
			System.out.println(bigi[i]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(new Euler13().add().toString().substring(0, 10));	

	}

	

}

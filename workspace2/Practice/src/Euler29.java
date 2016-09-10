import java.math.BigInteger;
import java.util.Arrays;

public class Euler29 {
	public BigInteger numbers[]=new BigInteger[99*99];
	
	public Euler29()
	{ int index=0;
		for(int i=2;i<=100;i++)
			for(int j=2;j<=100;j++)
			{
				numbers[index]= pow(i,j);
		  
				index++;
			}
		
		Arrays.sort(numbers);
		
	}
	
	
	
	public BigInteger pow(int i,int j)
	{ 
	  BigInteger base=BigInteger.valueOf((long)i);	  
	  BigInteger result=base;
		for(int k=1;k<j;k++)
			result=result.multiply(base);
			
		return result;
		
		
	}
	
	
	
	public int count()
	{ int result=1;
		for(int i=1;i<99*99;i++)
			if(numbers[i].compareTo(numbers[i-1]) > 0) result++;
		return result;
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Euler29 eu=new Euler29();
System.out.println(eu.count());
		

		
		
		
	}

}

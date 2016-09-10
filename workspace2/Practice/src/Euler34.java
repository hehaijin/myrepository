
public class Euler34 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int i=10;i<=100000000;i++)
   {
	   String s=String.valueOf(i);
	   int sum=0;
	   for(int j=0;j<s.length();j++)
	   {
		   sum=sum+ NumberTheory.factorial(s.charAt(j)-48).intValue();
		   
	   }
	   if(sum==i) System.out.println(i);
	   
   }
		
		
		
		
		
	}

}


public class Euler21 {

	public static int divisorSum(int n)
	{ int sum=0;
	  for(int i=1;i<n/2+1;i++)
	  {
		  if(n%i==0) sum=sum+i;
	  }
		
		return sum;
		
	}
	
	
	public static boolean checkAmi(int n)
	{  
		int m=divisorSum(n);
		
		if(divisorSum(m)==n & m!=n ) return true;
		else return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0;
     for(int i=0;i<10000;i++)
    	 if(checkAmi(i)) sum=sum+i;
     
     System.out.println(sum);
	}

}

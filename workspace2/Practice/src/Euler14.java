
public class Euler14 {
	
	//n must be set as long; if use int, the program will go in a infinite loop when n=11xx83.
	public static int length(long n)
	{   int count=1;
	    long m=n;
	    while(m!=1)
	    {
	    	if(m%2==0) m=m/2;
	    	else m=m*3+1;
	    	count ++;
	    	
	    }
  		return count;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int max=0;
		  for(int i=1;i<1000000;i++)
		  {
			  int l=length(i);
			  if(max<l) 
				  {max=l;
				  System.out.println(max+ " " + i);
				  
				  }
			  if(i%1000000==0) System.out.println(i);
			  
		  }
		  System.out.println(max);
	}
}

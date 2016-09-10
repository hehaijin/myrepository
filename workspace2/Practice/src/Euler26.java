import java.math.BigDecimal;
import java.math.MathContext;

public class Euler26 {
	
	
public static int checkCycle(String str)
{
	  for(int i=1;i<1000;i++)
	  {
		  if(isCycle(str,i))
			  return i;
	  }
	  return 10001;
	
}
	

public static boolean isCycle(String s,int n)
{
    boolean result=true;
    int start=100;
    while(start+2*n<s.length()-n)
    {
    	if(!s.substring(start,start+n).equals(s.substring(start+n,start+2*n)))
    	{	result=false;
    	
    	}
    	start=start+n;
    	}
    	
    
	 return result;
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimal b1=new BigDecimal(1);
		
		
		//System.out.println(b1.divide(b2,new MathContext(1000)));
     
		//System.out.println(b1.divide(new BigDecimal(11),new MathContext(1000)).toString());
		int cycle=1;
		int d=1;
		for(int i=2;i<1000;i++)
		{
			BigDecimal b=new BigDecimal(i);
			//give it a bit precision but as the result shows for 1/d it's cycle never extends d itself.
			String str=b1.divide(b,new MathContext(10000)).toString(); 
			int l=checkCycle(str);
			if(cycle < l) 
				
				{cycle =l;
				  d=i;
				  System.out.println(d +" has a cycle of " +l);
				}
		}
		System.out.println(d);
		
		
	}

}

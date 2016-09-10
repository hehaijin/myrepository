import java.math.BigInteger;
import java.util.ArrayList;

public class PerfectNumber2 {

	private int upperlimit;
	private ArrayList<BigInteger> list=new ArrayList<>();
	
	public PerfectNumber2(int upperlimit)
	{
		this.upperlimit=upperlimit;
		
		
	}
	
	public void calculate()
	{
		for(int i=1;i<upperlimit;i++)
		{
			int sum=0;
			for(int j=1;j<Math.ceil(i);j++)
			{
			   if(i%j==0)
			   {
				  sum=sum+j;
			   }
			}
				
			if(i==sum)
			{
				long l=(long)i;
				BigInteger bi=BigInteger.valueOf(l);
				
				list.add(bi);
			
	
				
			}
			
			
			
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=10000;
    PerfectNumber2 pf=new PerfectNumber2(limit);
    pf.calculate();
    System.out.println("the upperlimit is: "+pf.upperlimit);
    System.out.println(pf.list);	
    pf.list.forEach(obj->System.out.println(obj));

	}

}

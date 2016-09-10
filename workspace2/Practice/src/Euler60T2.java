import java.util.ArrayList;
import java.util.List;

public class Euler60T2 {

	private List<Long> list=new ArrayList<>();
	private List<List<Long>> concat2=new ArrayList<>();
	

	public Euler60T2(long limit)
	{
		for(long i=3;i<=limit;i++)
		{
			if(NumberTheory.isPrime(i)) 
			{
				list.add(i);
				
			}
			
			
		}
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{  List<Long> temp=new ArrayList<>();
			for(int j=0;j<list.size();j++)
			{
				if(primeConcatable(list.get(i),list.get(j)))
				{
					temp.add(list.get(j));
					
					
				}
			}
			
			concat2.add(temp);

		}
		System.out.println("concat2 initialized");
		
		
		
		
	}
	
	
	
	
	public  boolean primeConcatable(long m,long n)
	{
		String s1=String.valueOf(m);
		String s2=String.valueOf(n);
		return NumberTheory.isPrime(Long.parseLong(s1+s2)) && NumberTheory.isPrime(Long.parseLong(s2+s1));
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long begin=System.currentTimeMillis();
		Euler60T2 eu=new Euler60T2(10000);
		
		
		
		  System.out.println(System.currentTimeMillis()-begin);

	}

}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Euler60 {
	
	private List<Long> list=new ArrayList<>();
  private HashSet<Long> hs=new HashSet<>();
  
  
  
	
	
	
	public Euler60(long limit)
	{
		for(long i=3;i<=limit;i++)
		{
			if(NumberTheory.isPrime(i)) 
			{
				list.add(i);
				
			}
			
			
		}
		System.out.println(list.size());
	
	//this method usually is fast. but in this problem the hashset size grow too fast.	
/*
    String s=String.valueOf(limit);
    
		long t=Long.parseLong(s+s);
		for(long i=3;i<t;i++)
		if(NumberTheory.isPrime(i)) 
		hs.add(i);
		
		System.out.println(hs.size());
	*/
	
	
	
	
		
	}
	

	


public long  calculateSum()
	{ 
		long sumMax=0;
	  for(int i=0;i<list.size();i++)
		for(int j=i;j<list.size();j++)
		{ if(primeConcatable(list.get(i),list.get(j)))
		   { 
			for(int k=j;k<list.size();k++)   
		   	{  if(primeConcatable(list.get(i),list.get(j),list.get(k)))
		   	  {
				for(int l=k;l<list.size();l++)
				{ if(primeConcatable(list.get(i),list.get(j),list.get(k),list.get(l)))
				{ //System.out.println(list.get(i)+ "  "+ list.get(j) + "  " + list.get(k)+ " "+ list.get(l));
					for(int m=l;m<list.size();m++)
					{  ;
						if(primeConcatable(list.get(i),list.get(j),list.get(k),list.get(l),list.get(m)))
						{  long sum= list.get(i)+list.get(j)+list.get(k)+list.get(l)+list.get(m);
							  if(sumMax < sum ) sumMax=sum;
							  System.out.println("find one 5 prime set !!!!!!!  "+list.get(i)+ "  "+ list.get(j) + "  " + list.get(k)+ " "+ list.get(l)+ " "+ list.get(m));
						}
						
						
						
					}
				}
				}
		   	}
		   	}
		   }
		}
		System.out.println("the lowest sum for 5 primes is " + sumMax);
		return sumMax;
		
	}
	

/*
	public void calculateSets()
	{  
		for(int i=0;i<list.size();i++)
			for(int j=i;j<list.size();j++)
			{
				if(primeConcatable(list.get(i),list.get(j)))
				{  concat2[con2i][0]=list.get(i);
				   concat2[con2i][1]=list.get(j);
					 con2i++;
					 for(int k=j;k<list.size();k++)
					 {
						 if(primeConcatable(list.get(i),list.get(j),list.get(k)))
						 {
							  concat3[con3i][0]=list.get(i);
							  concat3[con3i][1]=list.get(j);
							  concat3[con3i][2]=list.get(k);
							  con3i++;
							
							 }
							 
						 }
						 
						 
					 }
					 
					 
					
				}
		  int index=0;
		  while(concat2[index][0] !=0) index++;
			System.out.println("the size of concat2: "+index);
			}
	
	
   
	
	

	*/
	
/*
	
	public long calculateSum()
	{ long sumMin=0;
		for(int i=0;i<concat2.length;i++)
			for(int j=0;j<concat3.length;j++)
			{   
				  long a=concat2[i][0];
			    long b=concat2[i][1];
			    long c=concat3[j][0];
			    long d=concat3[j][1];
			    long e=concat3[j][2];
				
				if(isDistinct(a,b,c,d,e )&& primeConcatable(a,b,c,d,e))
          {  
					   long sum=a+b+c+d+e;
					   System.out.println(sum);
					   if(sumMin>sum) sumMin=sum;
	
           }
				
				
			}
		
		return sumMin;
		
	}
	

*/

	public  boolean primeConcatable(long m,long n)
	{
		String s1=String.valueOf(m);
		String s2=String.valueOf(n);
		return NumberTheory.isPrime(Long.parseLong(s1+s2)) && NumberTheory.isPrime(Long.parseLong(s2+s1));
	
	}
	
	public  boolean primeConcatable(long m,long n, long k)
	{
		
		return primeConcatable(m,n) && primeConcatable(m,k) && primeConcatable(k,n);
		
	}
	
	public  boolean primeConcatable(long m,long n, long k,long l)
	{
		
		return primeConcatable(m,n) && primeConcatable(m,k) && primeConcatable(k,n) && primeConcatable(l,m) && primeConcatable(l,n) && primeConcatable(l,k);
		
	}
	
	public boolean primeConcatable(long m,long n, long k,long l,long h)
	{
		
	return primeConcatable(m,n,k,l) && primeConcatable(m,h) && primeConcatable(n,h) && primeConcatable(h,k) && primeConcatable(h,l);
		
	}
	
	public boolean isDistinct(long m,long n, long k,long l,long h)
	{
		return m!=n&& n!=k && k!=l && l!=h;
		
		
	}
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 long begin=System.currentTimeMillis();
	 
	 
   Euler60 eu=new Euler60(10000);
 //  eu.calculateSets();
   eu.calculateSum();
   
   System.out.println(System.currentTimeMillis()-begin);
	}

}

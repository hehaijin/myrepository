
public class Euler50 {
	
	
	public long primes[];
	public int steps[];
	public long m;
	
	public Euler50(long limit)
	{
		 m=NumberTheory.primesBelow(limit);
		 primes=new long[(int)m];
		 steps=new int[(int)m];
		 int index=0;
		 for(int i=2;i<limit;i++)
		 {
			 if(NumberTheory.isPrime(i))
			 { primes[index]=i;
			   index++;
			 }
		 }
			 
		
	}
	//if can not be written as a sum, return 0. else return the number of steps.
	public int sumSteps(int index)
	{
		int maxStep=0;
		for(int i=0;i<index;i++)
		{
			int t=isSum(index,i);
			if(maxStep<t) maxStep=t;
			
			
			
		}
		
		return maxStep;
		
		
		
	}
	
	public int isSum(int index, int p)
	{ long sum=0;
	  int step=0;
		while(sum<primes[index] )
		{
			sum=sum+primes[p];
			p++;
			step++;
		}
		
		if(sum==primes[index]) return step;
		else return 0;
		
		
	}
	
	
	
	
	public void calculateSteps()
	{
		for(int i=0;i<m;i++)
		{
			steps[i]=sumSteps(i);
			
			
		}
		
	}
	
	
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Euler50 eu=new Euler50(1000000);
  System.out.println(eu.m);
  eu.calculateSteps();
  int maxStep=0;
  for(int i=0;i<eu.m;i++)
  {
	  if(maxStep<eu.steps[i]) 
		   {maxStep=eu.steps[i];
	      System.out.println(eu.primes[i]);    
		   }
	  
	  
	  
	  
  }
  
  
  
  
  

	}

}

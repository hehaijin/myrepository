import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Euler49 {
	private Integer primes[];
	
	public Euler49()
	{ List<Integer> ls=new ArrayList<>();
	  for(int i=1000;i<=9999;i++)
	  {
		  if(NumberTheory.isPrime(i)) ls.add(i);
		  
		  
	  }
	  
	  primes=new Integer[ls.size()];
	  int index=0;
	  for(Integer a: ls)
	  {
		  primes[index]=a;
		  index++;
	  }
	  
	  
	
	}
	
  public boolean isPermutatable(int a)
  {
	  String s=String.valueOf(a);
	  List<String> ls=StringUtility.permutate(s);
	  Iterator<String> it=ls.iterator();
	  while(it.hasNext())
	  { String str=(String) it.next();
	    if(!NumberTheory.isPrime(Integer.parseInt(str))) it.remove();
	  }
	 if(ls.size()<3) return false;
	 int p[]=new int[ls.size()];
	 int index=0;
	 for(String s2: ls)
	 {
		 p[index]=Integer.parseInt(s2);
		 index++;
	 }
	 
	 
	 
	 
	 for(int i=0;i<p.length;i++)
		 for(int j=0;j<p.length;j++)
			 for(int k=0;k<p.length;k++)
			 {
				 if(p[i]-p[j]==p[j]-p[k] && p[i]-p[j] !=0 && p[i]-p[k]!=0 ) 
				 {
					 System.out.println(p[i] + "  "+p[j]+ "   "+p[k]);
					 return true;
				 }
				 
				 
			 }
	  
	  
	  

	  return false;
	  
	  
  }
	
	public void scan() 
	{
		for(int i=0;i<primes.length;i++)
		{
			isPermutatable(primes[i]);
		}
		
		
	}
	
	
	
	
	public static List<String> permutate(String s)
	{
	    List<String> str=new ArrayList<>();
	    permutate("",s,str);
	    return str;
		
	}
	
	public static void permutate(String prefix, String s, List<String> result)
	{
		if(s.length()==0) result.add(prefix);
		for(int i=0;i<s.length();i++)
			permutate(prefix+s.charAt(i), s.substring(0,i)+s.substring(i+1),result);

	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Euler49 eu=new Euler49();
    eu.scan();
    
    
	}

}

import java.util.ArrayList;
import java.util.*;

public class Euler44 {
	private List<Integer> pentagon=new ArrayList<>();
	private HashSet<Integer> hash=new HashSet<>();
	private TreeSet<Integer>  tree=new TreeSet<>();
	private List<Integer> diff=new ArrayList<>();
	private int limit;
	public Euler44(int n)
	{
		limit=n;
		for(int i=1;i<=n;i++)
		{	int t=i*(3*i-1)/2;
		  
			pentagon.add(t);
//			hash.add(t);
			 tree.add(t);
			 System.out.println(t);
		
		}
	
		
	}
	
	
	//searching in a List could be time consuming if list is big.
	//HashSet is really fast.  1.3s for input 10000;
	//the modified check method takes 89 s for input 10000;
	//the arraylist method takes  514s.
	public  boolean isPentagonal(int n)
	{
		
/*
		int max=(int)Math.sqrt(n);
	  int min=(int)Math.sqrt(n*2/3);
		for(int i=min;i<=max;i++)
			if(i*(3*i-1)/2==n) return true;
		return false;
*/	
//	return hash.contains(n);
//		return pentagon.contains(n);
		return tree.contains(n);
	}
	
	
	public void findDiff()
	{
		for(int i=1;i<=limit;i++)
			for(int j=i+1;j<=limit;j++)
			{
				int sum=i*(3*i-1)/2+ j*(3*j-1)/2;
				int sub=j*(3*j-1)/2- i*(3*i-1)/2;
		
				if(isPentagonal(sum) && isPentagonal(sub))
				{ diff.add(sub);
				  System.out.println(i+ "  " +j+" with a difference  "+ sub);
				}
		//		else if(isPentagonal(sum) || isPentagonal(sub))
		//			System.out.println(i+ "  " +j + "has one pentagonal");
			}
		Collections.sort(diff);
		System.out.println(diff.get(0));
		
		
	}
	
	public void show()
	{
		System.out.println(pentagon.get(0));
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  long begin=System.currentTimeMillis();
  Euler44 eu=new Euler44(10000);
  eu.findDiff();
  System.out.println("the time it takes "+ (System.currentTimeMillis()-begin));
	}

}

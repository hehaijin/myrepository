
public class Euler43 {
	public String pand[]=new String[NumberTheory.factorial(10).intValue()];
	int index=0;
	
	
	public Euler43()
	{
		
		permutate("0123456789");
		
	}
	
 
	
	
	public void permutate(String str)
	{
		permutate("",str);
	}
	
	public void permutate(String str1,String str2)
	{ if(str2.length()==0) 
	{
		pand[index]=str1;
		index++;
	}
		
		for(int i=0;i<str2.length();i++)
		{
			
			permutate(str1+str2.charAt(i), str2.substring(0,i)+str2.substring(i+1));
		}
		
		
	}
	
	
 public boolean isSubDiv(String s)
 {
	 if(Integer.parseInt(s.substring(1,4))%2!=0) return false;
	 if(Integer.parseInt(s.substring(2,5))%3!=0) return false;
	 if(Integer.parseInt(s.substring(3,6))%5!=0) return false;
	 if(Integer.parseInt(s.substring(4,7))%7!=0) return false;
	 if(Integer.parseInt(s.substring(5,8))%11!=0) return false;
	 if(Integer.parseInt(s.substring(6,9))%13!=0) return false;
	 if(Integer.parseInt(s.substring(7,10))%17!=0) return false;
	 return true;
 }
	
 public long sum()
 {
	 long sum=0;
	 for(int i=0;i<3628800;i++)
		 if(isSubDiv(pand[i])) sum=sum+Long.parseLong(pand[i]);
	 return sum;
	 
	 
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Euler43 eu=new Euler43();
 
 System.out.println(eu.sum());
 
	}

}

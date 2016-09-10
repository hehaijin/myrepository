
public class Euler4 {

	
	
	
	
	
	
	
	static public boolean isPalindrome(String s)
	 {
	
		if(s.length() <=1) return true;
		return s.charAt(0)==s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1));
		 
	 }
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int m=0;
   for(int i=0;i<1000;i++)
   {
	   for(int j=0;j<1000;j++)
	   {
		   int k=i*j;
		    if(isPalindrome(new Integer(k).toString()) && k>m)  m=k;
	   }
   }
	 System.out.println(m);
	
	}

}

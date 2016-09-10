import java.util.Arrays;

public class Euler24 {

	private String[] per; //the array to hold all the permutations
	private int index=0;  //the index for adding strings.
	
	public Euler24()
	{
		per=new String[3628800];     //initialize the array. equals 10!.
   
	}
	
	

	
	
	
	
//this recursion is different because it returns a lot of results.
	//the the common permutate("abc")= a+permutate("bc") schema should be a little different.
	// also notice that it use overloading to simplify the code.
	
	public  void permutation(String str)
	{
		permutation("",str);
	}
	
	
	public void permutation(String prefix,String str)
	{
		 int n=str.length();
		 if(n==0) addToArray(prefix);
		 else{
			 
			 for(int i=0;i<n;i++)
				 permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
			 
		 }
		
		
	}

	
	public void addToArray(String str)
	{
		per[index]=str;
		index++;
		
	}
	
	
  public void show(int i)
  {
	  System.out.println(per[i]);
  }
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Euler24 eu=	new Euler24();
	eu.permutation("0123456789");
  
	eu.show(999999);// this is the millionth element. not 1000000.
	}

}

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Euler22 {
	
	 public ArrayList<String> str=new ArrayList<>();
	 public String names[];
   public Euler22()
   {
	    InputStream input=this.getClass().getResourceAsStream("names.txt");
	    Scanner sc=new Scanner(input);
	  
	    String s=sc.nextLine();
	   
	    int n=0;
	    int index=-1;
	    while(s.indexOf(",",index+1)!=-1)
	    {
	    	n++;
	    	if(n==1)
	    	str.add(s.substring(1, s.indexOf(",",index)-1));
	    	else
	    		str.add(s.substring(index+2, s.indexOf(",",index+1)-1));
	    	index=s.indexOf(",", index+1);
	    }
	    str.add(s.substring(index+2,s.length()-1));
	    names=new String[str.size()];
	   for(int i=0;i<str.size();i++)
	   {
		   names[i]=str.get(i);
	   }
	   
	   Arrays.sort(names);
	   
		  
	   
	   
   }
	
   public int sum()
   {
	   int sum=0;
	   for(int i=0;i<names.length;i++)
	   {
		   sum=sum+(i+1)* nameworth(names[i]);
	   }
	   return sum;
   }
   
   
   public int nameworth(String s)
   {
	   int sum=0;
	   for(int i=0;i<s.length();i++)
		   sum=sum+s.charAt(i)-64;
	   return sum;
		   
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euler22 eu= new Euler22();
    System.out.println(eu.sum());
	}

}

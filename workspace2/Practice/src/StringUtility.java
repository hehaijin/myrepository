import java.util.ArrayList;
import java.util.List;

public class StringUtility {

	//returns a List of Strings that contains all the permutation of this String. 
	
	public static List<String> permutate(String s)
	{
	    List<String> str=new ArrayList<>();
	    permutate("",s,str);
	    return str;
		
	}
	
	
   private static void permutate(String prefix, String s, List<String> result)
	{
		if(s.length()==0) result.add(prefix);
		for(int i=0;i<s.length();i++)
			permutate(prefix+s.charAt(i), s.substring(0,i)+s.substring(i+1),result);

	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

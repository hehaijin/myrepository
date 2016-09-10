
public class Euler17 {

	static public String convert(int a)
	{
		String s=String.valueOf(a);
		String result="";
		int l=s.length();
		if(l==3) 
		{
			if(s.charAt(1)=='1')
				result=toWord(s.charAt(0)-48)+"hundred"+"and"+toTeen(s.substring(1));
			
			
			
			else if( s.substring(1).equals("00"))
				result = toWord(s.charAt(0)-48)+"hundred";
			else 		
			result=toWord(s.charAt(0)-48)+"hundred"+"and"+toTen(s.charAt(1)-48)+toWord(s.charAt(2)-48);	
	}
		if(l==2)
		{
			if(s.charAt(0)=='1')
				result=toTeen(s);
			else 
				result=toTen(s.charAt(0)-48)+toWord(s.charAt(1)-48);
		}
		if(l==1)
			result=toWord(s.charAt(0)-48);
		return result;
	}
	
	public static String toTen(int i)
	{
		switch(i)
		{	case 1: 
			return "";
	
			case 2: 
			return "twenty";
	
			case 3: 
				return "thirty";
			
			case 4:
				return "fouty";
			
			case 5:
				return "fifty";
	
			case 6:
				return "sixty";
	
			case 7: 
				return "seventyy";

			case 8:
				return "eighty";
	
			case 9: 
				return "ninty";
				
			case 0:
			return "";

			default:
				return "wrong input";
			
		}
	}
	
	
	public static String  toTeen(String s)
	{
		switch(s)
		{
		case "10":
			return "ten";
		case "11":
			return "eleven";
		case "12": 
			return "twelve";
	
			case "13": 
				return "thirteen";
			
			case "14":
				return "fourteen";
			
			case "15":
				return "fifteen";
	
			case "16":
				return "sixteen";
	
			case "17": 
				return "seventeen";

			case "18":
				return "eighteen";
	
			case "19": 
				return "nineteen";
	   default:
		   return "wrong input";
		
		
		
		}
		
		
		
	}
	
	
	
	static public String toWord(int i)
	{
		switch(i)
		{	case 1: 
			return "one";
	
			case 2: 
			return "two";
	
			case 3: 
				return "three";
			
			case 4:
				return "four";
			
			case 5:
				return "five";
	
			case 6:
				return "six";
	
			case 7: 
				return "seven";

			case 8:
				return "eight";
	
			case 9: 
				return "nine";
		
			case 0:
			return "";

			default:
				return "wrong input";
			
		}
			
	}
	    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int sum=0;
  for(int i=1;i<=999;i++)
  {
	  sum=sum+convert(i).length();
  }
  sum=sum+"onethousand".length();
  System.out.println(sum);
  
  
  System.out.println(convert(110));
	}

}

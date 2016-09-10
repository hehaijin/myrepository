
public class Euler40 {

	private StringBuilder sb=new StringBuilder(); 
	
	public Euler40(int max)
	{
		for(int i=1;i<=max;i++)
		{
			sb.append(String.valueOf(i));
			
			
		}
		
		
	}
	
	
	public int length()
	{
		return sb.toString().length();
	}
	
	public int get(int i)
	{
		return (sb.toString().charAt(i)-48);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Euler40 eu=new Euler40(1000000);
		System.out.println(eu.get(0)*eu.get(9)*eu.get(99)*eu.get(999)*eu.get(9999)*eu.get(99999)*eu.get(999999));
		
 
		
	}

}

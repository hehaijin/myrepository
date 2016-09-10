
public class Multiple35 {
	
	public static int sum(int a)
	{
		int sum=0;
		for(int i=1;i<a;i++)
			if(check35(i)) sum=sum+i;
		
		
		
		return sum;
	}
	
	
	public static boolean check35(int a)
	{
		return a%5==0|| a%3==0;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println(sum(1000));
		
	}

}

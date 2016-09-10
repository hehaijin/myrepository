
public class Euler2 {
	
	public static int sum(int limit)
	{
		int a=1;
		int b=2;
		int c=0;
		int sum=2;
		while(c<limit)
		{ if(c%2==0) sum=sum+c;
			c=a+b;		
			a=b;
			b=c;
		}
		
   return sum;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(sum(4000000));
	}

}

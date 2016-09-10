
public class Factorial {
	
	
	static int Factorial(int n)
	{
		  if(n==1) return 1;
		  int m=Factorial(n-1);
		  return m*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(Factorial(2));
	}

}

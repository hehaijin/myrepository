
public class Euler9 {

	public static boolean checkTriplet(int a,int b,int c)
	{
		int min=Math.min(a, Math.min(b, c));
		int max=Math.max(a, Math.max(b, c));
		int middle=a+b+c-min-max;
		return (min*min+middle*middle==max*max);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		
		for(int i=1;i<1000;i++)
		{
			for(int j=1;j<1000;j++)
			{
				if(i+j<1000 && checkTriplet(i,j,1000-i-j))
					{int p=i*j*(1000-i-j);
					if(p>f) f=p;
					}
			}
				
		}
		System.out.println(f);

	}

}

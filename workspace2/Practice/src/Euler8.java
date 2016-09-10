import java.util.Scanner;

public class Euler8 {
  public String s;
	public Euler8()
	{ s="";
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{String t=sc.nextLine();
		 s=s+t.substring(0, t.length());
		}
		
		
	}
	
	
	public long product()
	{
		long p=0;
		for(int i=0;i<=s.length()-13;i++)
		{ long t=1;
		  for(int j=0;j<13;j++)
			  t=t*(s.charAt(i+j)-48);
			if(t>p) p=t;
		}
		
		return p;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(new Euler8().product());	

	}

}

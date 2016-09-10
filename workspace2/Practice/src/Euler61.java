import java.util.ArrayList;
import java.util.List;

public class Euler61 {
  public List<List<Integer>> list=new ArrayList<>();
	public List<Integer> tri=new ArrayList<>();
	public List<Integer> squ=new ArrayList<>();
	public List<Integer> pen=new ArrayList<>();
	public List<Integer> hex=new ArrayList<>();
	public List<Integer> hep=new ArrayList<>();
	public List<Integer> oct=new ArrayList<>();
	String per="";//use this String as an indicator for permutation of the 5 lists.
	
	
	public Euler61()
	{
		for(int i=1;i<=1000;i++)
		{
			int t=i*(i+1)/2;
			if(t>=1000 && t<=9999)
				tri.add(t);
			
		}
		System.out.println("triangle size "+ tri.size());
		for(int i=1;i<=1000;i++)
		{
			int t=i*i;
			if(t>=1000 && t<=9999)
				squ.add(t);
			
		}
		System.out.println("square size "+ squ.size());
		
		for(int i=1;i<=1000;i++)
		{
			int t=i*(3*i-1)/2;
			if(t>=1000 && t<=9999)
				pen.add(t);
			
		}
		System.out.println("pentagol size "+ pen.size());
		
		
		
		
		for(int i=1;i<=1000;i++)
		{
			int t=i*(2*i-1);
			if(t>=1000 && t<=9999)
				hex.add(t);
			
		}
		System.out.println("hex size "+ hex.size());
		for(int i=1;i<=1000;i++)
		{
			int t=i*(5*i-3)/2;
			if(t>=1000 && t<=9999)
				hep.add(t);
			
		}
		System.out.println("hep size "+ hep.size());
		for(int i=1;i<=1000;i++)
		{
			int t=i*(3*i-2);
			if(t>=1000 && t<=9999)
				oct.add(t);
			
		}
		System.out.println("oct size "+ oct.size());
		
		list.add(tri);
		list.add(squ);
		list.add(pen);
		list.add(hex);
		list.add(hep);
		list.add(oct);
		
		
		
	}
	


	//for each specific permutation, do the seaching for cyclic numbers.
	public void calculate2()
	{ 
		for(int i=0;i<tri.size();i++)
		for(int j=0;j<list.get(per.charAt(0)-48).size();j++)
		{
			String a=String.valueOf(tri.get(i));
			String b=String.valueOf(list.get(per.charAt(0)-48).get(j));
			if(a.substring(2).equals(b.substring(0,2)))
			{
				for(int k=0;k<list.get(per.charAt(1)-48).size();k++)
				{
					String c=String.valueOf(list.get(per.charAt(1)-48).get(k));
					if(b.substring(2).equals(c.substring(0,2)))
					{
						for(int l=0;l<list.get(per.charAt(2)-48).size();l++)
						{ String d=String.valueOf(list.get(per.charAt(2)-48).get(l));
							if(c.substring(2).equals(d.substring(0,2)))
							{
								for(int m=0;m<list.get(per.charAt(3)-48).size();m++)
								{
									String e=String.valueOf(list.get(per.charAt(3)-48).get(m));
									if(d.substring(2).equals(e.substring(0,2)))
											{  //System.out.println(a +" "+b+" "+ c+" "+d+" "+e);
									   	for(int n=0;n<list.get(per.charAt(4)-48).size();n++)
									   	{
									   		String f=String.valueOf(list.get(per.charAt(4)-48).get(n));
									   		if(e.substring(2).equals(f.substring(0,2)) && f.substring(2).equals(a.substring(0, 2)))
									   				{
									   			     System.out.println(a +" "+b+" "+ c+" "+d+" "+e+" "+f);
									   			     System.out.println(Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d)+Integer.parseInt(e)+Integer.parseInt(f));
									   				}
									   	}
										
										
										
											}
									
									
								}
								
								
							}
						}
						
						
					}
					
				}
				
				
			}
			
			
		}
			

			
	}
	
	//generate permutation sequence and call calculate2.
	public void calculateAll()
	{
		List<String> ls=StringUtility.permutate("12345");
		
		for(String s: ls)
		{
			per=s;
			
			calculate2();
			
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Euler61 eu=new Euler61();
  eu.calculateAll();
  
	}

}

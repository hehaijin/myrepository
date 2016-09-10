import java.util.ArrayList;
import java.util.List;

public class Euler51 {
	public List<Integer> ls=new ArrayList<>();
	
	

	
	
	public void checkPrime1(int number)
	{
		String str=String.valueOf(number);
		for(int i=0;i<str.length();i++)
		{ int count=0;
			for(int j=0;j<=9;j++)				
			{ 
				String s=str.substring(0,i)+String.valueOf(j)+str.substring(i);
				if(s.charAt(0)!='0')
				{
				if(NumberTheory.isPrime(Integer.parseInt(s))) 
					{count++;
				  
					}
				}
				
			}
			if(count==8) 
			{
				if(i==0) ls.add(Integer.parseInt("1"+str));
				else ls.add(Integer.parseInt(str.substring(0,i)+"0"+str.substring(i)));
			}
		}
			
		
	}
	
	public void checkPrime2(int number)
	{
		String str=String.valueOf(number);
		for(int i=0;i<str.length();i++)
	  for(int k=i;k<str.length();k++)
		{ int count=0;
			for(int j=0;j<=9;j++)				
			{ 
				String s=str.substring(0,i)+String.valueOf(j)+str.substring(i,k)+String.valueOf(j)+str.substring(k);
				if(s.charAt(0)!='0')
				{
				if(NumberTheory.isPrime(Integer.parseInt(s))) 
					{count++;
				  
					}
				}
				
			}
			if(count==8) 
			{
				if(i==0) ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(1)+str.substring(i,k)+String.valueOf(1)+str.substring(k)));
				else ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(0)+str.substring(i,k)+String.valueOf(0)+str.substring(k)));
			}
		}
			
		
	}
	
	public void checkPrime3(int number)
	{
		String str=String.valueOf(number);
		for(int i=0;i<=str.length();i++)
	  for(int k=i;k<=str.length();k++)
		for(int m=k;m<=str.length();m++)
		{ int count=0;
			for(int j=0;j<=9;j++)				
			{ 
				String s=str.substring(0,i)+String.valueOf(j)+str.substring(i,k)+String.valueOf(j)+str.substring(k,m)+String.valueOf(j)+str.substring(m);
				if(s.charAt(0)!='0')
				{
				if(NumberTheory.isPrime(Integer.parseInt(s))) 
					{count++;
				    
					}
				}
				
			}
			if(count==8) 
			{ System.out.println(number+ " "+i + " "+ k+ " "+ m);
				if(i==0) ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(1)+str.substring(i,k)+String.valueOf(1)+str.substring(k,m)+String.valueOf(1)+str.substring(m)));
				else ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(0)+str.substring(i,k)+String.valueOf(0)+str.substring(k)+String.valueOf(0)+str.substring(m)));
			}
		}
			
		
	}
	public void checkPrime4(int number)
	{
		String str=String.valueOf(number);
		for(int i=0;i<str.length();i++)
	  for(int k=i;k<str.length();k++)
		for(int m=k;m<str.length();m++)
		for(int l=m;l<str.length();l++)
		{ int count=0;
			for(int j=0;j<=9;j++)				
			{ 
				String s=str.substring(0,i)+String.valueOf(j)+str.substring(i,k)+String.valueOf(j)+str.substring(k,m)+String.valueOf(j)+str.substring(m,l)+String.valueOf(j)+str.substring(l);
				if(s.charAt(0)!='0')
				{
				if(NumberTheory.isPrime(Integer.parseInt(s))) 
					{count++;
				  
					}
				}
				
			}
			if(count==8) 
			{
				if(i==0) ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(1)+str.substring(i,k)+String.valueOf(1)+str.substring(k,m)+String.valueOf(1)+str.substring(m,l)+String.valueOf(1)+str.substring(l)));
				else ls.add(Integer.parseInt(str.substring(0,i)+String.valueOf(0)+str.substring(i,k)+String.valueOf(0)+str.substring(k,m)+String.valueOf(0)+str.substring(m,l)+String.valueOf(0)+str.substring(l)));
			}
		}
			
		
	}
	
	//none
	public void check1()
	{
		for(int i=1;i<=1000000;i++)
		{
			checkPrime1(i);
		}
		
	}
	
	public void check2()
	{
		for(int i=1;i<=100000;i++)
		{
			checkPrime2(i);
		}
		
	}
	
	public void check3()
	{
		for(int i=1;i<=10000;i++)
		{
			checkPrime3(i);
		}
		
	}
	
	public void check4()
	{
		for(int i=1;i<=10000;i++)
		{
			checkPrime4(i);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Euler51 eu=new Euler51();
		eu.check3();
	//	eu.check1();
		System.out.println(eu.ls);
		

		

	}

}

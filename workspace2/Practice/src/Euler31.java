
public class Euler31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long begin=System.currentTimeMillis();
		int t=0;
		for(int i=0;i<=200;i++)
			for(int j=0;j<=100;j++)
		    for(int k=0;k<=40;k++)
		    	for(int l=0;l<=20;l++)
		    		for(int m=0;m<=10;m++)
		    			for(int n=0;n<=4;n++)
		    				for(int o=0;o<=2;o++)
		    					for(int p=0;p<=1;p++)
		    						if(i+2*j+5*k+10*l+20*m+50*n+100*o+200*p==200) t++;
		
		
		System.out.println(t);
		
	  System.out.println(System.currentTimeMillis()-begin);

	}

}

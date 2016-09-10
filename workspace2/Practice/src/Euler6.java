
public class Euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma, sumb;
		suma=sumb=0;
		for(int i=1;i<=100;i++)
			{suma=suma+i*i;
		  sumb=sumb+i;
			}
		System.out.println(suma-sumb*sumb);
		

	}

}

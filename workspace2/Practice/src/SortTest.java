import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub[
		int[] c= {3,9,2,3,3,6};
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			System.out.println();
		}
		
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			System.out.println();
		}
		
		

	}

}

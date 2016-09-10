import java.util.Map;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("available processors "+ rt.availableProcessors());
		System.out.println("free memory "+ rt.freeMemory());
		System.out.println("total memory "+ rt.totalMemory());

		   System.out.println(System.getenv("JAVA_HOME"));
		

	}

}

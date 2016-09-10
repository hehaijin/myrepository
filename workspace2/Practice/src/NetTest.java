import java.net.InetAddress;

public class NetTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getByName("www.crazyit.org");
		System.out.println(ip.getCanonicalHostName());
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
	

	}

}

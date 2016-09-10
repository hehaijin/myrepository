import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		ArrayList<String> array=new ArrayList<>();
		array.add(s);
		System.out.println(s.hashCode());
		System.out.println(array.get(0)==s);


	}

}



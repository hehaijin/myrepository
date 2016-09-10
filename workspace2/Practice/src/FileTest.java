import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FileTest {
	
	private File file;

	
	public FileTest(String str)
	{
		file=new File(str);
	}

	public static void listDir(File file)
	{
		String str[]=file.list();
		for(String s: str)
		{
			System.out.println(s);
		}
		
		for(String s: str)
		{
		if(new File(file,s).isDirectory())
			{
		  listDir( new File(file,s) );
			}
		  
		}
			

		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("Please type in the file path: ");
	//	Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
	//	sc.close();
	//	FileTest.listDir(new File(str));
	
		  File file=new File("C:\\Downloads");
		  String[] str=file.list();
		  for(String s: str)
		  { System.out.println(s);
		  }
		  ArrayList<?> list[]=new ArrayList<?>[10];
	   
      System.out.println(new File(file.getAbsolutePath()+"\\"+str[0]).getAbsolutePath());
      
  
      
     
}
	}



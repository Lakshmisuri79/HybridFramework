package filehandlingdemo;
import java.io.*;

public class FileClassMethods {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\laksh\\Desktop\\Lakshmi\\madhav.txt");
		if(f.exists())
		{
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.length());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getParentFile());
			System.out.println(f.hashCode());
		
		}
		
		else
		{
			System.out.println("file does not exits");
		}
		
	}

}

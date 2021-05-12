package filehandlingdemo;
import java.io.*;


public class FileWriterDemo {

	public static void main(String[] args) {
		//creating the FileWriter class object
		//FileWriter is predefined class
		try {
			FileWriter fw=new FileWriter("C:\\Users\\laksh\\Desktop\\Lakshmi\\madhav1.txt");
			fw.write("My name is laskhmi suri");
			fw.close();
			System.out.println("sucessfully updated"); 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

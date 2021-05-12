package filehandlingdemo;
import java.io.*;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		
		try {
			File f=new File("C:\\Users\\laksh\\Desktop\\Lakshmi\\madhav1.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				String str= sc.nextLine();
				System.out.println(str);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

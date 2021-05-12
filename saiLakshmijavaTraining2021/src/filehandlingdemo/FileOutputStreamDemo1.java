package filehandlingdemo;

import java.io.*;

public class FileOutputStreamDemo1 {

	public static void main(String[] args)  {
		try {
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\laksh\\Desktop\\Lakshmi\\filehandling1\\fileoutputroutputstream1.txt");
		String s="Lakshmi java trainning";
		byte b[]=s.getBytes();
			
			fout.write(b);
			fout.close();   
			System.out.println("sucess");
		}
	
		
		
	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

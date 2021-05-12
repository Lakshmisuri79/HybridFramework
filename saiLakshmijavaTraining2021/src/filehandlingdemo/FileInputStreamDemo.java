package filehandlingdemo;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// byte overiented (images, audio,video data reading from file to java file)
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\laksh\\Desktop\\Lakshmi\\filehandling1\\fileoutputroutputstream1.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

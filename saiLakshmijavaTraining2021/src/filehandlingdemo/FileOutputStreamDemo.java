package filehandlingdemo;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// store premitive value/bytes/ single charecters/ in the file or outputting the data
		// from java program to file
		// creating a object for Fileoutputstream object
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\laksh\\Desktop\\Lakshmi\\filehandling1\\fileouputstream.txt");

			fout.write(66);//converts charecter so out out should be A
			fout.close();
			System.out.println("sucess");

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}

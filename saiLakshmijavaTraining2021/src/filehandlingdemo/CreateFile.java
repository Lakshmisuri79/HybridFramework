package filehandlingdemo;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) {
		try
		{
			//creatating file class object
			//file class is pre defined class
			File f=new File("C:\\Users\\laksh\\Desktop\\Lakshmi\\madhav2.txt");
			if(f.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already exits");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

 

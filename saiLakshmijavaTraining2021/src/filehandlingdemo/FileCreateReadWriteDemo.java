package filehandlingdemo;

import java.io.*;
import java.util.Scanner;

public class FileCreateReadWriteDemo {

	static File oldfile = new File("C:\\Users\\laksh\\Desktop\\Lakshmi\\Automation\\Automation notes\\Readmyfile.txt");
	static File newfile; 
	public static void main(String[] args) {

		// creating file calss object

		try {
			Scanner sc = new Scanner(oldfile);
			newfile = new File("C:\\Users\\laksh\\Desktop\\Lakshmi\\Automation\\madhav .txt");
	
			if (newfile.createNewFile()) {
				
				System.out.println("There is no file with this name and this new file will be created");
				FileWriter fw = new FileWriter(newfile);
				fw.write("::::::::::::::::::::::");
				

				while (sc.hasNextLine()) {
					String str = sc.nextLine();
					fw.write(str);
					//System.out.println(str);
				}
				fw.close();
				sc.close();
				
			}
			
			else
			{
				System.out.println("There is already file with this name and no new file will be created");
				
				FileWriter fw = new FileWriter(newfile);

				while (sc.hasNextLine()) {
					String str = sc.nextLine();
					System.out.println(str);
				fw.append(str);
				}
				fw.close();
				sc.close();
			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}

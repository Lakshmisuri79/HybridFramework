package controlstructuresprograms;
import java.util.Scanner;


public class IfEleseIfDEmoProgram {
	
	private void numbers()
	{
		
		//creating an object for scanner class
		//scannner class is in java.uti.package this class contains non staic methods, variabels.
		Scanner numobj=new Scanner(System.in);
		//declare the local variables synatax:datatype variable name
		double num=00;
		
		System.out.println("Enter the number");
		num=numobj.nextDouble();
		
				
		if(num>=0&&num<=9)
		{
			System.out.println("The  given number is one digit");
			}
		else if(num>=10&&num<=99)
			{
				System.out.println("the given number is two digit");
			}
		else if(num>=100&&num<=999)
			{
				System.out.println("the given number is three digit");
			}
		else if(num>=1000&&num<=9999)
			{
				System.out.println("The given number is fout digit");
			}
		else if(num>=10000&&num<99999)
			{
				System.out.println("the given number is five digit");
			}
		else
			{
				System.out.println("The number is above five digits");
			}
		
	}
	

	public static void main(String[] args)
	{
		//creating an object for the non static members of the class
		IfEleseIfDEmoProgram ifobj=new IfEleseIfDEmoProgram();
		ifobj.numbers();
		

	}
}

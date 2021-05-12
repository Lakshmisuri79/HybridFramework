package controlstructuresprograms;
import java.util.Scanner;


public class SwitchStatement {
	public void calculator(char operator)
	{
		   //in this program i am entering the data from key board
		   //for this i need to import scanner class
		   //scanner class is a non static class so that i need to crate an object for that class
		   //syntax of creating an object is: classname objref=new classname();
		   //scanner class system.in is inputting the values from the key board
		Scanner scobj=new Scanner(System.in);
		    //local variables declarration synatax datatype variable name;
		double num1, num2, output=0.0; 
			
		System.out.println("Enter your number");
		//local variable assingning syntax datatype variablename=value;
		//nextDouble()-- here we are inputing the double type value from keyboard and we are storimg that data in num1
		num1=scobj.nextDouble();
		System.out.println("Enter your second number");
				num2=scobj.nextDouble();
				
		scobj.close();
		switch(operator)
		{
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case'*':
			output=num1*num2;
			break;
		case'/':
			output=num1/num2;
			break;
			default:
				System.out.println("entered wring operator");
				}
		System.out.println("num1:"+" "+"num2:"+" "+output);
	}

		public static void main(String[] args)
		
		{
		
			//calling non static methods
			//creating object
			SwitchStatement swstobj=new SwitchStatement();
			
		swstobj.calculator('+');
		
			
			
		}
			
					

	
	
		
	}
	




package controlstructuresprograms;
import java.util.Scanner;



public class DoWhileLoopPrograms {
	
	public static void addNumbers()
	{
		int value;
		int sum=0;
		char choice;
		Scanner scobj=new Scanner(System.in);
		do
		{
			System.out.println("Enter the value");
			value=scobj.nextInt();
			sum=sum+value;
			System.out.println("ENTER THE Y FOR YES OR N FOR NO");
			choice=scobj.next().charAt(0);
		}
			while((choice=='Y')||(choice=='y'));
				{
				System.out.println("SUM OF THE INTEGERS:"+sum);
				}
		System.out.println("************************END OF THE METHOD*******************************");
	}
	
	
	
	

	public static void main(String[] args) {
		addNumbers();
	}

}



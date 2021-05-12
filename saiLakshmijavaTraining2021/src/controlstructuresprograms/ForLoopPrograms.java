package controlstructuresprograms;

import java.util.Scanner;

public class ForLoopPrograms {
	
	 //This method prints sum of the ntural numbers
	 
	public static int findSum(int n)
	{
	System.out.println("SUM OF N NATURAL NUMBERS");
	int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;
				
				
			}
			return sum;
			//System.out.print(sum+"\t");
			//System.out.println();
			//System.out.println("**************end of the method************");
			
	}
	//This method prints ascicharecters of z to a
	
	private void asciCharecterOfzToa()
	{
		System.out.println("I AM PRINTING ASCI CHARECTERS OF z to a");
		int i='z';
		for(i='z'; i>='a'; i--)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("***************end of the method***********");
	}
	
	public static void alphabetsAtoZ()
	{
		System.out.println("I AM PRINTING CAPITAL LETTERS FROM A TO Z");
		char c='A';
		for( c='A'; c<='Z';c++)
		{
			System.out.print(c+"\t");
		}
		
		System.out.println("");
		System.out.println("**********************END OF THE METHOD***************");
	}
	
	//this method prints even numbers
	protected static void printEvenNumbers(int n)
	{
		System.out.println(" I AM PRINTING EVEN NUMBERS OF");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+"\t");
			}
			
		}
		System.out.println(" ");
		System.out.println("**************END OF THE METHOD**********");
	}
	
	//This method prints factorial value 
	protected static void factorialValue(int n)
	{
		System.out.println("I AM PRINTIONG FACTORIAL VALUE OF:");
		int i=1;
		int fact=1;
		for(i=1;i<=n;i++) //1<=3-T/2<=3--T/3<=3-T/
		{
			
			fact=fact*i;//1*1/1*2/2*3
			//System.out.print(+fact +"\t");
						
		}
		System.out.println("FACTORIAL  VALUE OF "+n+": " +fact +"\t");
		System.out.println("*******************END OF THE METHOD***********************");
		System.out.println("");
		
		
	}
	
	//This method prints odd numbers
	
	public static void oddNumbers(int n)
	{
		System.out.println("I AM PRINTIONG ODD NUMBERS");
		int i=n;
		
		for(i=n;i>=1;i--)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
						
			}
			
		}
		System.out.println("");
		System.out.println("*******************END OF THE METHOD***********************");
		
		
	}
	
	
	//this method returns multiplication table using scanner class
	
	
	public void mutiplicationTable()
	{
		
		Scanner obj=new Scanner(System.in);
		int a=0;
		System.out.println("ENTER THE NUMBER");
		a=obj.nextInt();
		obj.close();
		System.out.println(a+" "+ "TABLE SHOWING BELOW");
		int i=1;
		int m=0;
				for(i=1; i<=10; i++)
				{
					m=a*1;
					System.out.println(+a+" "+" *"+" "+i+" ="+" "+m);
				}
				
				System.out.println("");		
				System.out.println("*******************END OF THE METHOD***********"); 			
		
		
	}
	//this method returns divisible of 5
	
	private static void divisable(int n)
	{
		System.out.println("I AM PRINTING FIVE DIVISABLE");
		int i=1;
		
		for(i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+"\t");
			}
		}System.out.println();
		System.out.println("**************END OF THE METHOD********************");
		
	}
	
	

			
	public static void main(String[] args) {
		//calling return type static methods
		//datatype variablename=returntypestatic method();
		
	int natsum=findSum(10);
	System.out.println(natsum);
	System.out.println("*******************END OF THE METHOD***********************");
	//creating object for non static methods for calling
	ForLoopPrograms forobj=new ForLoopPrograms();
		forobj.asciCharecterOfzToa();
	
	printEvenNumbers(20);
		factorialValue(4);
		oddNumbers(23);
		alphabetsAtoZ();
		divisable(120);
	
		
		
		
		
		
	
		
	}

}

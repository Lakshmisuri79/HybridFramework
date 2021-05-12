package controlstructuresprograms;

import java.util.Scanner;

public class ArrayProgramsDemo {
	
	
	public static  void daysDisplay()
	{
		//Declaring array and initilizing of an array syntax:
		//datatype arrayname[]=new daatype[]{e1,e2,e3,e4,}
		String days[]=new String[] {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		for(int s=0; s<=days.length-1;s++)
		{
			System.out.print(days[s]+"\t");
			
		}System.out.println("**************************END OF THE METHOD****************");
	}
	
	/*
	 * This method printing sum of all array elements
	 * 	 */
	protected static void sumOfNumbers()
	{
		int [] num= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0; i<=num.length-1;i++)
		{
			sum=sum+i;
			
		}
		System.out.println( "sum of given array is "+sum);
		System.out.println();
		System.out.println("**************************END OF THE METHOD****************");
	}
	public static void  twodimentionalArray()
	{
		System.out.println("I AM PRINTING THE NUMBERS USING TWO DIMENTIONAL ARRAY");
		//syntax of two dimentional array
	//	datatype[][] arrayname=new datatype[rows][colums]
		//assigning values syntas:
		int [][]values={ {10,20,30,40},{50,60,70,80},{80,90,100,110},{120,130,140,150}};	
		
		
		System.out.println("");
		for(int rows=0; rows<4;rows++)
		{
			for(int col=0;col<4;col++)
			{
				//System.out.println(values.length);
			
			 System.out.print(values[rows][col]+" ");
			}
			System.out.println();
		
		}
		
				
		System.out.println("");
		System.out.println("I AM PRINTING NUMBERS REVERSE USING TWO DIMENTIONAL ARRAY ");	
		for(int rows1=values.length-1;rows1>=0; rows1--)
		{
			for(int col1=values.length-1;col1>=0;col1--)
			{
				System.out.print(values[rows1][col1]+" ");
			}
			System.out.println();
		}
		
				System.out.println("**************************END OF THE METHOD****************");
	}
	
	public static  void twoDimentionalProgram1()
	{
		//syntax of two dimentional array is datatype[][] arrayname=new datatype[rows][cols];
		char[][] charecters= {{'a','s','d','f'},{'l','k','j','h'},{'q','w','e','r'},{'p','o','i','u'}};
	
		for(int row=0;row<=charecters.length-1;row++)
			{
				for(int col=0; col<=charecters.length-1;col++)
				{
					System.out.print(charecters[row][col]);
				}
				System.out.println();

		}
			System.out.println();
			
			//for(int row1=charecters.length-1;row1>=0;row1--)
			for(int row1=0; row1<=charecters.length-1; row1++)
			{
				for( int col1=charecters.length-1; col1>=0; col1--)
				{
					System.out.print(charecters[row1][col1]);
				}
				System.out.println();

		}
			System.out.println("");
	}
	
	//This method prints the fruits names using array
	private void fruits()
	{
		//syntax of declaring  and creating object for an array
		String[] fruits=new String[5];
		//insert the elements to an array
		fruits[0]="Apple";
		fruits[1]="Pineapple";
		fruits[2]="Orange";
		fruits[3]="Banana";
		fruits[4]="Mango";
		for(int s=0; s<=fruits.length-1; s++)
		{
			System.out.print(fruits[s]+"\t ");
		}
		
			System.out.println();
			System.out.println("**************END OF THE METHOD*************");
	}
	
	
	public static void copyNumber()
	{
		int SIZE=5;
		int[] num=new int[SIZE];
		int[] num1=new int[SIZE];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number "+SIZE);
		//get the value in num
		for(int i=0;i<SIZE;i++)
		{
			num[i]=obj.nextInt();
		}
		//copy the value from num to num1
		for(int i=0; i<SIZE; i++)
		{
			 num1[i]=num[i];
		}
		//display the num1 
		System.out.println("ELEMENTS OF NUM1 ARE:");
		for(int i=0; i<SIZE; i++)
		{
			System.out.println(num1[i]);
		}
	}

	public static void main(String[] args) {
		daysDisplay();
		twodimentionalArray();
		// creating object for non static method
		 //syntax:classname objref=new classname();
		 ArrayProgramsDemo fruobj=new ArrayProgramsDemo();
		 fruobj.fruits();
		 sumOfNumbers();
		 twoDimentionalProgram1();
		 copyNumber();
		 
	}

}


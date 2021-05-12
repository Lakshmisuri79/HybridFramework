package controlstructuresprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoProgram {
	private void printCharDemo()
	{
		System.out.println("I AM PRINTIONG CHAR ARRAY");
		//DECLARING AND ASSIGN AN ARRAY OBJECT
		//SYNTAX:datatype[]arrayname=new datatype[size];
		char[] NAME=new char[6];
				//insert the elements in to the array
				//syntax:arrayname[index]=value;
				
		NAME[0]='M';
		NAME[1]='A';
		NAME[2]='D';
		NAME[3]='H';
		NAME[4]='A';
		NAME[5]='V';
		//fetch the charecter of array
		System.out.println(NAME[3]);
		//fetch the lastelement index of the array:arrayname.length-1
		System.out.println("last element of the index is: "+(NAME.length-1));
		//how to print an aarray using for each loop: (datatype variablename:arryname){logic};
		 System.out.println("PRINTING THE ARRAY USING FOR EACH LOOP");
		 
		 for(char v:NAME)
		 {
			 System.out.print(v+" \t");
				
		 }
				
		System.out.println();
		System.out.println("**********End of the printing array using for each loop************");
		
		//print array using for loop
		System.out.println("print array using for loop" );//for(initilization;condition;incremenrt/decrement)
		for(int i=0;i<NAME.length;i++)
		{
			System.out.print(NAME[i]+"\t");
		}
		System.out.println();
		System.out.println("**********End of the printing array using for  loop************");
		
		System.out.println("Printing array in reverse order");
		for(int j=NAME.length-1;j>=0;j--)
		{
			System.out.print(NAME[j]+"\t");
		}
		System.out.println();
		System.out.println("**********End of the printing array using for each loop************");
		
	}
	/*
	 * This method is describing about two dimentional array
	 */
	 void twoDementionalArrayDemo()
	 {
		 System.out.println("I AM PRINTIONG TWO DIMENTIONAL ARRAY");
		 //syntax of two dimentional array is: datatype[][] arrayname=new datatype[rows][cols]; 
		 String[][] proglang=new String[3][2];
		 //fetch the rows count datatype variablename=arrayname.length
		 int rowsCount=proglang.length;
		 int colCount=proglang[0].length;
		 //insert the element into the array:arrayname[rowindex][colindex]=value;
		 //first row+all columns
		 proglang[0][0]="java";
		 proglang[0][1]="c++";
		 proglang[1][0]="phython";
		 proglang[1][1]="java Script";
		 proglang[2][0]="perl";
		 proglang[2][1]="c";
		 //printing two dimentional array
		 for(int i=0;i<rowsCount;i++)
		 {
			 for(int j=0;j<colCount; j++)
			 {
				// System.out.print("|");
				 System.out.print(proglang[i][j] +"\t");
			 }
			 System.out.println("");
		 }
		// System.out.print("|");
		// System.out.println();
		 System.out.println("***********END OF THE METHOD***************");
	 }
	 /*
	  * This method retuens max value of the given array
	  */
	protected int getMaxValue(int[] num)
	{
		System.out.println("statrted to executing the get maxvalue of (int[] num)....");
		//for(int i=0;i<num.length;i++)
			//System.out.print("array elements are"+num[i]+"\t");
		System.out.println("array elements are:"+Arrays.toString(num));// we are using this line print the arry without using for loop.this is built in class in collection java.util.package.in this Array class tos tring static method isthere. thismethod return the length of the array
		if(num.length==0)
		{
			throw new IllegalArgumentException("invalid array input is provided");
			
		}
		//assume array first element max value
		//[17, 61, 3, 99, 98]
		// 0    1, 2,  3,  4 
		int max=num[0];//17
		for(int i=0;i<num.length;i++)//{0<5-T|i=1<5-T|i=2<5|i=3<5-T|
		{
			if(num[i]>max)//17>17-F|61>17-F|3>17-F|99>17-T
			{
				max=num[i];//99 
				
			}
				
		}
		 return max;
	}
public int getMinValue(int[] num)
{
	System.out.println("statrted to executing the get minimum of (int[] num)....");
	System.out.println("array elements are:"+Arrays.toString(num));
	if(num.length==0)
	{
		throw new IllegalArgumentException("invalid array input is provided");
		
	}
	//assume array first element max value
	int min=num[0];
	for(int i=0;i<num.length;i++)
	{
		if(num[i]<min)
		{
			min=num[i];
			
		}
			
	}
	 return min;
}  
/*
 * This methods returns find out array elements average 
 */
	
	public float getaverageOfArrayElements(int[] num)
	{
		System.out.println("I AM PRINTING SUM OF AARRAY ELEMENTTS AND AVERAGE");
	int sum=0;
	for(int i=0;i<num.length;i++)
	{
		sum=sum+num[i];
		}
	float avg= sum/num.length;
	return avg;

	}
	/*
	 * Returning random array
	 */
	
	public int[] getRandomArray(int size) {
		System.out.println("Starting executing the randomarray of size:"+size);
		
		//declaare an array: datatype[] arrayname=new datatype[size];
		int[] randomarr=new int[size];
		 //for(int i=0;i<size;i++)
		for(int i=0;i<randomarr.length;i++)
		{
			randomarr[i]=(int) (Math.random()*100);
			 
		}
		return randomarr;
		
	}
	
	
	/*public static void arrayProgram()
	{
		final int SIZE=5;
		//creating array---- datatype []array name=new datatype[size];
		double[] salary=new double[SIZE];
		//creating scanner object for the keyboard input
		//Scanner obj=new Scannear(system.in)
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the salaries of 5 emplyes");
		for(int i=0; i<SIZE;i++)
		{
			salary[i]=scobj.nextDouble();
		}
		//display the values stored in the array
		System.out.println("SALARIES ARE");
		for(int i=0;i<SIZE;i++)
		{
			System.out.println(salary[i]);
		}
		
	}*/
	
	
	

	public static void main(String[] args) {
		//arrayProgram();
		//create object for the class- c 
		//classname objref=new classname();
		ArrayDemoProgram arrobj=new ArrayDemoProgram();
		arrobj.printCharDemo();
		arrobj.twoDementionalArrayDemo();
		//return type method calling
		//datatype variablename= objref.returntypenonstaticmethod();
		int[] ranArray=arrobj.getRandomArray(8);
		System.out.println("Random Array Elements:"+Arrays.toString(ranArray));
		System.out.println("MAX VALUE OF GIVEN ARRAY IS "+arrobj.getMaxValue(ranArray));
		System.out.println("MIN VALUE OF GIVEN ARRAY IS"+arrobj.getMinValue(ranArray));
		System.out.println("AVERAGE OF ARRAY ELEMENTS IS"+arrobj.getaverageOfArrayElements(ranArray));
		
 
		
		

	}

}

package controlstructuresprograms;

import java.util.Scanner;

public class InterviewRelatedPrograms {
	/*
	 * ex:153
	 * AmstrongNumber:In a given number each digit cube value and you can add all cubed values, the sum value is equals to original given number
	 * (1*1*1)+(5*5*5)+(3*3*3) =1+125+27=153
	 */
	protected static void checkAmstrongNumber(int n)
	{
		int rm,cube=0,temp;
		temp=n;
		while(n>0)//153>0                     //15>0                   //1>0
		{
			rm=n%10;//153%10= 3=rm             // 15%10=5              //1%10=1
			n=n/10;//153/10=15                 //15/10=1               //1/10=
			cube=cube+(rm*rm*rm);//0+(3*3*3)==27	27+(5*5*5)=27+125=152  //152+(1*1*1)=152+1=153
		}
		if(temp==cube)
		{ 
			System.out.println("Given number is Amstring Number"+cube);
		}
		else
		{
			System.out.println("Given number is  NOT Amstrong Numer"+cube);
		}
		
		
		
	}
	
	
	
	
	public static void primeNumbers(int range)
	{
		System.out.println("printing the prome numbers from 2 to:"+range);
		for(int i=2; i<range;i++)
		{
			boolean isPrime=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
		System.out.print(i+"\t");
		}
	}
		System.out.println();
	}
	
	
	/*
	 * below program retuens given string in triangle shape
	 * str=selenium;
	 * s
	 * se
	 * sel
	 * sele
	 * selen
	 * seleni
	 * seleniu
	 * selenium
	 * string class one method its convers the string into charecter array. 
	 * 
	 */
	
	 public static void printStringTriangleShape(String str)
	 {
		 //convert string into charecter[] using toCharArray()
		 //its a buit is in method in string class. Its return a value thst is charecter array.this is return type method
		 //datatype [] arrayname=objref.returntypemethod();
		 char[] ch=str.toCharArray();
		 //ch[]=['s','e','l','e','n','i','u','m']
		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(ch[j]);
			 }
			 System.out.println();
		 }
		 
		
	 }
	 
	 
	 /*
	  * BELOW PROGRAM PRINT PYROMID SHAPE
	  * ex:  
	  *       *
	  *    *     * 
	     *     *     *   */
	 
	 public static void printPyramidShape()
	 {
		 //create an object for scanner class to take the input from the keyboard
		     Scanner scobj=new Scanner(System.in);
		     System.out.println("HOW MANY ROWS YOU WANT IN PYRAMID SAHPE");
		     int noOfRows=scobj.nextInt();
		     //initilize the row count
		     int rowCount=1;
		     int n=0;
		     int a =0;
		     //first for loop using for the spaces
		     for(int i=noOfRows;i>0;i--)
		     {
		    	 for(int j=1;j<=i;j++)
		    	 {
		    		 System.out.print(" ");
		    	 }
		    	 for(int k=1;k<rowCount;k++)
		    	 {
		    		 System.out.print("  "+k);
		    		
		    		
		    		 }
		    		    		 
		 		  	 
		    	 System.out.println();
		    	 //increment the row count by 1
		    	 rowCount++;
		     }
		 
}
	 
	 
	 
	 
	 
	 public static void pyramidShape()
	 {
		 System.out.println("print stars in pyramid");
		 for(int i=0;i<6;i++)
		 {
			 for(int j=0;j<=6-i;j++)
			 {
				 
				 System.out.print("  ");
			 }
			 for(int k=1;k<=i+1;k++)
			 {
				// System.out.print("  "+i);
				 System.out.print("  "+k);
				// System.out.print(" * ");
			 }
			 System.out.println(); 
		 }
		 
		 for(int i=6;i>0;i--)
		  {
			 for (int k=1;k<11-i;k++)
			 {
				 System.out.print(" ");
			 }
			for(int j=6;j>6-i;j--)
			 {
			
				 System.out.print("  "+j);
			 }
			 System.out.println();
		  }
	
			 
	
		 		 
	 }
	 
	 
	 public static void PrintPyramidFull()
	 {
		// System.out.close();
		for(int i=6;i>0;i--)
		  {
			 for (int k=1;k<=6-i;k++)
			 {
				 System.out.print(" ");
			 }
			for(int j=6;j>6-i;j--)
			 {
			
				 System.out.print(" "+j);
			 }
			 System.out.println();
		  }
		 
		 
		 for(int i=6;i>0;i--)
		 {
			 for(int k=1;k<=6-i;k++)
			 {
				 System.out.print(" ");
			 }
			      for(int j=1;j<=6;j++)
			    	  System.out.print(" "+j);
		 }
		 System.out.println();
		 
	 }
	 
	 //below method parameterised method
	 
	 public static void pryramidShape1(int n)
	 {
		 System.out.println("print stars in pyramid");
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<=n-i;j++)
			 {
				 
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i+1;j++)
			 {
				System.out.print("  "+i);
				// System.out.print("  "+j);
				// System.out.print(" * ");
			 }
			 System.out.println(); 
		 }
			 
		
	 }
	 public static void printTriangle()
	 {
		 System.out.println("print # symbols");
		 for(int i=0;i<7;i++) 
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print("# ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static int findfactorialInReecursiveProcess(int n)
	 {
		 if(n==0)
		 {
			 return 1;
		 }
		 return n*findfactorialInReecursiveProcess(n-1);
	 }
	 
	 
	 
	 
	 
	 public static void printingStarts(int n)
	 {
		for(int i=0;i<n;i++)
		{
					
		for(int j=0;j<i;j++)
		{
			System.out.print("*");
		}
			System.out.println();		 
	 }
	 }
	public static void main(String[] args) {
		//checkAmstrongNumber(123);
		//primeNumbers(10);
		//printStringTriangleShape("LAKSHMI");
        //printPyramidShape();
	//System.out.println("5 factorial is"+findfactorialInReecursiveProcess(5));	
		
		
	//	 printPyramidShape();
	pyramidShape();
		//pryramidShape1(10);
		//PrintPyramidFull();
		
		
		
	//printTriangle();
		//printingStarts(7);
				
	}

}



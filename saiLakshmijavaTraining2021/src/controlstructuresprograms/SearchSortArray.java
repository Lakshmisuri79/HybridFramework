package controlstructuresprograms;
import java.util.Arrays;
import java.util.Scanner;

public class SearchSortArray 
{

	static Scanner console=new Scanner(System.in);
	
		
	//creating the methods separatetlyand we can call this methods in the program

public static void readArray(int[] array)
	{
	System.out.println("array count is: "+array.length+"\n");
	System.out.print("ENTER THE ARRY NUMBERS");
	for(int i=0;i<array.length;i++)
		{
			//System.out.print("ENTER THE ARRY NUMBERS");
			array[i]=console.nextInt();
		}
	System.out.println();
		System.out.println("*******************************method completed*********************************");
	}
	
			
	static void displayArray(int[] array)
	{
		System.out.println("display array - value of array:"+array.length);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			
		}
	    System.out.println();
		System.out.println("*************************Display method completed************************");
	}

	//this method is parameterised return method
	//we are comparing the array and data
	//we declared array size already and that array  we are comparing with input data
	static int searchArray(int[] array, int data)
	{
		System.out.println("before search of the array:"+array.length);
		for(int i=0;i<array.length;i++)

	{
			if(array[i]==data)
			{
				return i;
			}
		}
		System.out.println("search array completed");
		return-1;
	}
	
	
	static void sortArray(int[] array)
	{
		System.out.println("before sorting my array is::\n"+Arrays.toString(array)+"\n");
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<(array.length-i);j++)
			{
				if(array[j-1]>array[j])
				{
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					//System.out.print("\t"+"temp: "+temp+"j-1:"+array[j-1]+"j:"+array[j]);						
					
				}
			}
		}
		System.out.println("after sorting my array is::\n"+Arrays.toString(array)+"\n");
		
		System.out.println("exiting the sort array");
	}
	
	public static void sortArrayInDescendingOrder(int[] array)
	{
		int i;
		int j; 
		//displayArray(array);
		for(i=0;i<array.length; i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				//System.out.print("\t"+array[j]);
	
			}

			System.out.println(array[i]);
		}
		
		System.out.println("**********DECENDING ORDER SORT COMPLETED****************");
	
	}
	
	
	public static void sortAssendingOrderArray(int [] array) 
	{
		int i;
		int j;
		System.out.println("BEFORE SORTING ARRAY IS");
		
		for(i=0;i<array.length;i++);
		{
			for( j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
						
			}
			System.out.println(array[i]);
		}
		
		System.out.println("**********ASSENDING ORDER SORT COMPLETED**********");
	}
	
	public static void getMaxValue(int[] array)
	{
		System.out.println("array.length:"+array.length);
	
		if(array.length==0)
		{
			throw new IllegalArgumentException("Invalid array");
		}
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("max value is: "+ max);
		System.out.println("******************getMaxMethod Completed****************");
	}
	
	
	public static void getMinValue(int[] array)
	{
		if(array.length==0)
		{
			throw new IllegalArgumentException("Invalid array");
		}
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		System.out.println("min value is: "+ min);
		System.out.println("******************getMinMethod Completed****************");
	}
	
public static void DuplicateIntegers(int[] array)
{
	int dup=0;
	System.out.println("DUPLICATE INTEGERS OF AN ARRAY IS");
	
int j=0;
for (j=0;j<array.length;j++)
{
	for(int i=j+1;i<array.length;i++)//
	{
		if(array[j]==array[i])
		{
			dup=array[i];
			System.out.println("Duplicate found..:"+ dup );//+ " in the position"+ i);
		}
	}		
}	

	System.out.println("***********Exiting duplicate values***************");
}
	
	public static void reverseArray(int [] array)
	{
		for(int i=0;i<array.length/2;i++)
		{
			int temp=array[i];
			array[i]=array[array.length-1];
			array[array.length-1]=temp;
			
		}
	     System.out.println();
		System.out.println("*******************EXITING REVERSE ARRAY****************");
	}
	
	public static void leftRotate(int [] array, int n)
	{
		int j=0;
		for(int i=0;i<n;i++)
		{
			//int j;
			int temp=array[0];
			for(j=0;j<array.length;j++)
			{
				array[j]=array[j+1];
				
			}
			array[j]=temp;
		}
		System.out.println(array[j]);
	}
	
	
	
	
	
	
	public static void allArraysInput()
	{
		int size;
		int p=0;
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		size=console.nextInt();
		int[] list=new int[size];
		int options;
		do
		{
			System.out.println("MENU");
			System.out.println("1. READ ARRAY" );
			System.out.println("2.DISPLY OR PRINT ARRAY");
			System.out.println("3.SEARCH AN ITEM IN ARRAY");
			System.out.println("4.SORT AN ARRAY");
			System.out.println("5.SORT AN ARRAY IN DECENDING ORDER");
			System.out.println("6.SORT AN ARRAY IN ASSENDING ORDER");
			System.out.println("7.GETMAXVALUE");
			System.out.println("8.GETMINIMUM VALUE");
			System.out.println("9.DUPLICATE INTEGERS");
			System.out.println("10.REVERSE AN ARRAY");
			System.out.println("11.LEFT ROTATE");
			System.out.println("12.EXIT");
			
			System.out.println("SELECT AN OPTION");
			options=console.nextInt();
			
			switch(options)
			{
			case 1:
				readArray(list);
				break;
			case 2:
				displayArray(list);
				break;
			case 3:
				System.out.println("ENTER THE NUMBER DO YOU WANT SEARCH");
				int item=console.nextInt();
				int index=searchArray(list,item);
				if(index==-1)
				{
					System.out.println("ITEM NOT FOUND");
				}
				else
				{
					System.out.println("ITEM FOUND ATPOSITION"+(index+1));
				}
				
				break;
			case 4:
				System.out.println("SORTED ARRY");
				sortArray(list);
				//displayArray(list);
				break;
				
			case 5 :
			System.out.println("SORTED ARRAY IN Descending ORDER");
			sortArrayInDescendingOrder(list);
			//displayArray(list);
			break;
			case 6:
				System.out.println("SORTED ARRAY IN ASSENDING ORDER");
				sortAssendingOrderArray(list);
				
			break;
			case 7:
				System.out.println("GET MAX VALUE IN GIVEN ARRAY");
				getMaxValue(list);
				//displayArray(list);
				break;
			case 8:
				System.out.println("get minimum value of given array");
				getMinValue(list);
				//displayArray(list);
				break;
				
			case 9:
				System.out.println("DUPLLICATE INTEGERS IN GIVEN ARRAY IS");
				DuplicateIntegers(list);
				//displayArray(list);
				break;
				
			case 10:
				System.out.println("REVERSE AN ARRAY IS");
				reverseArray(list);
				displayArray(list);
				break;
			case 11:
				System.out.println("AFTER LEFT ROTATE ARRAY IS");
				leftRotate(list,p);
				break;
				
				
				
			}
		}	

		while(options!=10);	
		{
			System.out.println("lakshmi");
		}
				
	}
	public static void main(String[] args) 
	{
		
		
		allArraysInput();

	}

}
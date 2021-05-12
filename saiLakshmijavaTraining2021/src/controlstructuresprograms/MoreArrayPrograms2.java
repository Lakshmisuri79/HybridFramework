package controlstructuresprograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoreArrayPrograms2 {
	
	public void rightRotateArrayByNPositions(int[]num,int n)
	{
		System.out.println("PRINT THE ARRAY BEFORE RIGHT ROTATE ARRAY:"+Arrays.toString(num));
		
		for(int i=0;i<n;i++)
		{
			
			int temp=num[num.length-1];
			for(int j=num.length-1;j>0;j--)
			{
				num[j]=num[j-1];
				
			
		}
		
		num[0]=temp;
	}
	System.out.println("After Printing the array is:"+Arrays.toString(num));
	//printArray(num);
	
	
	}
	
	
	
	
	
	public  void leftRotateArrayByNposition(int[] num,int n)
	{
		System.out.println("PRINT THE ARRAY BEFORE LEFT ROTATION:"+Arrays.toString(num));
		
				// define the temporary variable and hold the first element of the array that means the first element of the num[]  in to temp.
		
			for(int i=0;i<n;i++)
			{
				int j;
				//store the first element in the temp variable
				int temp=num[0];
				//shift the one by one element towards left by one position
				for( j=0;j<num.length-1;j++)
				{
					num[j]=num[j+1];
				}
				//copy the temp value to lst element
				num[j]=temp;
			}
			System.out.print("print array after lefr rotate:  ");
			printArray(num);
		}
	
	
	public void printArray(int[] num)
	{
		//System.out.println("printing array using for loop");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"\t");
		}
		System.out.println();
	}

	
	private void leftRotateArraybyNPositionCharecters(char[] ch, int n)
	{
		System.out.println("PRINT THE CHARECTERS ARRAY BEFORE LEFT ROTATION:"+Arrays.toString(ch));
		
		
		for(char i=0;i<n;i++) {
			char j;
			char temp=ch[0];
			for(j=0;j<ch.length-1;j++)
			{
				ch[j]=ch[j+1];
			}
			ch[j]=temp;
		}
		for(char i1=0;i1<ch.length;i1++)
		{
			System.out.print(ch[i1]+"\t");
		}
		System.out.println();
	}
	
	
	public void sortArrayAssendingOrder(int[] num)
	
	{
		System.out.println("BEFORE PRINTING ASSENDING ORDER"+Arrays.toString(num));
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("AFTER SORTING IN ASSENDING ORDER THE ARRAY IS:"+Arrays.toString(num));
		System.out.println();
		}
	
	
	protected void sortArrayDesendingArray(int[] num)
	{
		
		//int SIZE=10;
		//int[] numbers=new int[SIZE];
		//Scanner scobj=new Scanner(System.in);
		//System.out.println("ENTER THE SIZE OF THE ARRAY");
		//SIZE=scobj.nextInt();
					
		System.out.println("BEFORE PRINTING DECENDING ORDER ARRAY IS:"+Arrays.toString(num));
		for(int i=0;i<num.length;i++)
		{
			int j=0;
			for(j=j+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
			}
		}
		System.out.println("AFTER SORTING IN DECENDING ORDER ARRAYS IS"+Arrays.toString(num));
		System.out.println();
	}
	
	static void printFibonocciValue(int n)
	{
		int x=0;
		int y=1;
		int z;
		System.out.print(x+","+"\t");
		System.out.print(y+","+"\t");
		for(int i=2;i<n;i++)
		{
			
				z=x+y;
				System.out.print( ", "+z+"\t ");
		
				x=y;
				y=z;
			}
		System.out.println(" ");
		}
		
public static void palindromeNumber(int number)
{
	int rm, rev=0;
	int temp=number;
	while(number>0)
	{
	rm=number%10;
	rev=(rev*10)+rm;
			number=number/10;
	}
	if(rev==temp)
	{
		System.out.println("Given number is palindrome : "+rev);
	}
	else
	{
		System.out.println("Give number is not palindrome : "+rev);
	}
}
	
	public static void main(String[] args) {
		//create object
		MoreArrayPrograms2 moarr=new MoreArrayPrograms2();
				
		int[] left= {1,2,3,4,5,6,7};
		
		moarr.leftRotateArrayByNposition(left, 3);
		
		char[] charray= {'a','b','c','d','e','f','g','h','i','j'};
		moarr.leftRotateArraybyNPositionCharecters(charray, 4);
		
		int[] rArray= {1,2,3,4,5,6,7};
		moarr.rightRotateArrayByNPositions(rArray, 3);
		
		int[] assArray= {7,6,5,4,3,2,1,0};
		moarr.sortArrayAssendingOrder(assArray);
		
		int [] dssArray= {9,3,5,6,7,1,0,2};
		moarr.sortArrayDesendingArray(dssArray);
		
		
		moarr.printFibonocciValue(10);
		
		palindromeNumber(11033);
		palindromeNumber(11011);
	}

}

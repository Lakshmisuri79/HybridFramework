package controlstructuresprograms;

import java.util.Arrays;
import java.util.Scanner;

public class moreArrayPrograms3 {
	
	public static void assendingOrgerArrayInt(int[] num)
	{
		
		int n,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER YHE ELEMENTS"+",");
					
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
				
			}
		}
		
           System.out.println("after asswnding order :"+Arrays.toString(a));
		
	}
	
	
	
	
	public void bubblesort(int[] num)
	{
		System.out.println("BEFORE SORTING ARRAY IS:"+Arrays.toString(num));
		
			for(int i=0;i<num.length;i++)
			{
				for(int j=1;j<(num.length-1);j++)
						{
					        if(num[j-1]>num[j])
					        {
					        	int temp=num[j-1];
					        	num[j-1]=num[j];
					        	num[j]=temp;
					        }
						}
			     }
			System.out.println("AFTER SORTING THE ARRAY IS:"+Arrays.toString(num));
			System.out.println();
		}
	
	
	
	public void bubblesortChar(char[] ch)
	{
		System.out.println("BEFORE BUBBLE  SORTING CHARECTERS ARE:"+Arrays.toString(ch));
		for(char i=0;i<ch.length;i++)
		{
			for(char j=1;j<(ch.length-1);j++)
			{
				if(ch[j-1]>ch[j])
				{
					char temp=ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("AFTER BUBBLE SORT CHARECTERS ARE:"+Arrays.toString(ch));
		System.out.println();
	}

	public static void main(String[] args) {
	//	assendingOrgerArrayInt();
		
		moreArrayPrograms3 aobj=new moreArrayPrograms3();
		
		int[] bint= {23,12,45,21,78,65,43,98};
     	aobj.bubblesort(bint);
     	
     //	char[] bch= {'a','s','d','f'};
     	//aobj.bubblesortChar(bch);
     	
		
		
		
	}

}

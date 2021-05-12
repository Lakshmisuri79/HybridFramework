package controlstructuresprograms;

import java.util.Arrays;

public class MoreArrayPrograms {
	
	
	public void ifindDuplicateValue(String[] fruits)
	{
		System.out.println("String Array is:" +Arrays.toString(fruits));
		System.out.println("DUPLICATE STRINGS ARE");
		for(int i=0;i<fruits.length;i++)
		{
			for(int j=i+1; j<fruits.length;j++)
            {
            	if(fruits[i].equals(fruits[j]))
                    {
                    	System.out.print(fruits[j]+"\t");
	
         }
	
              }
		}System.out.println();
		System.out.println("*********END OF THE METHOD************");
	
	}

	
	
	public void ifindDuplicateIntegers(int[] num)
	{
		System.out.println("Integer  Array is:" +Arrays.toString(num));
		System.out.println("DUPLICATE INTEGERS ARE");
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1; j<num.length;j++)
            {
            	if(num[i]==(num[j]))
                    {
                    	System.out.print(num[j]+"\t");
	
         }
	
              }
		}System.out.println();
		System.out.println("*********END OF THE METHOD************");
	
	}

	public void ifindDuplicatecharecters(char[] ch)
	{
		System.out.println("CHARECTER  ARRARY IS:" +Arrays.toString(ch));
		System.out.println("DUPLICATE CHARECTERS ARE");
		for(char i=0;i<ch.length;i++)
		{
			for(int j=i+1; j<ch.length;j++)
            {
            	if(ch[i]==(ch[j]))
                    {
                    	System.out.print(ch[j]+"\t");
	
         }
	
              }
		}System.out.println();
		System.out.println("*********END OF THE METHOD************");
	
	}
	
	//********************************************************************************//
	public void reverseArrayInPlace(int[] num) {
		System.out.println("BEFORE REVERSE ARRAY IS:"+Arrays.toString(num));
		
		for(int i=0; i<num.length/2; i++)
		{
			int temp=num[i];
			num[i]=num[num.length-i-1];
			num[num.length-i-1]=temp;
		}
		System.out.println("AFTER REVERSING THE INTEGER ARRAY IS");
		printArray(num);
		System.out.println("***********************END OF THE METHOD***************");
	}

	
	public void reverseArrayInPlace(char[] ch) {
		System.out.println("BEFORE REVERSE ARRAY IS:"+Arrays.toString(ch));
		
		for(int i=0; i<ch.length/2; i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;
		}
		System.out.println("AFTER REVERSING THE INTEGER ARRAY IS");
		
		
		for(char c1=0;c1<ch.length;c1++)
		{
			System.out.print(ch[c1]+"\t");
			}
		System.out.println();
		}
	

	
	
	public void printArray(int[] num)
	{
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
	}

	
	public void bubbleSort(int[] num)
	{
				System.out.println("BEFORE SORTING AN ARRAY IS:"+Arrays.toString(num));
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
		System.out.print("AFTER THE BUBBLE SORT ARRAY IS"+"\t");
		printArray(num);
		}
	
	
	public void bubbleSort(char[] chr)
	{
				System.out.println("BEFORE SORTING AN ARRAY IS:"+Arrays.toString(chr));
		for(char i=0;i<chr.length;i++)
		{
			
			for(char j=1;j<(chr.length-1);j++)
				{
					if(chr[j-1]>chr[j])
					{ 
						char temp=chr[j-1];
						chr[j-1]=chr[j];
						chr[j]=temp;
					}
				}
			}
		System.out.print("AFTER THE BUBBLE SORT CHAR ARRAY IS:+\t");
		for(char i=0; i<chr.length;i++) {
			System.out.print(chr[i]+", ");
		}

		System.out.println();
		
	}
	
	
	protected void getMaxValue(int[] num)
	
	{
		System.out.println("GET MAXIMUM VALUE IS");
		
		System.out.println("array elements are:"+Arrays.toString(num));
		if(num.length==0)
		{
			throw new IllegalArgumentException("invalid array input is provided");
			
		}
		
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
				
				
			}
							
		}
		System.out.println();
		System.out.println("MAXIUM NUMBER IS"+max);
	}
	
	
	
protected void getMaxValue()
	
	{
	
		System.out.println("GET MAXIMUM VALUE IS");
		
		int[] num= {2,4,6,8};
	/*	if(num.length==0)
		{
			throw new IllegalArgumentException("invalid array input is provided");
			
		}*/
		
		int max=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
				
				
			}//System.out.println();
			//printArray(num);
			
			 
							
		}
		System.out.println("MAXIUM NUMBER IS"+max);
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		//create an object for non static method
				MoreArrayPrograms arobj=new MoreArrayPrograms();
		String[] fru= {"Pineapple", "grapes","mango","apple","mango","banana","orange","grapes"};
		arobj.ifindDuplicateValue(fru);
		int[] num1= {1,2,3,4,5,8,7,6,3,2,1};
		arobj.ifindDuplicateIntegers(num1);
		char[] ch1={'q','w','e','r','t','r','p','o','i','u','y','u'};
		arobj.ifindDuplicatecharecters(ch1);
		int[] num2= {1,2,3,4,5,6,7,8,9};
		arobj.reverseArrayInPlace(num2);
		char[] chr= {'a','s','d','f','g','f'};
				arobj.reverseArrayInPlace(chr);
				
				int[] bbs= {9,5,0,6,2,8,4};
				arobj.bubbleSort(bbs);
				
				char[] chbs= {'q','w','e','r','t','y','a','s','d','f','g'};
						arobj.bubbleSort(chbs);
						
						int[] max1= {9,4,6,1,8,0,3,5};
						arobj.getMaxValue(max1);
					arobj.getMaxValue();
					
						
		}
				

	}



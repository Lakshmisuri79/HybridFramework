package stringhandling;

import java.util.Arrays;
import java.util.Scanner;

public class StringProgramsInterview {

	public static void checkPalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)//ex:mom--m--/o/m
		{
			rev=rev+str.charAt(i);//m--/mo/mom
		}
		if(rev.equals(str))
		{
			System.out.println("given string is palendrome"+rev);
		}
		else
		{
			System.out.println("givenstring is not palendrome"+rev);
		}
		System.out.println("********************** end of the method***************************");
	}
	
	public static void checkPalindrome1(String str)
	{
		boolean flag= true;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag= false;
				break;
			}
		}
			if(flag)
			{
				System.out.println("given string is palindrome"+str);
				
				}
			else
			{
				System.out.println("given string is not polindroem"+str);
			}
			System.out.println("********************** end of the method***************************");
		}
	

	public static void checkanagrams(String s1,String s2)
	{
		//convert noth srting either lowercase or uppercase
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("given "+s1 +"and"+ s2 +"are not anagrams");
		}
		else
		{
			char[] s1Array=s1.toCharArray();
			char[] s2Array=s2.toCharArray();
			//sort two arrays using arrays class sort method
			Arrays.parallelSort(s1Array);
			Arrays.parallelSort(s2Array);
			//compare two arrays using arrays class equals method
			if(Arrays.equals(s1Array, s2Array))
			{
				System.out.println("given "+s1 +"and"+ s2 +"are anagrams");
			}
			else
			{
				System.out.println("given "+s1 +"and"+ s2 +"are not anagrams");
			}
		}
		System.out.println("********************** end of the method***************************");
	}
	
	 static void countVowelsConsonentsNumbers(String str)
	 {
		 int vCount=0, cCount=0,nCount=0,sCount=0;
		 //convert the string into lower case
		 str=str.toLowerCase();
		 //iterate the string using for loop
		 for(int i=0;i<=str.length()-1;i++)
		 {
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			 {
				 vCount++;
			 }
			 else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			 {
				 cCount++;
			 }
			 else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			 {
				 nCount++;
			 }
			 else if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='$'||str.charAt(i)=='#'||str.charAt(i)=='@'||str.charAt(i)=='&')	
			 {
				 sCount++;
			 }
		 }
		 System.out.println("Number of vowels in given string is"+vCount);
		 System.out.println("Number of consonents in given string is"+cCount);
		 System.out.println("Number of numbers in given string is"+nCount);
		 System.out.println("Number of special charecters in given string is"+sCount);
		 System.out.println("********************** end of the method***************************");
	 }
	 
	 public static void swapTwoStrings(String s1,String s2)
	 {
		 System.out.println("before swapping s1 valus is"+" "+s1+"s2 value is"+" "+s2);
		 //s1=lakshmi, s2=suri;
		 //join two strings and assign into s1 variable
		 s1=s1+s2;
		 //s1=lakshmisuri
		  //  012345678910
		   //extract s2  from updated s1
		 s2=s1.substring(0, (s1.length()-s2.length()));
		 //              (0,(11-4));---(0,7)
		 //s2=lakshmi
		 //extract s1 from updated s1
		 s1=s1.substring(7);
		 System.out.println("after swapping s1 valus is"+" " +s1+"s2 value is"+" "+s2);
		 System.out.println("********************** end of the method***************************");
	 }
	 
	 public static void countTheNumberOfWords()
	 {
		 System.out.println("enter the new string");
		 Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 String[] words=str.trim().split(" ");
		 
		 System.out.println("number of words in the string" +" "+words.length);
		 System.out.println("********************** end of the method***************************");
	 }
	 
	 
	 
	 static void countTheCharectersInTheString()
	 {
		 System.out.println("enter the new string");
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 int count=1;
		 //iterate the for loop
		 for(int i=0;i<str.length()-1;i++)
		 {
			 if((str.charAt(i)== ' ')||(str.charAt(i+1)!=' '))
			 {
				 count++;
			 }
		 
		 }
		 System.out.println("number of charecters in the string" +" "+count);
		 System.out.println("********************** end of the method***************************");
		 
	 }
	
	 public static void removeAllSpacesInGivenString()
	 {
		 System.out.println("Enter the new string");
		 Scanner sc=new Scanner(System.in);
		 String inputString=sc.nextLine();
		 //i am removing all spaces in givenstring using remove all method
		 String Withoutspaces= inputString.replaceAll(" ", "");
		 System.out.println(" String with spacs"+" "+inputString);
		 System.out.println(" string with spaces lengh is"+" "+inputString.length());
		 System.out.println("string without spaces"+" "+Withoutspaces);
		 System.out.println(" string without spaces"+" "+Withoutspaces.length());
	 }
	 
	 public static void duplicateCharectersInString(String str)
	 {
		 int count=0;
		 //lowercase
		 str=str.toLowerCase();
		// System.out.print("The string is"+" "+str);
		 System.out.print("Duplicate charecters in above string is"+" "+str);
		// char[] arr=str.toCharArray();
		// char[] duplicates= {'1','2','3','4','5'};
		 //iteratee the loop
		 for(int i=0;i<str.length();i++)
		 {
			 for(int j=i+1;j<str.length();j++)
			 {
				if(str.charAt(i)==str.charAt(j))
				 {
					count++;
					//str=str.replaceAll(str.charAt(i), " ,");
					 break;
				 }
			 }
		 }
			
		 System.out.println(count);
		 System.out.println("********************** end of the method***************************");
	 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkPalindrome("mom");
	checkPalindrome1("rotators");
	checkanagrams("below","elbow");
	countVowelsConsonentsNumbers("java is a object oriented program123456@#$&*");
	swapTwoStrings("lakshmi","suri");
		//countTheNumberOfWords();
	//countTheCharectersInTheString();
	//removeAllSpacesInGivenString();
	duplicateCharectersInString("my name is madhav suri");

}
}

package basicprograms;

import javabasicprograms.ReturnKeywordProgram;

public class AccessModifierDemo {
	//accessmodifier static datatype variablename=value;
	public static int a=100;
	public static int b =400;
	private static String str="SAI SURI LAKSHMI";
	//public static int d =a+b;
	


	//static methods
	//accessmodifier static void m1()
	public static void m1()
	{
		int d=a+b;
		System.out.println("this is my public access modifier from the class Accessmodifierdemo ");
		System.out.println(d);
	}
	
	
	
	private static void m2()
	{
		int x=10;
		int y=20;
		int z=x*y;
		System.out.println(z);
	}

	protected static void  m3()
	{
		int charcount;
		charcount=str.length();
		System.out.println("I am printing SAI SURI LAKSHMI NAME'S COUNT:" +charcount);
		
	}
	 static void  m4()
	{
		int count;
	String s1="SAI    ";
	count = s1.length();
	System.out.println("I am printing SAI  NAME'S COUNT:" +count);
	}
	public static void m5()
	{
	
	String s2="        MADHAV          ";
	System.out.println("Before trimming" +s2);
	s2=s2.trim();
	
	System.out.println("After trimming" +s2);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m2();
		m3();
		m4();
		m5();
System.out.println("THIS IS MY ACCESS MODIFIER PROGRAM");
//calling return type keyword	
//Datatype variable=classname.returntypestaticmethod()
int AA=ReturnKeywordProgram.returnMethod1();
System.out.println("calling return type keyword method :"+AA);

	
	}

}

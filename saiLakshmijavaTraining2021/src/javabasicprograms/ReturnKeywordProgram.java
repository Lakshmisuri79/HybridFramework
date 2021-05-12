package javabasicprograms;

import basicprograms.StaticDemo1;

public class ReturnKeywordProgram {
	private static int A;
	private static int B;
	private static int c;
	static String  s3;
	
	private static int returnMethod()
	{
		 A=10;
		B=20;
	    c= A*B;
		return c;
	}
	public static int returnMethod1()
	{
		int x=20;
		int y=30;
		int c=x*y;
		return c;
	}
	
public static  void   returnMethod2()
{
	String s1="JAVA";
	String s2="PROGRAM";
	    s3=s1.concat(s2);
	    System.out.println("THE OUT OF CONCAT IS:"+s3);
	    
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
returnMethod();
int P;
P=returnMethod1();
returnMethod2();

	
		System.out.println("THE OUTPUT OF C IS:"+c);
				System.out.println("OUTPUT OF P IS:"+P);
				System.out.println("OUTPUT ");
				
			//	datatype variablename=classname.returntypestaticmethod();
				
int AAA=StaticDemo1.multiply1(8, 9);
System.out.println("calling another class returntype method :" +AAA);
	}

}

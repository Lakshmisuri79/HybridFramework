package javabasicprograms;

public class NonVoidMethods {
	public static int addreturningfunction (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public static void addnonreturningfunction (int a, int b)
	{
		int c;
		c=a+b;
	//System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; int y; int z;
		x=10;
		y=20;
		z=addreturningfunction(x,y);
		System.out.println(z);

		x=25;y=35;
		addnonreturningfunction(x,y);
//		datatype variablename=classname.returntypestaticmethod();
		int BB=ReturnKeywordProgram.returnMethod1();
		System.out.println(BB);
	
		
	
	}

	
}

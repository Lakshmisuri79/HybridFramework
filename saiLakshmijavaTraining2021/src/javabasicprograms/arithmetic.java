package javabasicprograms;

public class arithmetic
{
	public static int c;
	
	public static void add()
	{
		int a,b,c;
		a=10; b=20; c=a+b;
		System.out.println("Add function without return "+c);
	}
	
	public static void minus()
	{
		int a,b,c;
		a=10; b=20; c=a-b;
		System.out.println("Minus function without return "+c);
	}
	
	public static void div(int a, int b)
	{
		int c=a/b;
		System.out.println("division:"+c);
		
	}
	
	public static int sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public static int multiply1 (int a, int b)
	{
	//	int c;
		c=a*b;
	return c;
	}
	
	public static int multiply2 (int a, int b)
	{
	int d;
		d=a*b;
	return d;
	}

/*	public static String conc (String a, String b)
	{
	String str1;
str1=a.concat(b);
	return str1;
	}*/

	
	
	public static void main(String args[])
	{
	add();
		minus();
		multiply1(2,3);
					System.out.println(c);
					int p;
	p=multiply2(6,7);
					System.out.println(p);
					String s;
	//s=conc("Sai","Lakshmi");
					//System.out.println(s);
	//s=conc("sai","ram");
				//	System.out.println(s);
			div(4,2);
					//int y;
					//y=sum();
					//System.out.println("sum "+y);
					
					int X;
					X=sum();		
			
			System.out.println("out put is:"+X);
		
		div(multiply1(10,4),multiply2(5,2));
	}
	
}
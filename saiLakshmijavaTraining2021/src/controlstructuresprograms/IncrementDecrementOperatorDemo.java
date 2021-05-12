package controlstructuresprograms;

public class IncrementDecrementOperatorDemo {
	
	public static void main(String[] args)
	
	{
		//preincrement
	int a=5;
		System.out.println("Before the preincrement value is:"+a);
		int b=15+(++a);
		System.out.println("now b value is"+b);
		System.out.println("After the preincrement a value is"+a);
		System.out.println("****************Preincrement completed************************");
		
		//post increment
		int x=5;
		System.out.println("before the post increment x value is"+x);
		int y=15+(x++);
		System.out.println("Now y value is"+y);
		System.out.println("After post increment x value is"+x);
System.out.println("****************************END OF INCREMENT OPERATOR*****************************");		
		//decrement operators
		int x1=3;
		System.out.println("Before the x1 value pre decrement:"+x1);
		int y1=10+(--x1);
		System.out.println("Now y1 value:"+y1);
		System.out.println("x1 value after the decrement"+x1);
		
		
		int a1=3;
		System.out.println("BEFORE THE DECREMENT A VALUE IS "+a1);
		int b1=10+(a1--);
		System.out.println("now bi value is:"+b1);
		System.out.println("a1 value after the decrement:"+a1);
		
		
	}

}

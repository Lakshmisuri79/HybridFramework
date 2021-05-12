package oopsprogrammingpackage;

import java.util.Scanner;

public class MethodOverLoadingProgram {
	
	public static int a1, x1, x2, b1,b2, h1;
	
	public static int area(int a)
	{
		  System.out.println("area of the square is A=(a*a)");
          System.out.println("In the square side is" + a );
           int A=(a*a);
        return A;


	}
	
	public static int area(int x, int y)
	{
		System.out.println("area formula of Rectangular is A=x*y");
		System.out.println("In the Rectangualr sides a  and b values are :"+x +" "+y);
		
		int A=(x*y);
		return A;
	}
	
	
	public static int area(int b1,int b2,float h)
	{
		System.out.println("area of the Trepozoid is A=(b1+b2/2)*h");
		System.out.println("Trepozoid sides and height b1 ,b2,h values are" +b1+" "+b2+" "+h);
		return (int) (((b1+b2)/2)*h);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scobj=new Scanner(System.in);
		//int a1;
		System.out.println("ENTER THE NUMBER");
		a1=scobj.nextInt();
		//System.out.println("value of a1 is: "+a1);
		
		System.out.println("area of the square is:"+area(a1));
		
		
		System.out.println("ENTER Two NUMBERS");
		x1=scobj.nextInt();
		x2=scobj.nextInt();
		
		System.out.println("area of the Rectangular is:"+area(x1,x2));
		System.out.println("ENTER Two NUMBERs");
		b1=scobj.nextInt();
		b2=scobj.nextInt();
		h1=scobj.nextInt();
		
		
		
	    System.out.println("area of the Trepozoid  is:"+area(b1,b2,h1));
	

	}

}

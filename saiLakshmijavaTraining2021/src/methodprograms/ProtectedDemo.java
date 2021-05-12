package methodprograms;

public class ProtectedDemo {
	//declaring variable syntax accessmodifier static  datatype variablename=value;
	protected static String s="JAVA SELINIUM PROGRAM";
	protected static int a=20;
	protected static long l=100;
	protected static float f= 5.4f;
	public static int a1=30;
	//method syntax: accessmodifier static void methodName(){logic}
	protected static void stringOne()
	     {
		System.out.println("This is protected static string void method");
		String s2=s.substring(0, 4);
		System.out.println("SUB STRING OF S2:"+s2);
	     }
	public static void swapValue(int a2, int a3)
	{
		System.out.println("This is protected parameterised method");
		System.out.println("Before swaping x value is:"+a2 +" y value is:" +a3);
		int a4=a2;
		a2=a3;
		a3=a4;
		System.out.println("After swaping x value is:"+a2 +" y value is:" +a3);
		
	}
	//returntype without patameterised methodsyntax
	//accessmodifier static datype methodname(){logic}
	public static int mathValue()
	{
		int m1=Math.round(f);
		return m1;
		//System.out.println("Round the float 5.4 value:"+m1);
		
	}
	//returntype with patameterised methodsyntax
		//accessmodifier static datype methodname(int a, int b){logic}
	protected static long mathValue1(int a, long l1)
	{
		long l2=Math.multiplyExact(a, l1);
		return l2;
	}
	
	
	public static void main(String[] args)
         {
		// TODO Auto-generated method stub
		stringOne();
		swapValue(9,7);
		System.out.println("the value of m2 is:"+mathValue());
		//calling parameterised method syntax: datatype variable name=returntype static method();
		//System.out.println("value is"+variable name);
		long l3= mathValue1(5,50);
		System.out.println("The muliplication of value is:"+l3);
		
		
		
		
		
	}

}

package variabletypeprograms;

public class LocalVariableDemo {
	
	
	private static void conditionalOperatorDemo()
	{
		System.out.println("Conditional operator demo");
		//local variables syntax datatype variablename=value;
		int a=10, b=20;
		boolean b1=a>b;
		System.out.println("output of a>b:"+b1);
	}

	public  void logicalOPerator()
	{
		System.out.println("Logical operator");
		final boolean b2=true;
		boolean b3=false;
		boolean b4=b2&&b3;
		System.out.println("OUT PUT OF b3:"+b4);
		boolean b5=b3||b4;
		System.out.println("out put of b5:"+b5);
		boolean b6=b2!=b4;
		System.out.println("out put of b6:"+b6);
		int i=30,j=40;
		boolean b7=i>j;
		System.out.println("out put of b7:"+b7);
		boolean b8=(i>j)||(i<j);
		System.out.println("output of b8:"+b8);
		
				
		
	}
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		conditionalOperatorDemo();
		//calling non static methonds under main method
		//first create object
		//syntax of create object is classname objref=new classname();
		LocalVariableDemo refobj=new LocalVariableDemo();
		//calling non static methods
		//syntax: refobj.nonstaticmethod()
		refobj.logicalOPerator();
				}
}
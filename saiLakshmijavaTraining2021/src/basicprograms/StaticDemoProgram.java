package basicprograms;

public class StaticDemoProgram {
	//accessmodifier static datatype variablename=value;
	public static int a=4;
	public static int d=5;
	public static String s4="TEXAS";

	protected static String s="NON STATIC MODIFIERS";
	private static byte b=10;
			static char c='s';
			//static method without using parameters
			//accessmodifier static void main(){logic}
			
			 public static void m1() 
			 {
				 System.out.println("This is my first public non accessmodifier static method");
				 System.out.println(("This can be accessable within tha same class only"));
				  int ch;
				  String s1="Suri";
				  String s2=" Srinivas";
				  String s3;
				  s3=s1.concat(s2); 
				  ch=s.length();
				  				  
				  System.out.println("out put is:"+ch);
				  System.out.println("Concatinating two words:" +s3);
			 }
			 
			 
		 	static void m2()
		 	    {
		 	System.out.println("Thsi is my first default non accessmodifier static method");	
		 	System.out.println("this can be accessable with in the pacakage in the same class only");
		 	
		 	boolean b=(a==d);
		 	System.out.println("out put is ais not equals to d:"+b);
		 	
	         	}
	       protected static void m3() 
	        {
		System.out.println("This is my first protected non accessmodifier static method");
		System.out.println("This can be accessable same package in any class");
		int y=a+d;
		int x=y*b/2;
		int A=a*a;
		int B=d*d;
		int C=2*a*b;
		int z=A*B*C;
		System.out.println("output value of x=(a+d)*b/2:" +x);
		System.out.println("Out put of the (A+B)2=" +z);
		
	        }

	      private static void m4()
	        { 
		System.out.println("This is my first private non accessmodifier static method");
		System.out.println("This can be accessable with in the class only ");
		int i=c;
		int p=115;
		boolean b1=(i==p); 
		System.out.println("out put value is i=p:" +b1);
	        }
		
		//static method with parameters
		//accessmodifier static void method name(datatype p1, datatype p2 ect..)

		public static void m5(int X1)
		{
		System.out.println("This is my public staic method with single parameter");
		System.out.println("Before calling  X1 value is:"+X1);
		X1=X1+d;
		System.out.println(("After calling X1 value is"+X1));					
	    }
		
		
	 static void m6(long l1, double d1, float f1)
	 {
		 System.out.println("This is my default static method with three parameters");
		 double result=l1+d1+f1;
		 System.out.println("Out put result is:"+result);
		  
		 
	 }
	 
//	  private static void m7(string s1, string s2,string s3, string s4) {
//
		// 		System.out.println("this si my  first static method with 4 pereamenters");
		//string s1=s.
		 		//System.out.println("out put is:");
		 				
	 //	 }
	 protected static void m8(int X2, int X3)
	 {
		 System.out.println("This is my protected static method using 2 perameters");
		 X2=X2/a;
		 X3=X3/d;
		 System.out.println("out put value of X2:  " +X2);
		 System.out.println("out put value of X3:  " +X3);
				 
		 		
	 }
	 
	//static blocks
	 static 
	 {
		 System.out.println("************My First Static Block********************");
		 System.out.println("This is my first static block");
		
		 System.out.println("This is my out put before using substing in static block:"+s);
		 
		 String t;
		 t=s.substring(4);
		 System.out.println("This is my out put of my first static block aftr using substring:"+t);
		 	 
		   
	 } 	 
 
	 		 
	 	 
	public static void main(String[] args)
	{ 
		//calling static method without parameters methodname()
		System.out.println("******************************Main method starts****************************");
		m1();
		m2();
		m3();
		m4();
		//call parameterised static method methodname(parameter value)
		m5(8);
		m6(20L,7.895,9.56F);
		m8(20,15);
		
				// TODO Auto-generated method stub

	}

	static
	{
		System.out.println("*******************This is my second static block***************");
		System.out.println("This is my second static block");
		int R;
		R=a+d-b;
		System.out.println("out put value is second static block is:"+R);
	}
}

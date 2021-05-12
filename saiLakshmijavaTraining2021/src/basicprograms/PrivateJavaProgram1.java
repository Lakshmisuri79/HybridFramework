package basicprograms;

public class PrivateJavaProgram1 {
	//private static variable
//accessmodifier static datatype variablename=value;
	
	private static int a=2000;
	private static int b=4900;
	private static  float p=234.45f;
	private static String country="INDIA";
	private static String street= "Brindavanam Nellore";
	private static long pincode=524001L;
	//private non static variables
	//access modifier datatype variablename=value;
	private long x=23456789;
	private long y=12345;
	//private constructor
	//accessmodifier classname(){logic}
	private PrivateJavaProgram1() {
		System.out.println("This is constructor in private access modifier");
	}
		//private static methods
		//accessmodifier static void menthodname(){logic}
		private static void myAddress()
		{
			int c=a+b;
					System.out.println("MY ADDRESS:"+street);
					System.out.println(country);
					System.out.println(pincode);
			        System.out.println(c);
			
		}
	
	//PRIVATE non-static method
		//accessmodifier void method(){logic}
		private void myPrivateMethod()
		{
			long z=x+y;
			//int c=a+b;
			System.out.println("addition of x+Y is:" +z);
		}

			
			
	public static void main(String[] args) {
		
		
		
			System.out.println("MY INDIA ADRESS is:");
			myAddress();
			//calling public modifier method
			//classname.method();
			System.out.println("I am calling another protected modifier class static string variable:"+ProtectedDemo.name);
			System.out.println(" I am calling another public access modifier class string member:"+ PublicAccessModifier.a);
			
			
		// TODO Auto-generated method stub

	}

}

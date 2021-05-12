package basicprograms;

public class ProtectedDemo {
	//Protrcted static variables
	//accessmodifier static datatype variable name=value;
	protected static String name="SAI LAKSHMI";
	protected static String name1="   SAI SRINivas SURI  ";
	protected static int a=300;
	protected static  int b=500;
	//protected non static variables
	protected long l=900L;
	
	//protected constructor
	//accessmodifier classname(){logic}
	protected ProtectedDemo() {
		System.out.println("This si proctetd constructor syntax:+accessmodifier classname(){logic}");
	}
			
	//protected static method
	//accessmodifier static void methodname(){logic}
	public static void protectedMethod() {
	//	int charcount;
//	String 	name="  SAI LAKSHMI   ";
	//	String name1="    SAI SRINIVAS SURI     ";
		
	int	charcount=name.length();
		System.out.println(charcount); 
		
	charcount=name1.length();
	
	System.out.println("I am printing SAI name's count :"+charcount);
	
	
	System.out.println("printing the name of sai before trimming:"+name1);
	
	name1 =name1.trim();
	System.out.println("Iam printing Sai name after trimming:"+name1);
	
	name=name.toLowerCase();
	System.out.println("Printing SAI LAKSHMI in all lowercases:" +name);
	
	name1=name1.toUpperCase();
	System.out.println("Printing SAI SRinivas in all Uppercases:" +name1);
	
	
			
	}
	//protected non static method
	//accessmodifier void maethodname(){logic};
	protected void nonStaticMethod() {
		
		long multiply=l*2;
				
		System.out.println("Protected accessmodifier non stastic modifier");
		System.out.println("multiply value is:"+multiply );
		
	}
	
			

	public static void main(String[] args) {
		protectedMethod();
		//calling other class static members in other class
		
		

		//System.out.println();
		
		// TODO Auto-generated method stub

	}

}

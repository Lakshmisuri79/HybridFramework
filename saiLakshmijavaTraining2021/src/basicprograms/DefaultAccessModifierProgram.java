package basicprograms;

class DefaultAccessModifierProgram {
	
	//declaring static and non static variables in default access modifier
	static String a="static-LAKSHMI";// static variable
	int b=20;// not a static variable
	
	DefaultAccessModifierProgram()
	
	{ //constructor
		
	}
	static void accesssastaticvariable() {
		//System.out.println("This is the default access modifier using a static variable");
		System.out.println(a);
		
	}
	 void accessanonstaticvariable() {//This cannot be accessed in main since it is not a static
		System.out.println("This is default method using non static");
		System.out.println(b);
	}
		

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		accesssastaticvariable();
		//calling other class static method in this class
	System.out.println("I am calling another class protected accessmodifier method");
		ProtectedDemo.protectedMethod();
		
	}

}

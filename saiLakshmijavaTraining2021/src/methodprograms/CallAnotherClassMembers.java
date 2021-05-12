package methodprograms;

public class CallAnotherClassMembers {
	
	
	public static void main(String[] args)
	
	
	{
		
		//calling another class static variable 
		//classname.staticvariable;
		System.out.println("ANOTHER CLASS STATIC VARIABLE IS:"+StaticMethodDemo1.a);
		//calling another class return type static method 
		//datatype varaiblename=classname.reaturntypestaticmethod
		//call return type static method in prinsstatement
		System.out.println("ANOTHER CLASS STATIC METHOD WTH PARAMETERS IS:" +StaticMethodDemo1.maximumValue1(3.5f, 10));
		System.out.println("ANOTHER CLASS STATIC METHOD WTH PARAMETERS IS"  +StaticMethodDemo1.maximumValue3(40, 90));
		System.out.println("ANOTHER CLASS STATIC METHOD WTH PARAMETERS IS:"  +StaticMethodDemo1.maximumValue(20, 100l));
		//
		//calling another class(InstanceMembersDemoClass) instance method/variable in the same package
		//create object
		
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}

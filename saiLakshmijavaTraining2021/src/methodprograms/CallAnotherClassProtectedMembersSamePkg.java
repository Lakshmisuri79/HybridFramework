package methodprograms;

public class CallAnotherClassProtectedMembersSamePkg


{

	public static void main(String[] args)
	{
		System.out.println("another protected classstatic variable is: "+ProtectedDemo.s);
		//calling another class proteted void method syntax:classname.staticmethodname();
		ProtectedDemo.stringOne();
		////calling another class proteted void with parameterised methodsyntax:classname.staticmethod(a2,a3);
		ProtectedDemo.swapValue(34, 54);
		//calling another class proteted returntype non parameterised method 
		//system.out.println(the round value of float is"+classname.returntypestaticmethos());
		System.out.println("The round value of float is:"+ProtectedDemo.mathValue());
		//calling another class proteted returntype  parameterised static method 
		//datatype variablename=classsname.returntypestaticmethod());
				//system.out.println("the round value of float is"+classname.returntypestaticmethos());
						System.out.println("the multiplication of x and y value:"+ProtectedDemo.mathValue1(50, 50));
		// TODO Auto-generated method stub

	}

}

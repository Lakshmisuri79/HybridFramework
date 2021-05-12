package controlstructuresprograms;

public class IfDemoProgram {
	//accessmodifier void methodname(datatype p1, datatype p2)
	private void ifDemo(int a, int b)
	{
		System.out.println("Started executing ifDemo with parameters");
		if(a>b)
		{
			System.out.println("a is greaer than b");
		}
		
		if(a<b)
		{
			System.out.println("a is lesser than b");
		}
		if(a==b) 
		{
		System.out.println("a is equals to b");	
		}
		if(a!=b)
		{
			System.out.println("a is not equals to b");
		}
		if(true)
		{
			System.out.println("my boolean value is true");
		}
		if(false)
		{
			System.out.println("my boolean value is false");
		}
		
		System.out.println("**********************ENDING MY IF BLOCK**************************");
		}
	
	public static void main(String[] args) {
		
		
		//CRATING OBJECT FOR NON STATIC METHODS
		//CLASS NAME OBJREF=NEW CLASSNAME();
		IfDemoProgram ifobj=new IfDemoProgram();
		ifobj.ifDemo(98,76);
		
		
		
	}

}

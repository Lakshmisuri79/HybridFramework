package controlstructuresprograms;

public class IfElseDemoProgram
{
	public void ifElseDemo(int a,int b,int c)

	{
		if(a>b||a>c)
		{
			System.out.println("print a value"+a);
		}
		
		else
		{
			System.out.println("printing c value "+c);
		}
		
		
	}
	


	
	public static void main(String[] args)
	{
		//creating object for non static method
		IfElseDemoProgram ifobj=new IfElseDemoProgram();
		ifobj.ifElseDemo(20, 45, 30);
		
	}

}

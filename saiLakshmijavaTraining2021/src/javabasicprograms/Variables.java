package javabasicprograms;
import methodprograms.StaticMethodDemo1;

//import basicprograms.PublicAccessModifier;

public class Variables {
    public static  int a= 20;
 public static     int b=10;
   public static  int x=a+b;
   public  static int c=a*b;
    public static int p=a-b;
    public static int q=a/b;
    		  
	public static void main(String[] args) {
		
	System.out.println(a+b);
	System.out.println(a);
	System.out.println(p);
	System.out.println(q);
		//calling other package public accsess modifier static variable:classname.variable;
	System.out.println("calling  other package classmember static variables:" +StaticMethodDemo1.a);
	
	System.out.println("calling anoter package static method:");
	StaticMethodDemo1.division();
	
	//calling other package parameterised public accsess modifier static method: classname.methodname(datatype a,datatype b);
	System.out.println("calling other package class parameterised method:" );
			StaticMethodDemo1.maximumValue(90, 450);
	//calling return type static method under main method in another package class
	//datatype variable name=classname.returntypemethod());
	
	long mathmax3=StaticMethodDemo1.maximumValue(100,3000);
	
	System.out.println("callling return type value in another package class:"+mathmax3);
//	calling return static method in print statement
	System.out.println("the out put value is:"+StaticMethodDemo1.maximumValue(200, 2000));
			
	
	
	//System.out.println("calling other package public access modifier static variable:"+PublicAccessModifier.a);
	//System.out.println("calling other package public access modifier static variable:"+PublicAccessModifier.b);
	//System.out.println("calling other package public access modifier static variable:"+PublicAccessModifier.x);
	
		// TODO Auto-generated method stub

	}

}

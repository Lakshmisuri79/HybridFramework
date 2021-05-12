package basicprograms;

public class Numbers {
	static int a=1;
	static int b=8;
	//static int c=a+b;	
	static int x=a*b;
	static int y=a/b;
	public static String H ="SWEET HOME";
	
		public static void main(String[] args) {

				
			 System.out.println(a+b);
			 System.out.println(x);
			 System.out.println(H);
			 
			 //calling another class methods
			 
			 AccessModifierDemo.m1();
			 
			 System.out.println("Callind another class method:");
			 //calling another class variables
			 System.out.println("I am calling another  class modifier variable:" +AccessModifierDemo.a);
			 
			 
			 
			 
		     
		
		
         
	}

}

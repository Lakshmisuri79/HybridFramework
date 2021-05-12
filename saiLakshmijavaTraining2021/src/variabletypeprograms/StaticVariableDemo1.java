package variabletypeprograms;

public class StaticVariableDemo1 {
	private int a=30;
	static char c='a';
	protected static String s="JAVA";
	public static final double d=2.5f;
	String s4="LAKSHMI";
	
	public static void multiply()
	{
		double multiply=c*d;
		System.out.println("Out put of multiply is:"+multiply);
	}
	protected void stringdemo()
	{
		String s1="PROGRAM" ;
				String s2=s+s1;
				System.out.println("output of s2:"+s2);
				String s3=s2+a;
				System.out.println("output is s3"+s3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiply();
		//create objet for the class
		StaticVariableDemo1 svdobj=new StaticVariableDemo1();
		//calling non static variable
		String s5=svdobj.s4;
		System.out.println("output is:   "+s5);
		svdobj.multiply();
		
	}

}

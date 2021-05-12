package exceptionhandlingProgram;

public class NullPointerExceptionDemo {
	static String s=null;
	static String s3="    SELENIUM";
	static String s4="JAVA ";
			static String s5="PROGRAM";
	
	
	public static void stringOperations()
	{
		 String s1="JAVA";
		
		
		 try {
			String str=s1.concat(s);
			 System.out.println("str value is:"+str);
		} catch (NullPointerException ne) {
			System.out.println("Catch block startrs here");
			ne.printStackTrace();
			System.out.println("Exception message is:"+ne.getMessage());
			System.out.println("Exception cause is:"+ne.getCause());
					}
		 finally
		 {
			 System.out.println("Finally block start here");
			 System.out.println("Finally block always executed een exception occurs or not");
		 }
		 System.out.println("STr length is:"+s1.length());
		 String str1=s1.toLowerCase();
		 System.out.println("lower case of string is:"+str1);
	}
	
	protected static void StringOperations1()
	{
		
		System.out.println("Ia m executing stringOperator1()");
		try {
			String Uppercase=s.toUpperCase();
			System.out.println("STring upper case is:"+s);
		} catch (NullPointerException npe) {
			System.out.println("catch block starting here");
			npe.printStackTrace();
			String c=s4.concat(s5);
		System.out.println("after concat of string is"+c);
	
		}
		
		
		System.out.println("before the trim strin is:"+s3);
		String trim=s3.trim();
		System.out.println("after trim string is:"+trim);
	}
	
	
	public static void main(String[] args) {
		stringOperations();
		StringOperations1();

	}

}

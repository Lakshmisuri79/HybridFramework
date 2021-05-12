package exceptionhandlingProgram;

public class ThrowThrowsDemo {
	
	private static void validate(int age) throws InterruptedException
	
	{
		if(age<18) {
			throw new ArithmeticException("not elegible for vote");
		}
		else {
			Thread.sleep(3000);
			System.out.println("Elegible for vote");
		}
		/*finally
		{
			System.out.println("finally block will be executed");
		}*/
	}
	
	
	
	public static void stringDemo() throws NullPointerException
	{
		String s=null;
		String s1="java";
		String str=s1.concat(s);
		System.out.println("str value is:"+str);
	}
	
	public static void main(String[] args) throws InterruptedException, NullPointerException{
		validate(19);
		 //ThrowThrowsDemo thr=new  ThrowThrowsDemo();
		// thr.stringDemo();
		stringDemo();
		
		
		
		
	}

}

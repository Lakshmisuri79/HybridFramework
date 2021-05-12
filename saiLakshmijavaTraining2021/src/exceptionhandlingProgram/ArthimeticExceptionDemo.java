package exceptionhandlingProgram;

public class ArthimeticExceptionDemo {
	static int i=50,j;

	public static void main(String[] args) {
		try
		{
		int res=i/j;
		System.out.println("i/j value is :" +res );
		}
		catch(ArithmeticException ae)
		{
			System.out.println("catch block start executiuing");
			ae.printStackTrace();
			System.out.println("Exception message  is :"+ae.getMessage());
			System.out.println("get cause for exception:"+ae.getCause());
		    System.out.println("End of catch method");
		}
		finally
		{
			System.out.println("finally block statrted");
		}
		System.out.println("mathematical operations");
		int sum=i+j;
		System.out.println("sum value is"+sum);
		int sub=i-j;
		System.out.println("sub  value is:"+sub);
		int mul=i*j;
		System.out.println("multiplicaton value is"+mul);
		
		
		
		
	}

}

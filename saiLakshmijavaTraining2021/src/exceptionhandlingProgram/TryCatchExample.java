package exceptionhandlingProgram;

public class TryCatchExample {
	static int i=30, j;
	public static void arthimeticException()
	{
		try 
		{
			int res=i/j;//30/j here j valie =0
		}
	catch(ArithmeticException e)
		{
		System.out.println("catch block started executing");
		e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		arthimeticException();
		
	}

}

package oopsprogrammingpackage;

public class MethodOverloading {
	//by increasing the number of paramenters we an achieve method overloading
	public static  int sum(int a, int b)
	{
		System.out.println("sum of a,b:" +a+" "+b);
		return (a+b);
	}
	public static int sum(int a, int b, int c)
	{
		System.out.println("sunm of a,b,c:" +a+" "+b+" "+c );
		return(a+b+c);
	}
	//by increasing the datatype of the parameter we can achieve the method overloading
	public static  int sum(int a, float b)
	{
		System.out.println("sum of a,b:" +a+" "+b);
		return (int) (a+b);
	}
	/* method over loading is not posiible  by changing the return type of the method
	public static  float sum(int a, int b)
	{
		System.out.println("sum of a,b:" +a+" "+b);
		return (int) (a+b);
	}*/
	
	//can we overload main method----yes
	
	
	public static void main(String str)
	{
		System.out.println("started executing the main() with string:");
		str="HELLO"+str;
		System.out.println("str value:"+str);
		
	}
		
		public static void main(int a)
		{
			System.out.println("started executing the main() with integers");
			a=a+6;
			System.out.println("a value is" +a);
		}
	
	public static void main(String[] args) {
		System.out.println("int a and int b sum are:" +sum(8,9));
		System.out.println("int a and float b sum are:"+sum(5,9.0F));
		System.out.println("int a,int b, int c sum is:"+sum(2,3,4));
		main("lakshmi");
		main(5);

	}

}

package basicprograms;


public class StaticDemo1 {
	//accessmodifier static datatype valuename=value;
	public static int a=10;
	public static int b=20;
	static	int C;
	static	int C1;
	static	int D;
	 private static String str="STATICS METHODS";
	 protected static char  ch='A';
	 

	//static method without parameters
	public static void m1()
	{
		String s1="JAVA";
		String s2="PROGRAM";
		String s3;
		s3=s1.concat(s2);
		System.out.println("OUTPUT IS:"+s3);
		
	}

	private static void m2()
	{
		
		boolean B=(a==b);
		System.out.println("OUTPUT VALUE OF B (10=20): "+B);
	}
	protected static void m3()
	{
		System.out.println("BEFORE USING SUBSTRING METHOD OUT PUT IS: "+str);
	String str1=str.substring(7, 12);
	System.out.println("AFTER USING SUBSTRING METHOD OUT PUT IS"+str1);
	}
	//static method  parameters
	//accessmodifier static void main(datatype p1, datatype p2);
	public static void m4(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("OUT PUT OF Z=x*y:"+z);
	
	}
	public static void m5(int x1, int y1)
	{
	int z1;
	z1=x1*y1;
	System.out.println("OUT PUT OF Z1=x1*y1:" +z1);
	}
	
	public static void div(int d1, int d2)
	{
		int d3;
		d3=d1/d2;
		System.out.println("OUT PUT OF Z3=d1/d2 :"+d3);
	}
	//method without void key word
	
	public static int multiply1(int A, int B)
	{
	
		C=A*B;
		return C;
	}
	
public static int multiply2(int A1, int B1)
      {

	C1=A1*B1;
	return C1;
      }
	
public static int div1(int d1, int d2)
{
	
	D=d1/d2;
	return D;
}

	
	public static void main(String[] args) 
	{
		
		m1();
		m2();
		m3();
		m4(10,5);
		m5(10,1);
		div(10,2);
		
		multiply1(10,10);
		multiply2(10,1);
		div1(5,1);
		System.out.println("OUT PUT VALUE OF MULTIPLY1 METHOD:"+C);
		System.out.println("OUT PUT VALUE OF MULTIPLY2 METHOD:"+C1);
		System.out.println("OUT PUT OF THE DIVISION:"+D);
			

		
		// TODO Auto-generated method stub

	}
	

}

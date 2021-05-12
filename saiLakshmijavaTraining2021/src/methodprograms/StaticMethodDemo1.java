package methodprograms;

public class StaticMethodDemo1 {

	
	public static int a=20; 
	public static int c=100;
	private static double b= 700;
	static float f=6.5f;
	protected static long l=50000L;
	protected static String s="JAVA SELINIUM PROGRAM";
	protected static String s1="MADHAV";
	
	//accessmodifier stativ void methodname()
	public static void division()
	
	{
	 int rimval=(c+a)%a;
	 System.out.println("Remainder valie is:"+rimval);
	 
	}
	protected static void stringClass()
	{
		System.out.println("BEFORE USING SUB STRING OUTPUT IS: JAVA SELINIUM PROGRAM");
		String s2=s.substring(5, 13);
		System.out.println("AFTER USING SUBSTRING OUT PUT IS:"+s2);
		
	}
	//accessmodifier static void methodname(datatype d1, daatatype d2)
	static void division1(long l1,int l2,int i)	
	{
		
		long div=(l1*l2)/ i;
		System.out.println("The value of div:" +div);
	}
	//accessmodifier stataic datatype methodname()
	private static double piValue()
	{
		double PIVAL=Math.PI;
		return PIVAL;
	
	}
	

	//accessmodifier static returntypemethodname(datatype) methodname(datatype d1, datatype d2...)
	public static long maximumValue(int a1, long b1)
	{
		System.out.println("I am printing maximum value using static static return type method:");
		//datatype variablename=classname.returntypestaticmethod();
		long maxval=Math.max(a1, b1);
		
		return maxval;
	
		
	}
	static float maximumValue1(float f1,double d1)
	{
		System.out.println("I am printing maximum value using static static return type method:"); 
		//datatype variablename=classname.returntypestaticmethod();
		float maxval1=(float) Math.max(f1, d1);
		return maxval1;
		
	}
	private static double maximumValue2(double d2,double d3)
	{
		System.out.println("I am printing maximum value using static static return type method:"); 
		//datatype variablename=classname.returntypestaticmethod();
		double maxval2=Math.max(d2, d3);
		return maxval2;
		
	}
	protected static int maximumValue3(int a2,int a3)
	{
		int maxval3= Math.max(a2, a3);
		return  maxval3;
	}
	public static double absoluteValue(double a)
	{
	double abs=Math.abs(a);

	return abs;
	
	}
	 
	/*public static double tanValue(double a)
	{
	double tanval=Math.tan(a);
	return tanval;
	}
	public static double sinValue(double a)
	{
//		System.out.println("hello::::::"+a);
	double sinval=Math.sin(a);
//	System.out.println("bye:::::"+sinval);
	return sinval;
	}*/
	/*public static double exponential(double a)
	{
	double exp=Math.exp(a);
	return exp;
	}*/
	
	
	public static void main(String[] args) {
		//return type static method syntax datatype variable name=returntypestatticmethod(datatype p1, datatypr p2..))
		long maxlong=maximumValue(10,10000);
		System.out.println("maximum value of int is:"+maxlong);
		float maxfloat=maximumValue1(4.6f,723.8);
		System.out.println("Maximum value of float is:" +maxfloat);
		double maxdouble=maximumValue2(9.8,8.45);
		System.out.println("Maximum value of double is:" +maxdouble);
		int maxint = maximumValue3(50,40);
		System.out.println("maximum value of int is:"+maxint);
		piValue();
		System.out.println("PI VALUE IS:" +piValue());
		division();
		division1 (100, 10,  20);
		double absvalue=absoluteValue(-7.4);
		System.out.println("value:"+absvalue);
		System.out.println("absolutevalue:" +absoluteValue(-8));
		stringClass();
		
/*double tanvalue=tanValue(45);
System.out.println("tan value:" +tanvalue);
double sinvalue=sinValue(45);
System.out.println("sin value:" +sinvalue);*/
//double expval=exponential(5);
//System.out.println("exponential  value:" +expval);

		
		
		// TODO Auto-generated method stub

	}

}

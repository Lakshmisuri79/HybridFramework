package methodprograms;

public class NonStaticPracticeDemo {
	private String s="              JAVA SELINIUM PROGRAM";
	public int a=11;
	float f= 7.5f;
	protected char c='a'; //a=97; A=65;
	
//accessmodifier void methodname(){logic}
	public void  charDemo()
	{
		int i1=c+a;
		System.out.println("Value of i1:"+i1);
		
	}
	
	//accessmodifier void methodname(int a, int b)
	private void swapMethod(int f1, int f2)
	  {
		System.out.println("BEFORE SWAPPING F1 Value :"+f1+"F2 VALUE IS:"+f2);
		int  f3=f1;
		f1=f2;
		f2=f3;
		System.out.println("AFTER SWAPPING F1 Value :"+f1+"F2 VALUE IS:"+f2);
	  }

	//accessmodifier datatype methodname(int a, int b)
	protected int getMaxValue(int a1, int b1)
	{
		int c1=Math.max(a1, b1);
		
		//int c1=getMaxValue(a1, b1);	
		return c1;
	}
	
	public double getMaxValue1(double d11, double d22)
	{
		double d33=Math.max(d11, d22);
		return d33;
	}
	protected float getMaxValue2(float f11,float f22)
	{
	float f33=Math.max(f11, f22);
	return f33;
	}
	
	//acccessmodifier datatype methodname()
String stringMethod()
	{
	System.out.println("BEFOER TRIMMING STRING VALUE IS:"+s);
		String s1=s.trim();
		return s1;
		
	}
public double getMinValue(double d1, double d2)

  {
	double c2=Math.min(d1, d2);
	//double c2 = getMinValue(d1, d2);
	return c2;
			
  }
protected float convertCelciusToFarenheattTemp(float ct)
{
	float ft=(float) ((ct*1.8)+32);
	return ft;
}
public float convertFarenheatToCelciusTemp(float ft)
{
	float ct=(float) ((ft-32)/1.8);
	return ct;
}
protected int gevMinValue1(int a11,int a22)
{
int a33=Math.min(67, 98);
return a33;
}

private long getMinValue2(long l2, long l3)
{
	long ll=Math.min(l2, l3);
	return ll;
}

float getMinValue3(float f11,float f22)
{
	float f33=Math.min(f11, f22);
	return f33;
}

	public static void main(String[] args)
	
	{
		//creating object
		//classname objref=new classname();
		NonStaticPracticeDemo nonobj=new NonStaticPracticeDemo();
		
		//using hash code method and print objref address
		//fetch the nonobj address using hashcode()of object calss
		int nonobjAddressVal=nonobj.hashCode();
		System.out.println("HASH CODE ADDRESS IS"+ nonobjAddressVal);
		//creating another object
		NonStaticPracticeDemo nonobj2=new NonStaticPracticeDemo();
		int nonobj2AddressVal=nonobj2.hashCode();
		System.out.println("HASH CODE OF ADDRESS nonobj2 :"+nonobj2AddressVal);
		boolean b=(nonobj==nonobj2);
		System.out.println("Comparing nonobj with nonobj2 using==operator:"+b);
		
		
		
		
		
		
		
		//calling non static variavles
		System.out.println("NON STATIC VARIABLE IS:"+nonobj.s);
		System.out.println("NON STATIC VARIABLE IS :"+nonobj.f);
		//calling non staticvoid method
				nonobj.charDemo();
				//calling non static void with parameterised method
		nonobj.swapMethod(17,34);
		//calling non static reaturn type with peremeterised method
		System.out.println("getmaxvalue of non static return type method:"+nonobj.getMaxValue(34, 23));
		System.out.println("GET MAX DOUBLE RETURN TYPE VALUE:"+nonobj.getMaxValue1(170, 230));
		System.out.println("GET MAX FLOAT RETURN TYPE VALUE:"+nonobj.getMaxValue2(4.5f, 3.5f));
		//calling non staic return type without parameterised method
		System.out.println("AFTER TRIMMING STRING VALUE IS"+ nonobj.stringMethod());
		System.out.println("getminvalue of non static return type method:"+nonobj.getMinValue(45, 67));
		//calling non staic return type without parameterised method
		System.out.println("non staic return type without parameterised method convert celcius to farenheat:"+nonobj.convertCelciusToFarenheattTemp(55));
		
		//calling non staic return type without parameterised method
			System.out.println("non staic return type without parameterised method convert farenheat to celcius:"+nonobj.convertFarenheatToCelciusTemp(131));
			
			//calling non static reaturn type with peremeterised method
			System.out.println("GET MIN INT VALUE RETURN TYPE METHOD:"+nonobj.getMinValue(345, 567));
			System.out.println("GET MIN LONG RTURN TYPE VALUE:"+nonobj.getMinValue2(100, 200));
			System.out.println("GET MIN FLOAT RETURN TYPE VALUE:"+nonobj.getMinValue3(4.5f, 9.8f));
			
			int a21=(int) (nonobj.a-nonobj.c+nonobj.f);
			System.out.println("THE VALUE OF a21 is:"+a21);
			System.out.println("THE MULTIPLY BETWEEN TWO NON STATIC VARIABLE IS:"+nonobj.a*nonobj.c/nonobj.f);
			
			}

	
}

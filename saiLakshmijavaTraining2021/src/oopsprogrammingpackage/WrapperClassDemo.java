package oopsprogrammingpackage;

public class WrapperClassDemo {
	
	public static void autoBoxingDemo()
	{
		//autoBoxing -Converting premitive data into object format   	is called autoBoxing
				int n=100;
				//converting into wrapper object
				Integer  obj=Integer.valueOf(n);
				System.out.println("Premitive data is"+" "+n+ "object is"+" "+obj);

	}

		protected static void unBoxingDemo()
		{
			//unboxing --converting wrapper object to premitive data 
			Integer obj=new Integer(250);
					//convearting into prmitiive format
					int n=obj.intValue();
					System.out.println("Premitive value is"+n); 
					
		//converting string object into int premitive data
		//	
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println("i int premitive value is"+" "+i);
		int sum=i+5;
		System.out.println("Sum value is "+sum);
		String s1=s+5;
		System.out.println("String s1 value is"+s1);
		
		//converting string to boolean
		String s2="true";
		boolean b=Boolean.parseBoolean(s2);
		System.out.println("after converting string to boolean boolean value is"+" "+b);
		}

		
		public static void wrapperObjectDeclaration()
		{
			//converting object into string format using tostring method
			Integer intobj=10;
			Long lobj=20000L;
			Double dobj=34.8976;
			String str=lobj.toString(); 
			System.out.println("str lenght is"  +str.length());
			
			
			
		}
	public static void main(String[] args) {
	
		autoBoxingDemo();
		unBoxingDemo();
		wrapperObjectDeclaration();
	}
	
	
}

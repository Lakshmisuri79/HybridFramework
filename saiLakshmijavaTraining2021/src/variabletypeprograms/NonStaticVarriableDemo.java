package variabletypeprograms;

public class NonStaticVarriableDemo {
	public int i=10;
	float f=3.4f;
	protected long l=100L;
	private char c='A';
	
	//accessmodifier void methodname()
	
		private void add()
		{
			long sum=i+l+c;
			System.out.println("out put of sum is:"+sum);
			
		}
	public void multiply()
	{
		double multiply=(i*f)*c;
		System.out.println("out put  value of multiply is:"+multiply);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object
		//syntax  classname refobj=new classname();
		NonStaticVarriableDemo nsvobj=new NonStaticVarriableDemo();
	//		calling non static variables
		//objref.nonstaticvariable;
		int X=nsvobj.c-nsvobj.i;
		System.out.println("out put of x:"+X);
		//calling non static method
		//syntax objref.staticmethod();
		nsvobj.multiply();
		
		
		

	}

}

package methodprograms;

public class InstanceMemberDemo {

	//accesmodifier datatype variable anme=vlue;
		public int i=45;
		public int a1=5;
		private float f= 4.5f;
		protected String s="JAVAPROGRAM SELENIUM";
		char c='a';
		/*
		 * This method is about charecter equal value
		 */
		
		//accessmodifier void methodname(){logic}
		private void charDemo()
		{
			System.out.println("started executing the InstanceDemo Class:  charDemo");
			int i1=c+3;
			char c1=(char) i1;
			System.out.println(i1 +"equal charecter is"+" "+ c1);
			//System.out.println("value of c1 is:" +c1);
			char c2=(char) (c+a1);
			System.out.println("c2 value is :"+c2);
					}
		/**
		 * This method is about swapping two integers using third variable
		 * @param x
		 * @param y
		 */
		 
		
		//accessmodifier void methodName(datatype p1,datatype p2){logic}
		public void SwapWithThirdVariable(int x, int y) 
		{
			System.out.println("executing InstaceMembersDemo--SwapWithThirdVAriable(int x, int y)");
			System.out.println("Before swapping x value is" + x + "y value is:"+y);
			int z=x;
			x=y;
			y=z;
			System.out.println("After swapping x value is" + x + "y value is:"+y);
					
		}
		//This method is returnning joing of  of two string
		protected String stringName(String s1 , String s2)
		{
		
		String s3=s1+s2;
		return s3;

		}
		public String stringConcat(String s4, String s5)
		{
			String s6=s4.concat(s5);
			return s6;
		}
		
	//	private  String subString( String s7,strings s8)
		//{
		  //    String s9=s7.substring(14, 22);
		    //  return s9;
	//	}
		//this method is returning pi value 
		protected double mathPi()
		{
			double pival=Math.PI;
					return pival;
		}
		
		

		
	
	public static void main(String[] args) 
	{
	//creating object
		//syntax classsname.refvar=new classname();
		InstanceMemberDemo insvar=new InstanceMemberDemo();
		//calling nons static variables syntax:objref.nonstaticvariable;
		System.out.println("value is:"+insvar.i);
		
		//calling non sattic method in the same class syntax:objref.non static methodname();
				insvar.charDemo();
				//	//calling non satticperameterised method in the same class syntax:objref.perameterised non static methodname();
			insvar.SwapWithThirdVariable(8,9);
			//calling non sattic return type perameterised method in the same class
			// syntax:datatype variablename=objref.nonstatricmethod();
			//System.out.println("the value is:"+variablename");
			String  str=insvar.stringName("JAVA SELENIUM", "PROGRAM");
			System.out.println("THE VALUE OF STRING IS:"+str);
			System.out.println("STRING CONCAT:" +insvar.stringConcat("LAKSHMI", "SURI"));
			System.out.println("the value of pi si:" + insvar.mathPi());
		
		
		// TODO Auto-generated method stub

	}

}

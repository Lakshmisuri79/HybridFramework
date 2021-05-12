package exceptionhandlingProgram;

public class NumberFormatException {
	
	public static void main(String[] args) {
		 
		String s="java";
		//convert string into integer premitive datatype
		//int i=Integer.parseInt(s)
		int i=0;
				try {
				 i=Integer.parseInt(s);
					System.out.println("Premitive i value is:"+i);
				} catch (java.lang.NumberFormatException e1)
				{
				System.out.println("catch block start here");
					e1.printStackTrace();
				}
		int res=i+50;
		System.out.println("value of res is:"+res);
		String s1=s+i;
		System.out.println("String si valur is:"+s1);
		
				
		
	}
}

package oopsprogrammingpackage;

public class Rectangular extends Square {
	
	public void peremeter1(int a,int b, int c, int d)
	{
		int per;
		per=2*(a+b);
		System.out.println("Peremeter of the rectangular is:"+per);
		
	}
	//over ridden method
	public void area()
	{
		int x=50;
		int y=30;
	    
int	area= x*y;
System.out.println("AFTER CALCULATING OF THE AREA OF RECTANGULAR IS :"+x +"* "+y+" "+"= "+area);
		
	}//overridden method
	public void paralell()
	{
		System.out.println("i AM EXECUTING THE RECTANGULAR CLASS PARALLELL()");
		System.out.println("RECTANGULAR HAS OPPOSITE SIDE  PARLLELL");
	}

	
	
	public void isoceleasTraingles()
	{
		System.out.println("I AM EXECUTING THE RECTANGLES CLASS ISOCSLESTRIANGLE METHOD()");
		System.out.println("RECTANGULAR HAS FOUR  ISOCSLESTRAINGLES INSIDE");
	}
	protected int area1(int a1,int b1)
	{
	int 	area1=a1*b1;
		return area1;
		
		
	}
	

	public static void main(String[] args) {
		//runtime polymorphysim using upcasting syntax is
		//parent class refvar=new child class()
		Square sqvar=new Rectangular();
				sqvar.area();
				sqvar.isoceleasTraingles();
				sqvar.paralell();
				sqvar.peremeter(10, 30);
				
				
				//calling child calss  over ridden method and child class  and pareant class all methods
				//synatax child class refvar=new child class();
			Rectangular recvar=new Rectangular();
				recvar.area1(10,50);
				System.out.println("area of the rectangular "  + recvar.area1(10,20));
				recvar.peremeter1(10,20,10,20);
				
				
				
	}

}

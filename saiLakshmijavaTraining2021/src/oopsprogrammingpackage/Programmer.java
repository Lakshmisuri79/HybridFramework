package oopsprogrammingpackage;

public class Programmer extends Manager
{
	//Manager(here Manager class is parent class of Progerammer class has a parameterised constructor we r extend 
	//that parent class to child class


	public Programmer(double bonus) {
		//super keyword  is areferece variablerefer immediate parent class objects(parent class instance variables)
		//you can invoke parent class constructor in the child class.(here bonus is the parent class constructor)
		//parent class constructor logic we r calling using suoer key word
		super(bonus);
		 
	}
	
	public static void designAppliction()
	{
		System.out.println("EXecuting the programmer clas static methods:designAppliction()") ;
		System.out.println();
	}
    protected void fixBugs()
    {
    	System.out.println("Executing the programmer class-Non static method-fix bugs");
    	System.out.println("fix the high priority bugs");
    }
    
    
    
	public static void main(String[] args) {
		//calling programmer class static methods
		designAppliction();
		//calling Manager class static mthods
		manageTeam();
	//	calling Employee class static methods
		sendNotification();
		setEmpCompany("micro soft");
		//calling non static methods  of all parent class and child class we need to create a object for child class
		Programmer pobj=new Programmer(200000.00);
		//calling Programmer class methods
		pobj.fixBugs();
		//calling non static methods of Manager class
		pobj.attendStatusCall();
		//calling employee class non staic methods
		pobj.setEmpid(28018);
		pobj.setEmpname("SAI");
		pobj.setSalary(200000);
		
		System.out.println("PROGREMMER ID" +pobj.getEmpid());
		System.out.println("PROGREMMER NAME" +pobj.getEmpname() );
		System.out.println("PROGREMMER SALARY" +pobj.getSalary());
		System.out.println("PROGREMMER BONUS" +pobj.getBonus());
		System.out.println("PROGRAMMER "+getEmpCompany());
		
		
		
		
	}

}

package oopsprogrammingpackage;
//this class is child class
//parent class is employee class.
//i want access all employee class methods  here using  extends key word
public class Manager extends Employee 
//manager is child class and employee is parent class
//once we are using extend keyword manager class is prililage to use employee class mrethods.

{
	private double bonus;
//we can create methods and variable for this method also
//pass this bonus value using the constructors or setter methods
//here we can pass the value using the parameterised constructor
	
	public Manager(double bonus)
	{
		this.bonus=bonus;
	}
     //access the value in other places  using getter method
	public double getBonus()
	{
		return bonus;
	}
	//creting one static and non static methods
	
	protected static void manageTeam()
	{
		System.out.println("***********started executing manager class static method manageTeam()**************");
		System.out.println("Assign the tasks to the team memabers and make it done");
	}
	
	protected void attendStatusCall()
	{
		System.out.println("***********started executing manaager class non static method manageTeam()***************");
		System.out.println("provide project status report ");
		
	}
	
	
	public static void main(String[] args) {
		//calling Manager class (child class) static methods -directly
		manageTeam();
		//calling Emplyee Class(parent ) Static methods -directly
		sendNotification();
		setEmpCompany("Amazon");
		//calling  "Manager" (child class ) and "Employee" (parent class) non staic method using object for child class
		//Manager class  is parameterised constructor because of that we can pass a values inside the parameter.
		Manager mobj=new Manager(100000.00);
		//calling Manager class(child class) non staic methods
		mobj.attendStatusCall();
		//calling parent class non staic methods.
		mobj.setEmpid(23456);
		mobj.setEmpname("LAKSHMI");
		mobj.setSalary(200000.00);
		//to get the values 
		System.out.println("PRINT THE MANAGER DETAILS:");
		System.out.println("MANAGER ID" +mobj.getEmpid());
		System.out.println("MANAGER NAME:" +mobj.getEmpname());
		System.out.println("MANAGER SALARY" +mobj.getSalary());
		System.out.println("MANAGER BONUS" +mobj.getBonus());
		System.out.println("MANAGER COMPANY IS:" +getEmpCompany());
		
		
	}

}

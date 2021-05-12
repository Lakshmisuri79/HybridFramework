package oopsprogrammingpackage;

public class Tester extends  Employee
{
	protected static void designTestCases()
	{
		System.out.println("statted executing the tester class static method: designTestCases() ");
		System.out.println("design the test cases based on the requirements");
	}

	public void ExecuteTestCases()
	{
		System.out.println("started executing the tester class non static method: ExecuteTEstCAses()");
	}
	public static void main(String[] args) {
		designTestCases();//this is from tester class static method
		sendNotification();//this emplyee class(parent class)static method
		//creating aobject for child class because we need call parent class and child class non static methods.
		//syntax is:childclass refobj=new childclass();
		Tester testobj=new Tester();
		testobj.setEmpid(12345);
		testobj.setEmpname("SAI");
		testobj.setSalary(-2000000);
		testobj.setEmpCompany("COGNIZANT");
		 System.out.println("TEster id is" +testobj.getEmpid());
		 System.out.println("Tester name is" +testobj.getEmpname());
		 System.out.println("tester Salary is" +testobj.getSalary());
		System.out.println("tester company name is" +testobj.getEmpname());
		
		
	}

}

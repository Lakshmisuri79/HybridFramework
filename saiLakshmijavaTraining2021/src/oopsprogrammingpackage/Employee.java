package oopsprogrammingpackage;
//this program tells about the inheritance topic
//here employee class is parent class
//one another class named "manager" is child class

public class Employee {
	private int Empid;
	private double Salary;
	private static String EmpCompanyname;


private String  Empname;
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	this.Empname = empname;
}
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	this.Empid = empid;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double Salary) {
	
	if(Salary>0)
	{
	this.Salary = Salary;
	}
	else
	{
		this.Salary=0.0;
	}
}
public static String getEmpCompany() {
	return EmpCompanyname;
}
public static void setEmpCompany(String empCompany) {
	Employee.EmpCompanyname = empCompany;
}


protected static  void sendNotification()
{
	System.out.println("started executing employee class");
	System.out.println("salary is deposited into your account");
}
private void getAccess()
{
	System.out.println("statted executing the Emplyee class");
	System.out.println("Swipe the right access card");
}



}

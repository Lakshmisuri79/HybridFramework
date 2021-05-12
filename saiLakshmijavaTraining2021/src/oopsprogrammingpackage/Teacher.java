package oopsprogrammingpackage;

public class Teacher extends School
{
	public  String schoolname="COPPELL HIGH SCHOOL";
	public String subject="english";
	public String TeacherName="sarojini";

	
	
	public Teacher()
	
	{
		
		super();//calling parent class constructor
		 
		System.out.println("this is TeacherClass defalut constructor" );
	}
	
	//override method
	
	public void grade()
	{
		System.out.println("I am executing teachers classgrade()");
		System.out.println("I am overriding this method");
				
		System.out.println(" Enter the student class grade");
		System.out.println("enter the student roll number");
	}
	
	
	public void schoolDetails()
	{
		System.out.println("statred printing Teacher classschoolDetails() method:");
		System.out.println(" Child class(Teacher class)School name is:" +super.schoolname);
		System.out.println("Child Class(Teachers class)Teacher name is:" +this.TeacherName);
		System.out.println("Child class (TEachers class)name of the subject:" +this.subject);
		System.out.println("Parent class (School class)teacher name is:" +super.TeacherName);
		System.out.println("Parent class(School class) name of the subject:"+super.subject);
		
		System.out.println("");
		//calling teacher class nons tatic method
		this.grade();
		//calling parent class non static method
		super.grade();
		
	}
	
	public static void main(String[] args){
		//calling child calss  over ridden method and child class  and pareant class all methods
		//create object for child class
		Teacher tc=new Teacher();
		tc.schoolDetails();
		tc.Studentname();
		tc.studentMarks();
		
		
		
	}

}

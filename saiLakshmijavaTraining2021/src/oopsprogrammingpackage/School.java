package oopsprogrammingpackage;

import java.util.Scanner;

public class School {
	public  String schoolname="COPPELL HIGH SCHOOL NORTH";
	public String subject="COMPUTERS";
	public String TeacherName="SAI";
	
	//constructor
	public School()
	{
		System.out.println("This is School class default cosntructor");
	}
	//overridding method
	public void Studentname()
	{
		 String str;
		Scanner scobj=new Scanner(System.in);
		System.out.println("enter the student name");
		str=scobj.next();
		
		
	}
	public void subject(String str)
	{
		System.out.println("ENTER THE SUBJECT NAME");
	}
	
protected void grade()
{
	System.out.println("I am executing the School classgrade()");
}

protected void studentMarks()
{
	
	float m;
	Scanner scobj1=new Scanner(System.in);
	System.out.println("ENTER THE MARKS");
	m=scobj1.nextFloat();
	
	
	if(m>=93)
	{
		System.out.println("student has got a grade : A+");
	}
	else if(m>=89&&m<93)
	{
		System.out.println("student got a grade :A");
			
	}
	else if(m>=85&&m<89)
	{
		System.out.println("Student got a grade :B+");
	}
	else if(m>=80&&m<85)
	{
		System.out.println("student got a grade B-");
			
	}
	else if(m>=70&&m<80)
	{
		System.out.println("Student got a grade B");
	}
	else
	{
		System.out.println("student got fail");
	}
	
}
	public static void main(String[] args) {
		
	}

}

package javabasicprograms;

import methodprograms.StaticMethodDemo1;
import methodprograms.ProtectedDemo;
import methodprograms.StaticMethodDemo1;

public class CallAnotherPackageProtectedMembers extends ProtectedDemo { 

	public static void main(String[] args)
	
	{
		
		
		System.out.println("Another package protected static variable:"+ProtectedDemo.l);
		//calling another package protected static void amethod
		stringOne();
		//calling another package void perameterised method
		swapValue(45,90);
		//calling another package return type non perameterised method
		//syntax:variables,method,parameterised methods return type methods call directly we need not use any class name
		System.out.println("the round value of float f is:"+mathValue());
		//calling another package return type perameterised method
		System.out.println("multiplication of x and y is:"+mathValue1(70, 5));
		StaticMethodDemo1.division();
		
		
		
		
				// TODO Auto-generated method stub
//System.out.println("Another package protedvariable is:"+s1);
//stringClass();
//int maxint=maximumValue3(40,69);
//System.out.println("THE MAXIMUM INT VALUE IS:"+maxint);
 
 
	}

}

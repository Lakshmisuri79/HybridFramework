package javabasicprograms;
//import static methodprograms.StaticMethodDemo1.absoluteValue;
//import static methodprograms.StaticMethodDemo1.maximumValue;
//import static methodprograms.StaticMethodDemo1.division;
//import static methodprograms.StaticMethodDemo1.a;
import static methodprograms.StaticMethodDemo1.*;


public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("staticMethodDemo class static variable:");
		division();
		double abs1=absoluteValue(-7);
		System.out.println("absolute value:" +abs1);
		//datatype variablename=returntype static methodname();
		long maxlongval=maximumValue(200,2000);
		System.out.println("Maximum value of:"+maxlongval);
				
	}

}

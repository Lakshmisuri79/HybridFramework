package javabasicprograms;
import methodprograms.NonStaticPracticeDemo;

public class CallingNonStaticMEmbersAnotherPackage {

	public static void main(String[] args) 
		
	{
		//create bobject
		NonStaticPracticeDemo nonobj2 =new NonStaticPracticeDemo();
		//calling non ststic variables
		System.out.println("non static anotherr package variable is:"+nonobj2.a);
		//calling non static void method
		nonobj2.charDemo();
		//calling parameterised return type type method
		System.out.println("Min valaue:"+nonobj2.getMinValue(34, 89));
		
		System.out.println("max value:"+nonobj2.getMaxValue1(123, 234));
		System.out.println("FARENHEAT TO CELCIUS IS:"+nonobj2.convertFarenheatToCelciusTemp(75));
	
		
		
		// TODO Auto-generated method stub

	}

}

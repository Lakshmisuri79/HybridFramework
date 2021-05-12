package methodprograms;

public class CallingNonStaticMembersinAnotherClass {

	public static void main(String[] args) 
		
	{
		
		NonStaticPracticeDemo nonobj1=new NonStaticPracticeDemo();
		System.out.println("NonStaticPracticeDemo class non static variable:"+nonobj1.a);
		
		System.out.println();
		nonobj1.charDemo();
		
				System.out.println("The minvalue of return type another class :"+nonobj1.getMinValue(23, 67));
				System.out.println("The minvalue of double another class non static method:"+nonobj1.getMinValue(234, 123));
				System.out.println("The minvalue of flaot another class non static method:"+nonobj1.getMinValue3(3.4f, 6.5f));
				System.out.println("The maximum value of int another class non static method:"+nonobj1.getMaxValue(23, 34));
				System.out.println("The maximum value of double another class non static method:"+nonobj1.getMaxValue1(120, 2345));
				System.out.println("The maximum value of flaot another class non staitc method:"+nonobj1.getMaxValue2(7.9f, 9.6f));
				System.out.println("Convert Celcius to Farenhaeat temp reaturn type method:"+nonobj1.convertCelciusToFarenheattTemp(120));
				System.out.println("Convert farenheat to celcius temp return type method:"+nonobj1.convertCelciusToFarenheattTemp(100));
			System.out.println("Trimmin string is:"+nonobj1.stringMethod());
		// TODO Auto-generated method stub

	}

}

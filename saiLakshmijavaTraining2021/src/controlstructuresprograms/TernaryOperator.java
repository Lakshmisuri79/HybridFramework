package controlstructuresprograms;

public class TernaryOperator {
	
	
	public static void ternaryOperatorExample()
	{
		int n1=5;
		int n2=10;
		System.out.println("enter the first number"+n1);
		System.out.println("enter the second numbear"+n2);
		//syntax of ternaryoperator
		//variable = Expression1 ? Expression2: Expression3
		int res=(n1>n2)?(n1+n2):(n1-n2);
		System.out.println("result:"+res);
		
		
	}
	
	public static void ternaryOperatorExample1(int n1, int n2)
	{
		//int n1=5;
		//int n2=10;
		System.out.println("enter the first number"+n1);
		System.out.println("enter the second numbear"+n2);
		//syntax of ternaryoperator
		//variable = Expression1 ? Expression2: Expression3
		int res=(n1>n2)?(n1+n2):(n1-n2);
		System.out.println("result:"+res);
		
		
	}
	
	
	public static int ternaryOperatorExample2(int n1, int n2)
	{
		//int n1=5;
		//int n2=10;
		System.out.println("enter the first number"+n1);
		System.out.println("enter the second numbear"+n2);
		//syntax of ternaryoperator
		//variable = Expression1 ? Expression2: Expression3
		int res=(n1>n2)?(n1+n2):(n1-n2);
		System.out.println("result:"+res);
		return res;
		
	}
	
	public static void terinaryEvenNumber(int number)
	{
		//int number=3;
		String msg=(number%2==0)?"the number is even":"the number is odd";
		System.out.println(msg);
	}
	public static void main(String[] args) {
		ternaryOperatorExample();
		ternaryOperatorExample1(20,10);
		ternaryOperatorExample1(2,10);
		terinaryEvenNumber(6);

	}

}

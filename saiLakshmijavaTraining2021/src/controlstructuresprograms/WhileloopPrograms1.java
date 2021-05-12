package controlstructuresprograms;

public class WhileloopPrograms1 {
	
	/*
	 * this method prints 5 divisables
	 */
	public static void fivedivisable(int n)
	{
		System.out.println("I AMPRING FIVE DIVISABLE PARAKETERISED METHOD");
		int i=1;
		while(i<=n)
		{
			//logic
			if(i%5==0)
			{
				System.out.print(i+"\t");
			}
			//increment
			i++;
		}
		System.out.println();
		System.out.println("*************************END OF THE METHOD**********************");
	}
	
	
	
	/*
	 * This method prints oddnumbers in decending order
	 */
	private static void oddNumbers(int maxval)
	{
		System.out.println("I AM PRINTING ODD NUMBERS MAX VAL TO 1");
		int i=maxval;
		while(i>=1) 
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
				
			}
			i--;
		}
		System.out.println();
		System.out.println("**********************END OF THE METHOD***************");
	}
	/*
	 * this method printing alphabets A to Z
	 */
	static void alphabets()
	{
		System.out.println("i am printiong capital letters");
		char c='A';
		while(c<='z')
			{
			System.out.print(c+"\t");
			c++;
			}
		System.out.println();
		System.out.println("************************END OF THE METHOD*******************");
	}
	/*
	 * this methods prints Ascicharecters of A toZ
	 */
	protected static void asciCharecters()
	{
		System.out.println("I AM PRINTING ASCICHARECTERS OF 'A'TO 'Z'");
		int c='A';
		while(c<='Z')
		{
			System.out.print(c+"\t");
			c++;
		}
		System.out.println();
		System.out.println("******************END OF THE METHOD*****************");
				
	}
	/*
	 * This method prints multiplication table
	 	 */
	public static void multiplicationTable(int tablenumber)
	{
		int i=1;
		while(i<=20)
		{
			
			System.out.println(+tablenumber+"*"+i+" "+(tablenumber*i));
		}
		System.out.println();
		System.out.println("******************END OF THE METHOD*****************");
	}
	/*
	 * This method returns Oddnumbers,Even Numbers sum in the given range.
	 */
	
	private static void sumofEvenAndOddNumebrs(int a)
	{
		int sumodd=0;
		int sumeven=0;
		int i=1;
				while(i<=a)	{
					
					if(i%2==0){
						
						sumeven=sumeven+i;
					}	else {
							sumodd=sumodd+i;
						}
					i++;
					
					}
				System.out.println("sum of even number value is"+sumeven);
				System.out.println("sum of odd number value is "+sumodd);
				System.out.println("******************END OF THE METHOD*****************");
				
				}
	/*
	 * this meathod return the factorial of given value
	 * ex: 3 factorial 3*2*1=6
	 */
	
	protected static int getfactorial(int n)
	{
		System.out.println("This method printing factorial value");
		//declaring factorial value
		int fact=1;
	//	declaring while and start as 1
		int i=1;
		while(i<=n)//1<3-T//2<=3-T//3<=3-T
		{
			fact=fact*i;//1*1=1//1*2=2//2*3=6
			i++;
			
		}
		return fact;
							
	}
	
	
	

	public static void main(String[] args) {
		fivedivisable(50);
		oddNumbers(100);
		alphabets();
		asciCharecters();
		 multiplicationTable(7);
		 sumofEvenAndOddNumebrs(50);
		 int fact1=getfactorial(5);
		 System.out.println("factorial value is"+fact1);
		 
	}

}

package controlstructuresprograms;

public class WhileLoopPrograms {
	
	
	public static int sumOfNaturalNumbers(int n)
	{
		System.out.println("SUM OF N NATURAL NUMBERS IS:");
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
			System.out.print(sum +"\t");
			
				
		}
		
		
		System.out.println();
		System.out.println("**************************END OF METHOD******************************************");
		
		return sum;
	}
	
	
	private static void asciCharectersofztoa()
	{
		System.out.println("ASCICHARECTER VALUE  OF z TO a:");
		int i='z';
		while(i>='a')
		{
						
		i--;
		System.out.print(i+"\t");
				
		}
		System.out.println();
		System.out.println("**********************END OF THE METHOD************************");
		
		
			}
	
	
	static void printevenNumbers(int n)
	{
		System.out.println("I AM PRINTING EVEN NUMBERS 1 to GIVEN MAX AVLUE RANGE");
		int i=1;
		while(i<=n)
		{
			if(i%2==0) 
			{
				System.out.print(i+"\t");
			}
			i++;
			
		}
		System.out.println();
		System.out.println("**********************END OF THE METHOD************************");
		
	
		
		
	}
	static int printevenNumbers1(int n1)
	{
		System.out.println("I AM PRINTING EVEN NUMBERS 1 to GIVEN MAX AVLUE RANGE1");
		int i=1;
		while(i<=n1)
		{
			if(i%2==0) 
			{
				System.out.print(i+"\t");
			}
			i++;
			
		}
		System.out.println();
		System.out.println("**********************END OF THE METHOD************************");
		
	
		return i;
		
	}
	
	
	protected static void alphabetsztoa()
	{
		System.out.println("I AM PRINTING SMALL ALPHABETS z TO a");
		char i='z';
		while(i>='a') {
			System.out.print(i+"\t");
			i--;
		}
		System.out.println();
		System.out.println("**********************END OF THE METHOD************************");
		
		
	}
	
	public static void main(String[] args)
	{
		
		sumOfNaturalNumbers(20);
		asciCharectersofztoa();
		printevenNumbers(50);
		alphabetsztoa();
		printevenNumbers1(40);
	
}
}

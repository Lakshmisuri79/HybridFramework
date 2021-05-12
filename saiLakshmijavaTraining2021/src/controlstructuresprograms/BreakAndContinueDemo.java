package controlstructuresprograms;

public class BreakAndContinueDemo {

	public static void breakprogram()
	{
		for(int i=1; i<=10;i++)
		{
			if(i==5)
			{
				break;// terminate the if loop if i==5
			}
			System.out.println(i+" ");
		}
		System.out.println("end of the loop");
	}
	
	
	
	public static void continueProgram()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;
							
			}System.out.print(i+" \t");
			
			
			
		}
		System.out.println("End of the loop");
		
	}
	public static void main(String[] args) {
		 breakprogram();
		 continueProgram();
		 
	}

}

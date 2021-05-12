package controlstructuresprograms;

public class NestedForLoops {

	
	
	public static void ExampleOfNEstedForLoop()
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.println(i+" ,"+j);
			}
		}
	}
	
	
	
	public static void pattern()
	{
		int maxrows=10;
		int maxcoloums=10;
		for(int i=1; i<=maxrows; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
	
	public static void trianglePatteren()
	{
		final int size =7;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		}
	public static void asciAlphabets()
	{
		int i=0;
		for(char c='A'; c<='Z';c++)//A<Z-T
		{
						
			for(i='A';i<='Z';i++)//65<90
				
				if(c==i)
				{
					System.out.println(c+" "+i);
				}
			}
		
		System.out.println();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOfNEstedForLoop();
		pattern();
		trianglePatteren();
		//creating object for non static method
				ForLoopPrograms mobj=new ForLoopPrograms();
				mobj.mutiplicationTable();
				asciAlphabets();
				
	}

}




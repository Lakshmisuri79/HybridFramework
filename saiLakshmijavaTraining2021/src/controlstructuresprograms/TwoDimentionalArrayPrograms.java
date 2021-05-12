package controlstructuresprograms;

public class TwoDimentionalArrayPrograms {

	
	public static  void twoDimentionalArray()
	{
		int a[][]= {{1,2,3},{3,4,5},{6,7,8}};
		int b[][]= {{1,2,3},{3,4,5},{6,7,8}};
		 int c[][]=new int[3][3];
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 c[i][j]=a[i][j]+b[i][j];
				 System.out.print(c[i][j]+"\t");
			 }
		 }
		 System.out.println(" ");
		 System.out.println("***********END OF THETWO DIMENTIONAL ARRAY ADDING METHOD***************");
		 
	}
	
	
	
	
	public static  void twoDimentionalSubtraction()
	{
		int a[][]= {{1,2,3},{6,7,8},{9,8,7}};
		int b[][]= {{0,1,2},{9,9,7},{7,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			 c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+" \t");
		
		   }
    	}
		System.out.println(" ");
		System.out.println("***********END OF THETWO DIMENTIONAL ARRAY SUBTRACTION METHOD***************");
	}	
		
		
		
		
public static void twoDimentionaltransposeMatrix()
{
	int original[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int transpose[][]=new int[3][3];
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=original[j][i];
			}
		}
		
		System.out.println("PRINTING THE MATRIX WITHOUT TRANSPOSE");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(original[i][j]+" \t");
				
			}
			System.out.println("");
		}
	System.out.println("PRINTING THE MATRIX WITH TRANSPOSE");
	      for(int i=0;i<3;i++)
	      {
	    	  for(int j=0;j<3;j++)
	    	  {
	    		  System.out.print(transpose[i][j]+"\t");
	    	  }
	          System.out.println("");
	      }
	
	  //    System.out.println("***********END OF THETWO DIMENTIONAL ARRAY SUBTRACTION METHOD***************");
	
	}


		
		
	}
	public static void main(String[] args) {
		twoDimentionalArray();
		twoDimentionalSubtraction();
		twoDimentionaltransposeMatrix();

	}

}

package exceptionhandlingProgram;

public class MultiCatchBlocksDemo {
	
	public  void arrayDemo()
	{
	//int i=0;
		
	int[] arr = new int [5];
		try {
			
			arr[0]=25/5;
			arr[1]=10;
			arr[2]=20;
			arr[3]=30;
			arr[4]=40;
			arr[5]=50;
		} catch (ArithmeticException ae) {
			System.out.println("this is ArthimethicException catch block");
			ae.printStackTrace();
			System.out.println("ArthimeticException message is:"+ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aie) {
		System.out.println("this is ArrayIndexOutOfBoundException");
		aie.printStackTrace();
		System.out.println("ArayIndexOutOfBoundException:"+aie.getMessage());
		}catch(Exception e)
		{
			System.out.println("Root class EXceptioncatch block");
			e.printStackTrace();
			System.out.println(" exception mesage is"+e.getMessage());
		}
		
		System.out.println("Length of the array is:"+arr.length);
		System.out.println("last element of the array is:"+(arr.length-1));
		//for(int a:arr)
		for( int i=0; i<=arr.length-1;i++)
		
			System.out.println(arr[i]);
	
	}

	public static void main(String[] args) {
		
		MultiCatchBlocksDemo  arr=new MultiCatchBlocksDemo ();
		arr.arrayDemo();
		
	}

}

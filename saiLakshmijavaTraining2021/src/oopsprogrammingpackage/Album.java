package oopsprogrammingpackage;

public class Album {
	
	
	public String name;
	public String artiest;
	public double price;
	public int numberofCopies;
	

	public void sellCopies()
	{
		if(numberofCopies>0)
		{
			numberofCopies--;
			System.out.println("ONE ALBUM IS SOLD");
		}
			else
			{
				System.out.println("NO ALBUMS ARE AVAILABLE");
			}
		}
	
	
	public void  orderCopies(int num)
	{
		numberofCopies+=num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

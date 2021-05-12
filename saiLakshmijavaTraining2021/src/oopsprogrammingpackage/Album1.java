package oopsprogrammingpackage;

public class Album1 {

	private String name;
	private String artist;
	private double price;
	private int numberofcopies;
	
	public void sellCopies1()
	{
		if(numberofcopies>0)
		{
			numberofcopies--;
			System.out.println("one albums sold");
		}
		else
		{
			System.out.println("no albums sold");
		}
	}
	
	public void orderCopies1(int n)
	{
		numberofcopies+=n;
	}
	
 //Make the setter and getter methods for every variable
 //Make the setter and getter methods for every variable  
  public String getName()
  {
	  return name;
  }
  public void setName(String name)
  {
  this.name=name;
  //this keyword is a reference variable which refers to current class object(instance variable/method).
  }
 public String getArtist()
 {
   return artist;
  }
   public void setArtist(String artist)
     {
        	 this.artist=artist;
     }
         
         public double getPrice()
         {
        	 return price;
         }
         
         public void setPrice(double price)
         {
        	 if(price>0)
        	 {
        		 this.price=price;
        	 }
        	 else
        	 
        	 {
        		 this.price=0.0;
        	 }
         }
         
         public int getNumberOfCopies1()
         {
        	 return numberofcopies;
         }
         
         public void setNumberOfCopies1(int numberofcopies)
         {
        	 if(numberofcopies>0)
        	 {
        	 this.numberofcopies=numberofcopies;  
         }
        	 else
        	 {
        		 this.numberofcopies=0;
        	 }
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

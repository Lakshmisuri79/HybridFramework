package oopsprogrammingpackage;

public class StockKeeper1 {
	
	private String name;
	StockKeeper1(String name)
	{
		setName(name);
	}

	
	public String  getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
	this.name=name;
	}
	
	public void manageAlbums(Album1 album1,String name,String artist,double price,int numberofcopies )
	{
		
		//we r calling the set methods here. we dont have a permisssion to call the variables directly, because we declared private
		//setter methods set the value. the storekeeper can not give own values that means he suppose to gice negative values its can not accepted or the value turns "0" because we write acode in the methods.
		//The variables we can not write the logic.in the methods we can write a logic .that why we controlling variablevalues how to give for others you can set.
		album1.setName(name);
		album1.setArtist(artist);
		album1.setPrice(price);
		album1.setNumberOfCopies1(numberofcopies);
		
		
		System.out.println("Album1 managed by:"+"lakshmi");
		System.out.println("Album1 details:");
		System.out.println("Album1 name:"+album1.getName());
		System.out.println("Album1 Artists is:"+album1.getArtist());
		System.out.println("Album1 price is"+album1.getPrice());
		System.out.println("Album1 number of copies:"+album1.getNumberOfCopies1());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

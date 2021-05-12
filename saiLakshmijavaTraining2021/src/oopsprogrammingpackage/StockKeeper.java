package oopsprogrammingpackage;

public class StockKeeper {

	public String name;
	
	
	//below one is constructer because classname and method name are same.
	
	public StockKeeper(String name)
	{
		this.name=name;
	}
	
	
	
public void manageAlbums(Album album,String name,String artist,double price,int numberofCopies)
	
	{
		album.name=name;
		album.artiest=artist;
		album.price=price;
		album.numberofCopies=numberofCopies;
		
		
		System.out.println("Album managed by:"+this.name);
		System.out.println(("Album name is:"+album.name));
		System.out.println("Artist name is:"+album.artiest);
		System.out.println("Price of the Album:"+album.price);
		System.out.println("number of copies of album is:"+album.numberofCopies);
		
		
	}
	public static void main(String[] args) {
		{
			
		}
		
	}

}

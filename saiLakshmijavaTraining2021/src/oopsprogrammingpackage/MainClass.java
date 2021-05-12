package oopsprogrammingpackage;

public class MainClass {
	

	public static void main(String[] args) {
		//creating object 
		
		
		StockKeeper spobj=new StockKeeper("lakshmi");
	//if you have a parameterised constructor in the class, 
	//while creating a object for that class you have to pass  the parameter value in the object line
		
		Album alobj=new Album();
		
		spobj.manageAlbums(alobj,"GOLDEN HITS", "balasubramanyam", -10000, -10);
		
	}

}

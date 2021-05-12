package oopsprogrammingpackage;

public class MainClass1 {

	public static void main(String[] args) {
		//creating object
		StockKeeper1 stobj1=new StockKeeper1("Lakshmi");
		
		Album1 alobj1=new Album1();
		stobj1.manageAlbums(alobj1, "TOP 100 SONGS OF CHITRA", "chitra", -90000, -20);
		

	}

}

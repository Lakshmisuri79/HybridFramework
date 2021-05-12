package oopsprogrammingpackage;


public class MobileMainClass {

	public static void main(String[] args) {
		Mobile1 mobj=new Mobile1();
		mobj.setName("APPLE");
		mobj.setPrice(-90000);
		mobj.setOs("MACOS");
		mobj.setVersion("11pro");
		mobj.setGB(128);
		
		System.out.println("ENTER THE MOBILE NAME"+mobj.getName());
		System.out.println("ENTER THE PRICE:"+mobj.getPrice());
		System.out.println("ENTER THE OPERATING SYSTEM" +mobj.getOs());
		System.out.println("ENTER HTE VERSION:" +mobj.getVersion());
		System.out.println("ENTER THE GB:"+mobj.getGB());
		System.out.println();
		
		
		

	}

}

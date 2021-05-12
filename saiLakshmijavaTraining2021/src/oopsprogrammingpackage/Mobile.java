package oopsprogrammingpackage;

public class Mobile {
	
	
	private String name;
	private double price;
	private String os;
	private String version;
	private int GB;
	
	
	private Mobile()
	{
		System.out.println("THIS IS DEFAULT CONSTRUCTOR");
	}

	
	public Mobile(String name,double price)
	{
		
			this.name=name;
			this.price=price;
					
		}
		
	
	protected Mobile(String name,double price,String os,String version)
	{
		this(name,price);
		this.os=os;
		this.version=version;
	}
	
	
	public Mobile(String name,double price,String os,String version,int GB)
	{
		this(name,price,os,version);
		this.GB=GB;
	}
	
	
	
	
	public void mobileProperties()
	{
		System.out.println("MOBILE PROPERTIES ARE");
		System.out.println("MOBILE NAME IS:"+" "+name);
		System.out.println("MOBILE PRICE IS:"+" "+price);
		System.out.println("MOBILE OPERATING SYSTEM IS:"+" "+os);
		System.out.println("MOBILE VERSION IS:"+" "+version);
		System.out.println("HOW MUCH GB IS IN MOBILE IS"+" " +GB);
	}
	public static void main(String[] args) {
		//CREATING AN OBJECT FOR the class syntax:classname objref=new class();
		Mobile m=new Mobile();
		m.mobileProperties();
		System.out.println("***************END OF THE  CONSTRUCTOR***************");
		
		System.out.println("calling two parameterised constructor ");
		//creating a object
		Mobile m1=new Mobile("SAMSUNG",40000);
		m1.mobileProperties();
		
		System.out.println("***************END OF THE TWO PERAMETERISED CONSTRUCTOR***************");
		
		//creatina a object
		Mobile m2=new Mobile("APPLE",80000,"macos","11pro");
				m2.mobileProperties();
		System.out.println("********************END OF FOUR PERAMETERISED CONSTRUCTOR*************************");
		
		Mobile m3=new Mobile("SAMSUNG GALAXY",80000,"ANDROID","S21",128);
		m3.mobileProperties();
		System.out.println("********************END OF FIVE PERAMETERISED CONSTRUCTOR*************************");
		

	}

}

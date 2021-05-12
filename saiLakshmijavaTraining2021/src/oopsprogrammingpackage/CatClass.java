package oopsprogrammingpackage;

public class CatClass {
	//declare instance variable
	int age;
	String name;
	String bread;
	String color;
	//define instance methods
	public void sleep()
	{
		System.out.println("sleeping");
	}
	private void play()
	{
		System.out.println("playing");
	}
	protected void feed()
	{
		System.out.println("eating");
	}
	

	public static void main(String[] args) {
	//represents thor cata objectand crate objet for the cat class
		//classname objref=new classname();
		CatClass thorobj=new CatClass();
		thorobj.age=3;
		thorobj.bread="mainCoon";
		thorobj.name="Thor";
		thorobj.color="brown";
		thorobj.sleep();
		//create object for RamboObject
		CatClass ramboobj=new CatClass();
		ramboobj.age=4;
		ramboobj.bread="Russian blue";
		ramboobj.name="Rambo";
		ramboobj.color="White";
		ramboobj.play();
		
		
	}
}
		



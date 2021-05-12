package oopsprogrammingpackage;

public class Dog extends Animal
{
	//ovearridding meathod
    public void eat()
    {
    	 System.out.println("started executing Dog class eat()");
    	 System.out.println("Dog will eat pidigaree");
    }
    protected void playying()
    {
    	System.out.println("started executing Dog class playying()");
    	System.out.println("dofg is playying");
    }
    void tailing()
    {
    	System.out.println("started executing Dog class tailing()");
    	System.out.println("dog is taillingwith friendly nature");
    }   
    void barking()
    {
    	System.out.println("started executing Dog class barking()");
    }
    public void makeSound()
    {
    	System.out.println("started executing Dog class makeSound()");
    	System.out.println("dog is barking");
    }
	public static void main(String[] args) {
	//runtime polymorphysm
		//syntax: parent class refvar=new childclass();
		Animal aniref=new Dog();
		aniref.eat();
		aniref.makeSound();
		//create an object for child class
		//class name refver=new class();
		Dog dobj=new Dog();
		dobj.eat();
		dobj.tailing();
		dobj.playying();
		dobj.makeSound();
		dobj.barking();

	}

}

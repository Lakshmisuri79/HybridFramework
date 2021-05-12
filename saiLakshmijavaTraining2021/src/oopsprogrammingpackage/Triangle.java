package oopsprogrammingpackage;

public class Triangle extends Shapes {

	public Triangle(int sides, int angles, String shape1) {
		super(sides, angles, shape1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void peremeter() 
	{
		int a=3;
		int b=7;
		int c=10;
		System.out.println("I am executing  abstract (Shapes) class peremeter abstract method:");
		System.out.println("Traingle perermeter formula is  (a+b+c)");
		float per=a+b+c;
		System.out.println("Triangle perermeter value is  :"+" "  +" "+a+", "+b+" ,"+c+" " +" ="+per);
		
	}

	@Override
	protected void area(int a, float b)
	{
		System.out.println("I am executing  abstract (Shapes) class  area abstract method:");
		System.out.println("Triangle area formula is: area=1/2bh");
		float area=(float)1/2*(a*b);
		System.out.println("Triangle area value is1/2bh:"+" "+ "1/2"+" "+" *"+a+"* "+b+" ="+area);
		//System.out.println(area);
	}

	@Override
	public float volume(int b, int h, int l)
	{
		System.out.println("I am executing  abstract (Shapes class) class  volume abstract method:");
		System.out.println("Triangle prism volume formula is: area=1/2bhl");
		float volume=(float)1/2*(b*h*l);
		return volume;
		
		
	}
	
	public void pythogoreanTheorem(int a, int b)
	{
		System.out.println("I am executing child class (Triangle class) pythogoreanTheorem ()");
		System.out.println(" pythogoreanTheorem formula is:a2+b2=c2");
    	int c=((a*a)+(b*b));
    	System.out.println("Value of pythogoreanTheorem is:" +" "+a+" *"+a+" "+b+"*"+b+" "+"="+c);
	
	}
	
	public static void main(String[] args) 
	{
	//create an object for child class syntax:child class refobj=new  child class();///or we can create object for overridden method syntax: parent class refvar=new child class()'
		Triangle trobj=new Triangle(3,3,"TriangularPrism");
		trobj.peremeter();
		System.out.println("VOlume of the triangle is:" +trobj.volume(5, 8, 9) );
		trobj.area(20,15);
		trobj.shapePrinciples();
		//trobj.setShape1("Triangle");
		//trobj.setAngles(3);
		//trobj.setSides(3);
		//create an object for child class syntax:child class refobj=new  child class();
		
		System.out.println("Shape is :"+trobj.getShape1());
		System.out.println("In a triangles sides are:" +trobj.getSides());
		System.out.println("In Traingle angles are:" +trobj.getAngles());
		trobj.pythogoreanTheorem(10, 20);
			
		
		
		
		
		
		
		
		
		
	

	
	}


	
	

}

	
package oopsprogrammingpackage;

public class Rectangular1 extends Shapes
{
	

public Rectangular1(int sides, int angles, String shapes) {
		super(sides, angles, shapes);
		
	}

@Override
public void peremeter()
{
	int a=10;
	int b=30;
	System.out.println("I am executing  abstract (Shapes) class peremeter abstract method:");
	System.out.println("Rectangular  perermeter formula is  2(a+b)");
	 int p=2*(a+b);
	 System.out.println("Rectangular peremeter value is 2*(a+b):"+" "+"2"+" "+" *"+" "+a+" "+" *"+b+" "+" ="+p);
	
}

@Override
protected void area(int a, float b) {
	
	System.out.println("I am executing  abstract (Shapes) class peremeter abstract method:");
	System.out.println("Rectangular  area formula is  l*W");
	
     int area=(int)(a*b);
     System.out.println("Recangular area value is area=l*W:" +" "+a+" "+" *"+ b+" "+" ="+area);

}

@Override
public float volume(int a, int b, int h) {
	System.out.println("I am executing  abstract (Shapes) class peremeter abstract method:");
	System.out.println("Rectangular  prisim volume formula is  l*W*h");
	int volume=a*b*h;
	return volume;
//	System.out.println("Rectangular prism volume is l*w*h:" +" "+a+" "+" *"+b+" "+"*"+h+" "+"="+volume);
}



public static void main(String[] args)
{

	//create an object for child class syntax:child class refobj=new  child class();
	///or we can create object for overridden method syntax: parent class refvar=new child class();
	Shapes shobj=new Rectangular1(4,4,"Rectangular Prism");
	shobj.peremeter();
	shobj.area(10, 5.5f);
	System.out.println("Volume of rectangular isl*w*h:"+shobj.volume(8, 5, 6));
	//shobj.setAngles(4);
	//shobj.setShape1("Rectangular Prism");
	//shobj.setSides(4);
	System.out.println("shape is:"+shobj.getShape1());
	System.out.println("Rectangualr angle are:"+shobj.getAngles());
	System.out.println("Rectangular sides are:"+shobj.getSides());
	shobj.shapePrinciples();
}
}

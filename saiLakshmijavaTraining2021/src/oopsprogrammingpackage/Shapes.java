package oopsprogrammingpackage;

public abstract class Shapes 
{
	private int sides;
	private int angles;
	private String shape1;
	
	public Shapes(int sides,int angles,String shape1) {
	this.angles=angles;
	this.sides=sides;
	this.shape1=shape1;
	}
	
	
	public String getShape1() {
		return shape1;
	}
	public void setShape1(String shape1) {
		this.shape1 = shape1;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getAngles() {
		return angles;
	}
	public void setAngles(int angles) {
		this.angles = angles;
	}

	
	public abstract void  peremeter();
	protected abstract void area(int a,float b);
	public abstract float volume(int a, int b, int h);
	
	public void shapePrinciples()
	{
		System.out.println("ALL FOUR SIDEED SHAPES EQULAS TO 360 DEGREES");
		System.out.println("ALL TYPES OF TRIANGLES EQULAS 180 DEGRESS");
		System.out.println("ALL QUARDALATRIRALS SIDE ARE COPLANAR");
		System.out.println("All QUARDARATRALS HAS SAME FORMULA IN TERMS OF VOLUME");
	}
}
	

	

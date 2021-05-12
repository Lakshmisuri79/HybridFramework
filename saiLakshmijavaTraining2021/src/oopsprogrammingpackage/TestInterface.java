package oopsprogrammingpackage;

public class TestInterface {

	public static void main(String[] args) {
		//create a object for which class do you  want to call
		//interface refvar=new implemented class
		//ITelephone itobj=new MobilePhone(95067393748L);
		ITelephone itobj=new DeskPhone(1234499974);
		itobj.powerOn();
		itobj.dail(itobj.getPhoneNumber());
		itobj.answer();
		boolean bn= itobj.callPhone(itobj.getPhoneNumber());
		System.out.println("bn value:"+bn);
		System.out.println("is ringing"+itobj.isRinging());
		
		//calling default methods
		itobj.sendMEssage();
		//static methods interfacename.static method
		long c=ITelephone.cube(10);
		System.out.println("cube value is"+c);
		//how to call constant interface.constant
		System.out.println("constant MIN_VALUE IS "+ITelephone.MIN_WORDS);
		
		
		
	}

}

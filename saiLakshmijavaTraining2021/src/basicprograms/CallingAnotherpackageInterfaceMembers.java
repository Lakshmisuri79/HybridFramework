package basicprograms;

import oopsprogrammingpackage.DeskPhone;
import oopsprogrammingpackage.ITelephone;
import oopsprogrammingpackage.MobilePhone;

public class CallingAnotherpackageInterfaceMembers {

	public static void main(String[] args) 
	
	{
		//create a object for which class do you  want to call
		//interface refvar=new implemented class
	   ITelephone itobj=new MobilePhone(987652345L);
		//ITelephone itobj=new DeskPhone(0861230987);
		itobj.powerOn();
		itobj.answer();
		itobj.dail(itobj.getPhoneNumber());
		System.out.println( "we are calling" +itobj.callPhone(itobj.getPhoneNumber()));
		System.out.println("is rining:"+itobj.isRinging());
		
       
	//calling default methods
		
		itobj.sendMEssage();
		//calling static methods
	System.out.println("cube value is:" +ITelephone.cube(6));
	//calling constants
	System.out.println("Calling constants"+ITelephone.MIN_WORDS);
		
	}
}

package oopsprogrammingpackage;

public class MobilePhone implements ITelephone{
	private long myNumber;
	private boolean isRinging;
	private boolean isOn=false;
	
	
	public MobilePhone(long myNumber)
	{
	this.myNumber=myNumber;
	}

	@Override
	public void powerOn() 
	      {
		System.out.println("started executing the mobile class-powerOn()");
		isOn=true;
		System.out.println("Mobile Phone is powered up");
			}
	
	@Override
	public void dail(long phoneNumber) 
	{
		System.out.println("started executing the mobile class-dail()");
		if(isOn)
		{
			System.out.println("now ringing "+phoneNumber+"n Mobile phone");
		}
			else
			{
				System.out.println("phone is switched off");
			}
		
	}

	@Override
	public void answer() 
	{
		System.out.println("started executing the mobile class-answer()");
		if(isRinging)
		{
			System.out.println("Answering the mobile phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(long phoneNumber) 
	{
		System.out.println("started executing the mobile class-callPhone()");
		if(phoneNumber==myNumber && isOn)
		{
			isRinging=true;
			System.out.println("jingle bell");
		}
		else
		{
			isRinging=false;
			System.out.println("Mobile phone is not answering or number is different");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
 
	@Override
	public long getPhoneNumber() {
		// TODO Auto-generated method stub
		return myNumber;
	}
	

}

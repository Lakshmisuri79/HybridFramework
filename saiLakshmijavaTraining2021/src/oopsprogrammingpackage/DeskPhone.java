package oopsprogrammingpackage;

public class DeskPhone implements ITelephone
{
	private long myNumber;
	private boolean isRinging;

	public DeskPhone(long myNumber)
	{
	this.myNumber=myNumber;
	}
		@Override
	public void powerOn()
		{
		System.out.println("Started executing DeskPhone Class-powerON()");
		System.out.println("No action taken,deskphoen doesnot have power button");
		
	    }
		
	@Override
	public void dail(long phoneNumber)
	{
		System.out.println("Started executing DeskPhone Class-dail()");
		System.out.println("now ringing"+phoneNumber+"On DeskPhone()");
				isRinging=false;
	}

	@Override
	public void answer()
	 {
		System.out.println("Started executing DeskPhone Class-answer()");
		if(isRinging)
		{
			System.out.println("answer the deskphone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(long phoneNumber) 
	{
		System.out.println("Started executing DeskPhone Class-callPhone()");
		if(phoneNumber== myNumber)
		{
		isRinging=true;
			System.out.println();
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	@Override
	public long getPhoneNumber() {
		
		return myNumber;
	}

}

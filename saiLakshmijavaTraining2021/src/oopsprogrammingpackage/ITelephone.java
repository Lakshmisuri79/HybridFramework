package oopsprogrammingpackage;

public interface ITelephone {
	//constant 
	int MIN_WORDS=300;// by default java compiler will add public static final int  MIN_words=300;
	//abstract methods also we don't need to set that abstract keyword,by default compiler will add.
	void powerOn();
	void dail(long phoneNumber);
	void answer();
	boolean callPhone(long phoneNumber);
	boolean isRinging();
	long getPhoneNumber();
	
	default void sendMEssage()
	{
		System.out.println("Send the message through different ways");
	}
	//static methods have static keyword
	static int cube(int x)
	{
		return x*x*x;
	}

}

package basicprograms;

class DefaultAccessModifier1 {
	//declaring static and non-static variables in default access modifier
	static String a="LAKSHMI";
	static int b=20;
	int c=80;
	DefaultAccessModifier1(){
		
	}
	static void defaultModifier() {
		System.out.println("This is the default access modifier using static");		
		System.out.println(a);
		
	
	}
	void defautMethod() {
		System.out.println("This is default method using non static");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defaultModifier();
		//System.out.println(b);
		int charcount;
		charcount = a.length();
	//	System.out.println (charcount); //This will print 7
		
		a="   Lakshmi     ";
		int x1;
		x1=a.length();
		String s4 = a.toUpperCase();
		System.out.println (s4);
		System.out.println (x1);
		
		String str2;
		//str2=a.trim();
		str2=a.concat("sai");
		
		String str3 =a.toLowerCase();
		
		System.out.println (str3);
				System.out.println (str2);
		int y1;
		y1=str2.length();
		System.out.println (y1);
		
		int z=charcount+x1+y1;
		
		System.out.println (z);
		
	}

}




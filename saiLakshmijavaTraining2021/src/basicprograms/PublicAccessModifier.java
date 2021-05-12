package basicprograms;

public class PublicAccessModifier {
	//static and non static variable declaration assigning for public access modifier
	public static String a="Madhav Suri";
	public static String b="age is";
	public static int x=15;
	private static String getdir;
	public long y=1500L;
	//constructor public access modifier
	public PublicAccessModifier(){
		System.out.println("This is my first pubic accessmodifier for constructor	");
	}
	//static non static method public access modifier
	public static void java() {
		System.out.println("This is my first public accessmodifier program java");
	}
	public static void java1() {
		System.out.println("This is my second public accessmodifier program java1");
	}
	
	
	public void myJava() {
		System.out.println("This is my first non static public accessmodifier in non static method constructors myJava()");
			}
	

	public static void main(String[] args) {
		//call static method under the main method using the methodname staticmethodname();
		// TODO Auto-generated method stub
		java();
		java1();
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	String str=System.getenv("JAVA_HOME");
	System.out.println("str value is:"+str);
	String str1=System.getProperty( "user.dir");
String str2 =System.lineSeparator();
  	System.out.println("Line separator  is:"+str2);
	
	System.out.println("Hello");
  
     System.out.print("hai");
     System.out.print("goodmorning");
	}

	}

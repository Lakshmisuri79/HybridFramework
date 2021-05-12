package stringhandling;

public class StringMethod {
	static String s = "java";

	public static void main(String[] args) {
		// 1. length() find the number of charecter in given string
		// return type is integer
		// datatype variablename=refobj.returntypemethod();
		int cnt = s.length();
		System.out.println("length of the" + " " + s + " " + "is" + " " + cnt);
		// 2. charAT(int index)--fetches the charecter at given index.return type is
		// charecter
		char c = s.charAt(2);
		System.out.println("2 nd index char in" + " " + s + " " + "variable is:" + c);
		// 3.toCharArray()--converts the string into cahrecter array.return type of the
		// method is charArray
		char[] ch = s.toCharArray();
		// char[]={'j','a','v','a'}
		for (char c1 : ch) {
			System.out.print(c1 + "\t");

		}
		System.out.println(" ");

		// 4.concat() join the two strings.retuens the string object
		String s1 = s.concat("Selenium");
		System.out.println(s1);
		// 5.toUppercase()--given string converts into Uppercase.Retuens string object
		String s2 = s1.toUpperCase();
		System.out.println("Upper case of teh string " + s1 + " " + "is:" + " " + s2);
		// 6.toLowerCase()--converts the given string in to lower case.REturn type is
		// string object
		String s3 = s2.toLowerCase();
		System.out.println("Lower case of the string  JAVASELENIUM " + s3);
		// 7.isEmpty() checks the givenstring is empty or not.returns the boolean value
		boolean b = s2.isEmpty();
		System.out.println(b);
		// 8. contains()checks the given sub string is present in teh main
		// string..returns the boolean value
		boolean b1 = s3.contains(s);
		// 9.equals() compare to strings.If it is same returns true
		boolean b2 = s3.equals(s2);
		System.out.println(b2);
		// 10.equalsIgnoreCase() ingnores the cases(upper case or lower case) and
		// compares equals or not.returns boolean value
		boolean b3 = s1.equalsIgnoreCase(s2);
		System.out.println(b3);
		// 11.startsWith() checks with given substring is having in main string or
		// not.returns boolean value
		boolean b4 = s3.startsWith(s);
		System.out.println(b4);
		// endsWith() chaecks given sub string is having in amin string or not
		boolean b5 = s3.endsWith("selenium");
		System.out.println(b5);
		// 12.spilt() split the given delemeter string and place in teh string[] retuns
		// string value
		// delemeters: spaces,;?'',"",-_
		String s4 = ("About 856,000,000 results (0.98 seconds)");
		String[] str = s4.split(" ");
		// str[]=["About","856,000,000","results","(0.98","seconds)"]
		// access arry aelements array name[index]
		String s5 = str[2];
		System.out.println(s5);

		int var1 = s.compareTo("s2");
		System.out.println(var1);
		//13.replace()--replaces the old charecter/sring into new charecter/string
		String s6=s.replace('j', '@');
		System.out.println("in " +s+" string replaving the chareter j with @: "+s6);
		String s7=s2.replaceFirst("JAVA", "PHYTHON");
		System.out.println(s7);
		//14.subString(int beginindex)--fetches the sub string from the begin index to till end index
		//subString(int startindex,int endindex)
		//s1="javaselenium"
		//    01234567891011 
		String s9=s1.substring(4);
		System.out.println(s9);
		//subString(int startindex,int endindex)
		String s10=s1.substring(0,4);
		System.out.println("sub string"+" "+s10);
		//15.index() fetches the given charecter/string index. returns integer
		int indx=s1.indexOf('l');
		System.out.println(indx);
		int indx1=s1.indexOf("selenium");
		System.out.println(indx1);
		//16.lastIndex()fetches the index number for last char/string 
		//returns the int
		int lastindx=s1.lastIndexOf('e');
		System.out.println("last index"+lastindx);
		//17.join() --joins the multiple strings given delimeter.returns new string
		//this is static method
		String s11=String.join("-","selenium","is","functional","test","tool");
		System.out.println(s11);
		//18.comparTo() compares lexicographically(means based on the asci charecter) if 
		//string1< string2 returns -value
		//string1>strings reurns +value;
		//string 1=string 2 returns 0;
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		System.out.println("lengh of"+ s +"value" +"using compareTo():"+(s.compareTo(" ")));
		//19.trim() removes the head and tails posion white spaces
		String s12="  phython seleneum  "  ;
		System.out.println("length is"+s12.compareTo(""));
		String s13=s12.trim();
		System.out.println("After trimming the length ofthe string is:"+s13.length());
		//20 getByte()--returns the bytes[] fetches the ascii code of the each charecter of the string
		byte[] bt=s.getBytes();
		for(byte t:bt)
		{
			System.out.print(t+"\t");
		//21.valueOf() converts the given object into string format. returns string.static method
			String s14=String.valueOf(25);
			System.out.println(s14 );
			String s15=s14+29;
			System.out.println(s15);
			
			
			
		}
		

	}

}

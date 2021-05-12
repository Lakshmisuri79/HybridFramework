package stringhandling;

public class StringBufferDemo {
//lakshmi
	public static void main(String[] args) {
		// create a object for stringBuffer clsss
		StringBuffer sb = new StringBuffer("lakshmi");
		int capacity=sb.capacity();
		System.out.println("capacity is"+capacity);
		// append() it append the given string
		sb.append("suri");
		System.out.println("sb value after append" + sb);
		// sb.append('s');
		System.out.println("sb value after append is" + sb);
		// insert insert the specified string in the given index
		sb.insert(7, " ");
		System.out.println("sb value after using insrt()" + sb);
		// replace()replaces the given string with new one
		// lakshmi suri
		sb.replace(8, 12, "Muppirala");
		System.out.println("sb value after using is" + sb);
		// delete() delete the string in given range
		// sb=lakshmi muppirala
		// sb.delete(7, 17);
		// System.out.println("sb value after using delete()"+sb);
		sb.reverse();
		System.out.println("after reverse the string is" + sb);
		sb.reverse();
		System.out.println("after reversing the string is" + sb);
		sb.toString();
	
		System.out.println(sb);

		System.out.println(sb.substring(2));

		System.out.println((sb.charAt(2)));
		System.out.println("sub sequence of the string is" + sb.subSequence(8, 17));
	}

}

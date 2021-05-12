package collections;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		String arr[]= {"dog","cat","monkey","tiger"};
		for(String val:arr)
		{
			System.out.println(val);
		}
		
		
		//convert arry in to Arraylist
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}

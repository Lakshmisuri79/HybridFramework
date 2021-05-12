package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//declare the ArrayList class store hetrogenious data that means differnt data type elements
		ArrayList al=new ArrayList();
		//homogenious data we can store  perticular kind of data 
	//	ArrayList<Integer> al=new ArrayList<Integer>();-----------------2
		//ArrayList<String> al=new ArrayList<String>();-----------------2
		//we can create obj for interface
		//interace refobj=new implementation class();
	//	List al=new ArrayList ();----------------------------------------3
				
//add new elements in the ArrayLsit()
		
		al.add(100);
		al.add("Lakshmi");
		al.add(15.5);
		al.add('m');
		al.add(true);
		System.out.println(al);
		//size()  telss how many objects/elements in the arraylist
		
		al.size();
		System.out.println("number of elements in arry list"+al.size());
		//remove(); removes the peticular elements/object from the given array lsit
		al.remove(2);
		System.out.println("After removing the element from the array list"+al);
		//insert a new element
		//add(index,object)
		al.add(2, "suri");
		System.out.println(" afterinsertion "+al);
		//get(index)retrive the specific object from the array list
		al.get(2);
		System.out.println("retriving spectic object from the"+al+"is"+" "+al.get(2));
		//set(index,object(new element) modify and add new element in the array list
		al.set(1, "sai srinivas");
		System.out.println("modifying the old elemet to new element"+al);
		//contains(object): checks the perticular object is in the array list
		al.contains("lakahmi");
		System.out.println("object is available in the arraylist is"+al.contains("lakshmi"));
		//isempty()----returns boolean value it willcheck the arrya list is having elemetns or not
		System.out.println("array lest is having no  elements "+al.isEmpty());// [100, sai srinivas, suri, m, true]
	//	read the data using
		
		//for loop
		System.out.println("reading the elements using for loop");
		for(int i=0;i< al.size();i++)
		{			

			System.out.print(al.get(i)+"\t");
			
		}
		System.out.println(" ");
		
		//for each loop
		System.out.println("reading the elements using for each loop");
		for(Object a:al)
		{
				System.out.print((a)+"\t");
		}
		
		System.out.println(" ");
		//iterrator
		//by using iterator method also we can read the data
			System.out.println("reading the elements using iterator method");
		//	Iterator is  aprent interface for collecton interface
			//ArraList class method is called iterator() this method automatically read each and every element in the array list
			//store in teh variable.this method available in java.util package
					Iterator it= al.iterator();
					while(it.hasNext())
					{
						System.out.print(it.next()+" \t");
					}
					
		//now my ArrayList is [100, Lakshmi, 15.5, m, true] 
		
		
 
		
		
	}

}

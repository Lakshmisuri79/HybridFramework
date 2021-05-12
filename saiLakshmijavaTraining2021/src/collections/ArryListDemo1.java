package collections;

import java.util.*;;

public class ArryListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al1 =new ArrayList();
		al1.add("A");
		al1.add("C");
		al1.add("Z");
		al1.add("X");
		al1.add("H");
		
		//creating another array list
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al1);
		System.out.println(al_dup);//A, C, Z, X, H
		al_dup.removeAll(al1);
		System.out.println("after removing from the al_dup array lsit is"+al_dup);
		
		//sort an arrya list we have method called sort() method in Collections class
		System.out.println("elements in the arrya list"+al1);//A, C, Z, X, H
		Collections.sort(al1);
		System.out.println("after sorting the elements in the arry list"+al1);
		//sort the array in decending order/reverse order
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in teh reverse order"+al1 );
		
		//shuffling Collections.shuffle();
		Collections.shuffle(al1);
		System.out.println("Elements in teh array list after shuffling is"+al1);
		
		
		
		
	}

}

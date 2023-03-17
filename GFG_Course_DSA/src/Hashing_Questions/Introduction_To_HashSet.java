package Hashing_Questions;

import java.util.HashSet;
import java.util.Iterator;

public class Introduction_To_HashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();  //initially we can define the size of the set..by default it's size is 10

		set.add("ujjwal");
		set.add("kumar");
		set.add("Singh");
		set.add("Singh");

		System.out.println(set);

		System.out.println(set.contains("Singh"));
         //iterator() works with all the collection frameworks 
		// basically it is used to traverse the element in the forward/backward direction...
		Iterator<String> i = set.iterator();

		while (i.hasNext()) { // hasNext() checks whether the element is present in the next or not and
								// returns the boolean value
			System.out.print(i.next() + " ");
		}
		
		System.out.println(set.size());
		
		set.remove("kumar"); // this method remove the element from the set
		
		System.out.println(set);
		
		System.out.println(set.size()); //this method print the size of the set
		
		for(String str: set) {
			System.out.print(str+" ");
		}
		
		System.out.println(set.isEmpty()); //this method checks whether the set is empty or not 
		
		set.clear(); //this method clears the set..
		
		System.out.println(set);
		System.out.println(set.isEmpty());

	}

}

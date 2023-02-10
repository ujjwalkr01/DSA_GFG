package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(10);
// this method sort the list in ascending order
		Collections.sort(list);
		System.out.println(list);
// this method sort the list in descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}

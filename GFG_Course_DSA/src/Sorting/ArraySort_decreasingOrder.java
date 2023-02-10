package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort_decreasingOrder {

	public static void main(String[] args) {

		Integer arr[] = { 5, 30, 20, 10, 8 };
		Arrays.sort(arr, Collections.reverseOrder());
//we can print the array in descending order by creating the array of wrapper class data type 
		// and will use collections.reverseOrder()
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

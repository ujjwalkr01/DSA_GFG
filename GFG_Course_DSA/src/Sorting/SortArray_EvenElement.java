package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Mycmp implements Comparator<Integer> {

	//sorting the integer on the basis of the even elements
	@Override
	public int compare(Integer a, Integer b) {

		return a % 2 - b % 2;
	}

}

public class SortArray_EvenElement {

	public static void main(String[] args) {

		Integer arr[] = { 5, 20, 10, 3, 12 };
		//sorting the array by passing the array and the objects
		Arrays.sort(arr, new Mycmp());

		System.out.println(Arrays.toString(arr));

	}

}

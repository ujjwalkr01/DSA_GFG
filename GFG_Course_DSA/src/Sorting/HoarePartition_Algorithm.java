package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class HoarePartition_Algorithm {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(1);
		list.add(10);

		int low = 0, high = list.size() - 1;
		int value = hoarePartAlgo(list, low, high);
		System.out.println(value);
		System.out.println(list);

	}

	private static int hoarePartAlgo(ArrayList<Integer> list, int low, int high) {

		int pivot = list.get(0); // always be the first element
		int i = low - 1, j = high + 1;

		while (true) {
			do {
				i++;
			} while (list.get(i) < pivot);

			do {
				j--;
			} while (list.get(j) > pivot);

			if (i >= j) {
				return j;
			}
			Collections.swap(list, i, j);
		}
	}

}

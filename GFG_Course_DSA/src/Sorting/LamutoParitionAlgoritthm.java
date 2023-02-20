package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class LamutoParitionAlgoritthm {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(30);
		list.add(90);
		list.add(40);
		list.add(50);
		list.add(70);

		int n = list.size();

		paritionAlgo(list, 0, n - 1);
		System.out.println(list);
	}

	private static int paritionAlgo(ArrayList<Integer> list, int low, int high) {

		int pivot = list.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (list.get(j) <= pivot) {
				i++;
				Collections.swap(list, i, j);
			}
		}
		Collections.swap(list, i + 1, high);
		return i + 1;
	}

}

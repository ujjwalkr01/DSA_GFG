package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuickSort_HoaresPartition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int low = 0, high = n - 1;
		quickSortAlgo(list, low, high);

		System.out.println(list);
	}

	private static void quickSortAlgo(ArrayList<Integer> list, int low, int high) {

		if (low < high) {
			int p = hoarePart(list, low, high);
			quickSortAlgo(list, low, p);
			quickSortAlgo(list, p + 1, high);
		}
	}

	private static int hoarePart(ArrayList<Integer> list, int low, int high) {

		int pivot = list.get(low);
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

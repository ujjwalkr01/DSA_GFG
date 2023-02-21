package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuickSort_LamutoParti {

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
			int p = lamutoPart(list, low, high);
			quickSortAlgo(list, low, p - 1);
			quickSortAlgo(list, p + 1, high);
		}
	}

	private static int lamutoPart(ArrayList<Integer> list, int low, int high) {
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

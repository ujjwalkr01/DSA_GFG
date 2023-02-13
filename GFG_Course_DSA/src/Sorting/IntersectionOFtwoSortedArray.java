package Sorting;

import java.util.Scanner;

import Searching.BinarySearch;

public class IntersectionOFtwoSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[] { 3, 5, 10, 10, 10, 15, 20 };
		int b[] = new int[] { 5, 10, 10, 15, 20 };

		intersectionOfArray(a, b);
		System.out.println("-----------------------------------");
		efficientSolution(a, b);
	}

	private static void intersectionOfArray(int[] a, int[] b) {

		int n = a.length, m = b.length;
		boolean isPresent = false;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				if (binarySearch(a[i], b)) {
					isPresent = true;
					System.out.print(a[i] + " ");
				}
			}
		}
		if (a[n - 1] != a[n - 2]) {
			if (binarySearch(a[n - 1], b)) {
				isPresent = true;
				System.out.print(a[n - 1] + " ");
			}
		}

		if (isPresent == false) {
			System.out.println(" ");
		}
	}

	private static boolean binarySearch(int val, int[] b) {

		int low = 0, high = b.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (b[mid] == val) {
				return true;
			} else if (b[mid] < val) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}

	private static void efficientSolution(int[] a, int[] b) {

		int i = 0, j = 0;

		while (i < a.length && j < b.length) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

}

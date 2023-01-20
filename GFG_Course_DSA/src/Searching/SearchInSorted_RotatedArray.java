package Searching;

import java.util.Scanner;

public class SearchInSorted_RotatedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int x = sc.nextInt();
		int res = searchElement(arr, n, x);
		if (res != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static int searchElement(int[] arr, int n, int x) {

		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				return mid;
			} // left part sorted
			else if (arr[low] < arr[mid]) {
				if (x >= arr[low] && x < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} // right part soted
			else {
				if (x > arr[mid] && x < arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;
	}

}

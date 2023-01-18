package Searching;

import java.util.Scanner;

public class CountOf1_inSortedArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		// Array is sorted in descending order
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = findtheCountofOne(arr, n);
		System.out.println(count);
	}

	private static int findtheCountofOne(int[] arr, int n) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == 0) {
				high = mid - 1;
			} else {
				if ( mid == n - 1 || arr[mid + 1] == 0) {
					return mid + 1;
				} else {
					low = mid + 1;
				}
			}
		}
         return 0;
	}

}

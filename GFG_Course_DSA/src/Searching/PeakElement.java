package Searching;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = peakElement(arr, n); // naive approach
		System.out.println(res);

		int res1 = peakElementUsingbinary(arr, n);// binary search
		System.out.println(res);
	}

	private static int peakElement(int[] arr, int n) {

		if (n == 1) {
			return arr[0];
		}
		if (arr[0] >= arr[1]) {
			return arr[0];
		}
		if (arr[n - 1] >= arr[n - 2]) {
			return arr[n - 1];
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return arr[i];
			}
		}
		return -1;

	}

	private static int peakElementUsingbinary(int[] arr, int n) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
				return arr[mid];
			}
			if (mid > 0 && arr[mid - 1] >= arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return 0;
	}
}

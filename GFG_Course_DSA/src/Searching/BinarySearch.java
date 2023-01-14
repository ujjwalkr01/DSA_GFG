package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int element = sc.nextInt();
		int res = binarysearch(arr, n, element);
		System.out.println(res);
	}

	private static int binarysearch(int[] arr, int n, int element) {

		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] < element) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}

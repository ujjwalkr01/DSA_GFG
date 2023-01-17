package Searching;

import java.util.Scanner;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int element = sc.nextInt();
		int res = searchIndex(arr, n, element);
		System.out.println(res);
	}

	private static int searchIndex(int[] arr, int n, int element) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] < element) {
				low = mid + 1;
			} else if (arr[mid] > element) {
				high = mid - 1;
			} else if (mid == 0 || arr[mid - 1] != arr[mid]) { //to check the first occurrence and if the element is present on the first index
				return mid;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}

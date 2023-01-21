package Searching;

import java.util.Scanner;

public class LeftIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int res = findfirstOccurrence(arr, n, x);
		System.out.println(res);
	}

	private static int findfirstOccurrence(int[] arr, int n, int x) {

		if (arr[0] == x) {
			return 0;
		}
		int low = 1, high = n-1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x && arr[mid - 1] != x) {
				return mid;
			} else if (x >= arr[low] && x <= arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

}

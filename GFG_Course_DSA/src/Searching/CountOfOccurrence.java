package Searching;

import java.util.Scanner;

public class CountOfOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int element = sc.nextInt();
		System.out.println(countofOccurence(arr, n, element));
	}

//function for counting the no of occurrence
	private static int countofOccurence(int[] arr, int n, int element) {

		int firstCount = indexOfFirstOccurenece(arr, n, element);

		if (firstCount == -1) {
			return 0;
		} else {
			return indexOfLastOccurence(arr, n, element) - firstCount + 1;
		}
	}

//function for finding the first occurrence index in the array
	private static int indexOfFirstOccurenece(int[] arr, int n, int element) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] < element) {
				low = mid + 1;
			} else if (arr[mid] > element) {
				high = mid - 1;
			} else {
				if (mid == 0 || arr[mid-1] != arr[mid]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;
	}

//function for finding the last index of the occurrence in the array
	private static int indexOfLastOccurence(int[] arr, int n, int element) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > element) {
				high = mid - 1;
			} else if (arr[mid] < element) {
				low = mid + 1;
			} else {
				if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			}

		}
		return -1;
	}

}

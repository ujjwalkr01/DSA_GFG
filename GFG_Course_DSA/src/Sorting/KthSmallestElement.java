package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(findKsmallest(arr, n, k));
		System.out.println("-----------------------------------");

		int index = quickSelectAlgo(arr, n, k);
		System.out.println(arr[index]);
	}
	private static int findKsmallest(int[] arr, int n, int k) {

		Arrays.sort(arr);

		return arr[k - 1];
	}

	private static int quickSelectAlgo(int[] arr, int n, int k) {

		int low = 0, high = n - 1;
		while (low <= high) {
			int index = lamuto(arr, low, high);

			if (index == k - 1) {
				return index;
			} else if (index > k - 1) {
				high = index - 1;
			} else {
				low = index + 1;
			}
		}
		return -1;
	}

	private static int lamuto(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

package Sorting;

import java.util.Scanner;

public class CountInversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		countThepair(arr, n);
		System.out.println("-----------------------------------------");

		int low = 0, high = n - 1;
		System.out.println(countInver(arr, low, high));

	}

	private static long countInver(int[] arr, int low, int high) {
		long res = 0;
		if (high > low) {
			int mid = (low + high) / 2;
			res += countInver(arr, low, mid);
			res += countInver(arr, mid + 1, high);
			res += countandMerge(arr, low, mid, high);
		}
		return res;
	}

	private static long countandMerge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low + 1, n2 = high - mid;

		int left[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[i + low];
		}
		int right[] = new int[n2];
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0, k = low, res = 0;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
				
			} else {
				arr[k++] = right[j++];
				res = res + (n1 - i);
			}
		}
		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}

		return res;
	}

	private static void countThepair(int[] arr, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (i < j && arr[i] > arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

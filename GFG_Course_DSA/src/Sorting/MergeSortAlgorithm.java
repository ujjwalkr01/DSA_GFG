package Sorting;

import java.util.Scanner;

public class MergeSortAlgorithm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int left = 0, right = n - 1;
		mergeSort(arr, left, right);
		printArray(arr);
	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (right > left) {

			int mid = left + (right - left) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int l[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			l[i] = arr[i + left];
		}

		int r[] = new int[n2];
		for (int j = 0; j < n2; j++) {
			r[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (l[i] <= r[j]) {
				arr[k++] = l[i];
				i++;
			} else {
				arr[k++] = r[j];
				j++;
			}
		}

		while (i < n1) {
			arr[k++] = l[i];
			i++;
		}
		while (j < n2) {
			arr[k++] = r[j++];
			j++;
		}

	}

}

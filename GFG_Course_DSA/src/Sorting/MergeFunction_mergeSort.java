package Sorting;

import java.util.Scanner;

public class MergeFunction_mergeSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[] { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
		int low = 0, high = 8, mid = 3;
		int n = arr.length;

		breakTwoarray(arr, n, low, mid, high);
	}

	private static void breakTwoarray(int[] arr, int n, int low, int mid, int high) {

		int left[] = new int[mid - low + 1];
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		int right[] = new int[high - mid];
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[++mid];
		}

		mergeArraysInSorted(left, right);
	}

	private static void mergeArraysInSorted(int[] left, int[] right) {

		int arr1[] = new int[left.length + right.length];
		int i = 0, j = 0, count = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr1[count++] = left[i];
				i++;
			} else {
				arr1[count++] = right[j];
				j++;
			}
		}
		while (i < left.length) {
			arr1[count++] = left[i];
			i++;
		}
		while (j < right.length) {
			arr1[count++] = right[j];
			j++;
		}

		printArr(arr1);
	}

	private static void printArr(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}

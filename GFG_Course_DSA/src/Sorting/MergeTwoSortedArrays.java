package Sorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the second array details");
		int m = sc.nextInt();

		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		mergeTwoArrays(a, n, b, m);
	}

	private static void mergeTwoArrays(int[] a, int n, int[] b, int m) {

		// int arr[] = new int[n + m];
		int i = 0, j = 0, count = 0;

		while (i < n && j < m) {
			if (a[i] <= b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (a[i] >= b[j]) {
				System.out.print(b[j] + " ");
				j++;
			}
		}
		while (i < n) {
			System.out.print(a[i] + " ");
			i++;
		}
		while (j < m) {
			System.out.print(b[j] + " ");
			j++;
		}
//		printarr(arr);

	}

	private static void printarr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

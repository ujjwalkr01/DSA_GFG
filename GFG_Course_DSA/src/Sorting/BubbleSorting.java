package Sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of elements

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr, n);
	}

	private static void bubbleSort(int[] arr, int n) {

		for (int lastIndex = arr.length; lastIndex > 0; lastIndex--) {
			int i = 0;
			int j = i + 1;

			while (j < lastIndex) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}

package arrays_Questions;

import java.util.Scanner;

public class RearrangeArray_alternate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		rearrangeArray(arr, n);
	}

	private static void rearrangeArray(int[] arr, int n) {

		int min = 0, max = n - 1, maxEle = arr[n - 1] + 1;
		int i = 0;

		while (min <= max) {
			if (i % 2 == 0) {
				arr[i] = arr[i] + (arr[max] % maxEle) * maxEle;
				max--;
			} else {
				arr[i] = arr[i] + (arr[min] % maxEle) * maxEle;
				min++;
			}
			i++;
		}
		for (int j = 0; j < n; j++) {
			arr[j] /= maxEle;
		}
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

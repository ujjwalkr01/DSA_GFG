package arrays_Questions;

import java.util.Scanner;

public class RearrangeArray_alternate2 {

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

		for (int i = 0; i < n; i++) {
			arr[i] += (arr[arr[i]] % n) * n;
		}
		printArray(arr, n);

		for (int i = 0; i < n; i++) {
			arr[i] /= n;
		}
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

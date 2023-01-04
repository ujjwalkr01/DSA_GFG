package arrays_Questions;

import java.util.Scanner;

public class MaxSumOF_Subarrays {

	public static void main(String[] args) {

		int arr[] = new int[7];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		maxSum(arr, n);
		System.out.println("________________________________________");
		kadaneAlgorithm(arr, n); //efficient solution..
	}

	private static void maxSum(int[] arr, int n) {

		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}

	private static void kadaneAlgorithm(int[] arr, int n) {

		long res = Integer.MIN_VALUE;
		int maxEnd = 0;

		for (int i = 0; i < n; i++) {

			maxEnd = Math.max(maxEnd + arr[i], arr[i]);
			res = Math.max(res, maxEnd);
		}
		System.out.println("Max Sum of subarray: " + res);

	}

}

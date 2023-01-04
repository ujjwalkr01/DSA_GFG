package arrays_Questions;

import java.util.Scanner;

public class max_consuctiveBinary {

	public static void main(String[] args) {

		int arr[] = new int[8];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		countofOne(arr, n);
	}

	private static void countofOne(int[] arr, int n) {

		int count = 0;
		int maxCount = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
				maxCount = Math.max(count, maxCount);
			} else
				maxCount = 0;

		}

		System.out.println("Max count of One is: " + maxCount);
	}

}

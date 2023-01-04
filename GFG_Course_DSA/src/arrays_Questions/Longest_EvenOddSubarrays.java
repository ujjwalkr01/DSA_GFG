package arrays_Questions;

import java.util.Scanner;

public class Longest_EvenOddSubarrays {

	public static void main(String[] args) {

		int arr[] = new int[6];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		naiveSolution(arr, n);
		kadaneAlgorithm(arr, n);
	}

	private static void naiveSolution(int[] arr, int n) {

		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int curr = 1;
			for (int j = i + 1; j < n; j++) {
				if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
					curr++;
				else
					break;
			}
			res = Math.max(res, curr);
		}
		System.out.println("Max Length of Even-odd: " + res);
	}

	public static void kadaneAlgorithm(int arr[], int n) {
		int res = 1;
		int curr = 1;
		for (int i = 1; i < n; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				curr++;
				res = Math.max(curr, res);
			} else
				curr = 1;
		}
		System.out.println("max length of even odd subarray:" + res);
	}

}

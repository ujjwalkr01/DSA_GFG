package arrays_Questions;

import java.util.Scanner;

public class MinAdjDiff {

	public static void main(String[] args) {

		int arr[] = new int[7];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int res = minDiff(arr);
		System.out.println("Final result " + res);

		int res1 = minDif(arr);
		System.out.println("Optimised solution " + res1);
	}

	private static int minDif(int[] arr) {
		int n = arr.length;
		int min = Math.abs(arr[0] - arr[n - 1]);

		for (int i = 0; i < n - 1; i++) {
			int sub = Math.abs(arr[i] - arr[i + 1]);
			if (min > sub)
				min = sub;
		}

		return min;
	}

	private static int minDiff(int[] arr) {
		int n = arr.length;
		int min = Math.abs(arr[0] - arr[n - 1]);

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j <= i + 1; j++) {
				int diff = Math.abs(arr[i] - arr[j]);
				System.out.println(diff);
				if (min > diff)
					min = diff;
			}
		}
		return min;
	}

}

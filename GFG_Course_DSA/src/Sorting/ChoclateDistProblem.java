package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ChoclateDistProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(choclateDisProb(arr, n, m));
	}

	private static int choclateDisProb(int[] arr, int n, int m) {

		if (m > n) {
			return -1;
		}
		Arrays.sort(arr);
		int res = arr[m - 1] - arr[0];

		for (int i = 0; (i + m - 1) < n; i++) {
			res = Math.min(res, (arr[i + m - 1] - arr[i]));
		}
		return res;
	}

}

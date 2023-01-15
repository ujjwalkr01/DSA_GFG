package arrays_Questions_WindowSlidingTechnique;

import java.util.Scanner;

public class MaximumSumOf_kConsecutiveEle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int res = maxSumof_kcons(arr, n, k);
		System.out.println(res);
		System.out.println("-------------------------------------------------");
		System.out.println("AlternateMethod: " + optimiseMethod(arr, n, k));
	}

	private static int maxSumof_kcons(int[] arr, int n, int k) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < n - k + 1; i++) {
			int sum = 0;

			for (int j = 0; j < k; j++) {
				sum += arr[i + j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

	private static int optimiseMethod(int[] arr, int n, int k) {
     //this is a window sliding method ....
		int curr_Sum = 0;
		for (int i = 0; i < k; i++) {
			curr_Sum += arr[i];
		}
		int max_Sum = curr_Sum;

		for (int i = k; i < n; i++) {
			curr_Sum += (arr[i] - arr[i - k]);
			max_Sum = Math.max(max_Sum, curr_Sum);
		}
		return max_Sum;
	}

}

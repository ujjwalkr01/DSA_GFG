package arrays_QuestionsPrefixSumTechniq;

import java.util.Scanner;

public class FindprefixSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int prefixSum[] = prefixSum(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(prefixSum[i] + " ");
		}
		System.out.println("-----------------------------------");
		System.out.println(getSum(prefixSum, 1, 3));
		System.out.println(getSum(prefixSum, 0, 2));
	}

	private static int[] prefixSum(int[] arr, int n) {

		int prefixSum[] = new int[n];

		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		return prefixSum;

	}

	private static int getSum(int prefixSum[], int l, int r) {

		if (l != 0) {
			return prefixSum[r] - prefixSum[l - 1];
		} else {
			return prefixSum[r];
		}
	}

}

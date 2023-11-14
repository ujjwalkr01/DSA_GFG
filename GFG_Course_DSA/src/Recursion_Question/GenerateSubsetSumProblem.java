package Recursion_Question;

public class GenerateSubsetSumProblem {

	public static void main(String[] args) {

		// Question states that we have to find the cnt of pairs of Subset given sum..
		/*
		 * we have to just maintain the sum and n for the index and at any stage where
		 * our sum becomes 0 that means we have found the pairs of the subset and will
		 * return 1; else will return 0;
		 */

		int arr[] = { 10, 5, 2, 3, 6 };
		int sum = 8;
		int n = arr.length;

		System.out.println(cntSubsetSum(arr, n, sum));

	}

	private static int cntSubsetSum(int[] arr, int n, int sum) {

		if (n == 0) {
			return sum == 0 ? 1 : 0;
		}
		return cntSubsetSum(arr, n - 1, sum) + cntSubsetSum(arr, n - 1, sum - arr[n - 1]);
	}

}

package arrays_Questions_WindowSlidingTechnique;

import java.util.Scanner;

public class Subarray_with_GivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 33;
		subarrayWithsum(arr, n, sum);
	}

	private static void subarrayWithsum(int[] arr, int n, int sum) {

		int curr_sum = arr[0];
		int start = 0;

		for (int i = 1; i <= n; i++) {

			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				System.out.println("Subarray found between index " + start + " and " + (i - 1));
				break;
			}
			if (i < n) {
				curr_sum += arr[i];
			}

		}
		if(curr_sum!=sum) {
			System.out.println("-1");
		}
	}

}

package arrays_QuestionsPrefixSumTechniq;

import java.util.Scanner;

public class CheckEquilibrium {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = checkequilibrium(arr, n);
		System.out.println(res);
		System.out.println("----------------------------");
		int alternateMeth = checkequili(arr, n);
		System.out.println(alternateMeth);
	}

	private static int checkequilibrium(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int l_sum = 0, r_sum = 0;
			for (int j = 0; j < i; j++) {
				l_sum += arr[j];
			}
			for (int k = i + 1; k < n; k++) {
				r_sum += arr[k];
			}
			if (r_sum == l_sum) {
				return arr[i];
			}
		}
		return -1;
	}

	private static int checkequili(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int l_sum = 0;
       //for comparing the 
		for (int i = 0; i < n; i++) {

			if (l_sum == sum - arr[i]) {
				return arr[i];
			}
			l_sum += arr[i];
			sum -= arr[i];
		}
		return -1;

	}

}

package TwoPointers;

import java.util.Scanner;

public class findDtripletSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
//Array must be sorted for two pointer
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();

		if (checkThreePair(arr, n, sum)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	private static boolean checkThreePair(int[] arr, int n, int sum) {

		for (int i = 0; i < n; i++) {
			if (isPairExist(arr, n, i + 1, sum - arr[i])) {
				return true;
			} 
		}
		return false;
	}

	private static boolean isPairExist(int[] arr, int n, int i, int sum) {

		int j = n - 1;

		while (i < j) {
			if (arr[i] + arr[j] == sum) {
				return true;
			} else if (arr[i] + arr[j] > sum) {
				j--;
			} else {
				i++;
			}
		}

		return false;
	}

}

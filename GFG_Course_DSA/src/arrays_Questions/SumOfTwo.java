package arrays_Questions;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 4, 7, 8 };

		Scanner sc = new Scanner(System.in);

		int target = 9;

		System.out.println(sumofTwo(arr, target));
	}

	public static int[] sumofTwo(int arr[], int target) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

}

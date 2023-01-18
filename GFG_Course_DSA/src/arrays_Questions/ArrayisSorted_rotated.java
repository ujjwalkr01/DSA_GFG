package arrays_Questions;

import java.util.Scanner;

public class ArrayisSorted_rotated {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		checkarray(arr, n);
		if (checkarray(arr, n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean checkarray(int[] arr, int n) {
//for checking the increasing order
		if (arr[n - 1] < arr[0]) {
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (arr[i] < arr[i - 1]) {
					count++;
				}
			}
			if (count == 1)
				return true;
		} // for checking the decreasing order
		else if (arr[n - 1] > arr[0]) {
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (arr[i] > arr[i - 1]) {
					count++;
				}
			}
			if (count == 1)
				return true;
		}
		return false;
	}

}

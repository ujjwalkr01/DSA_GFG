package arrays_Questions;

import java.util.Scanner;

public class Checking_SortedArray {

	public static void main(String[] args) {

		int arr[] = new int[4];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean res = checkSortingArray(arr);
		System.out.println("Is array sorted? " + res);
	}

	public static boolean checkSortingArray(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}

		}
		return true;
	}
}

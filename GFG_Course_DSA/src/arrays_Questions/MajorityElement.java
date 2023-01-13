package arrays_Questions;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {

		int arr[] = new int[7];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = majorityEle(arr, n);
		System.out.println(res);
		System.out.println("--------------------------------------------");

		int optimisedMethod = Boyer_moore_votingAlgo(arr, n);
		System.out.println(optimisedMethod);
	}

	private static int majorityEle(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count > (n / 2)) {
				return arr[i];
			}
		}
		return -1;
	}

	public static int Boyer_moore_votingAlgo(int arr[], int n) {
		int vote = 1, candidate = 0;

		// TO find the candidate within the majority...
		for (int i = 1; i < n; i++) {
			if (arr[candidate] == arr[i]) {
				vote++;
			} else {
				vote--;
			}
			if (vote == 0) {
				candidate = arr[i];
				vote = 1;
			}

		}
		// to Check the occurrence of the candidate greater than N/2 or not..
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (candidate == arr[i]) {
				count++;
			}
		}
		if (count > (n / 2)) {
			return candidate;
		}

		return -1;
	}

}

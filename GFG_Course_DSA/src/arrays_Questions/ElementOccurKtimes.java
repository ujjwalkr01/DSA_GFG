package arrays_Questions;

import java.util.Scanner;

public class ElementOccurKtimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 3;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(occurKtimes(arr, n, k));
	}

	private static int occurKtimes(int[] arr, int n, int k) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(arr[i], max);
		}

		int hash[] = new int[max + 1];

		for (int i = 0; i < hash.length; i++) {
			hash[arr[i]]++;
			if (hash[arr[i]] == k) {
				return hash[i];
			}
		}
		return -1;
	}

}

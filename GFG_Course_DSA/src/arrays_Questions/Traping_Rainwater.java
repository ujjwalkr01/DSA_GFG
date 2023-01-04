package arrays_Questions;

import java.util.Scanner;

public class Traping_Rainwater {

	public static void main(String[] args) {

		int arr[] = new int[12];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		trappingRainwater(arr, n);

		trappingRain_Water(arr, n); //efficient solution....
	}

	private static void trappingRainwater(int[] arr, int n) {

		int res = 0;

		for (int i = 1; i < n - 1; i++) {
			int left_max = arr[i];

			for (int j = 0; j < i; j++)
				left_max = Math.max(left_max, arr[j]);

			int right_max = arr[i];

			for (int j = i + 1; j < n; j++)
				right_max = Math.max(right_max, arr[j]);

			res = res + (Math.min(left_max, right_max) - arr[i]);
		}
		System.out.println("Units of water Stored: " + res);

	}

	public static void trappingRain_Water(int arr[], int n) {
		int res = 0;
		int left_max[] = new int[n];
		int right_max[] = new int[n];

		left_max[0] = arr[0];
		for (int i = 1; i < n; i++)
			left_max[i] = Math.max(arr[i], left_max[i - 1]);

		right_max[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right_max[i] = Math.max(arr[i], right_max[i + 1]);

		for (int i = 0; i < n; i++)
			res = res + (Math.min(left_max[i], right_max[i]) - arr[i]);

		System.out.println("Units of water Stored: " + res);

	}

}

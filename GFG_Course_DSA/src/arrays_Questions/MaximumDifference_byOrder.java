package arrays_Questions;

import java.util.Scanner;

public class MaximumDifference_byOrder {

	public static void main(String[] args) {

		int arr[] = new int[7];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// In both we have to intialize a variable and store the difference of first two index...
		// such that [ j>i ] .
		maxDiff(arr, n); // naive solution...
		System.out.println("______________________________________");

		maxDiff_alternateMethod(arr, n); // optimized solution..

	}

	public static void maxDiff(int arr[], int n) {
		int res = arr[1] - arr[0];
//in time complexity is Theta(n^2).....

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				res = Math.max(res, arr[j] - arr[i]);
			}
//			n=n-1;
//			while(n!=i) {
//				res=Math.max(res, arr[n]-arr[i]);
//				n--;
//			}
		}

		System.out.println("maximum difference is: " + res);
	}

	public static void maxDiff_alternateMethod(int arr[], int n) {
		int res = arr[1] - arr[0];
		int minValue = arr[0];
// in this time complexity is Theta(n)...
		for (int j = 1; j < n; j++) {
			res = Math.max(res, arr[j] - minValue);
			minValue = Math.min(minValue, arr[j]);
		}
		System.out.println("Maximum difference is: " + res);
	}

}

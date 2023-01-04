package arrays_Questions;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {

		int arr[] = new int[42];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int res = largestEle(arr);
		System.out.println("The largest element is at index: " + res);

		int res1 = alternateMethod(arr);
		System.out.println("The largest element is at index: " + res1);
	}

	public static int largestEle(int arr[]) {
		int max = 0, value = 0;
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[max]) {
				max = i;
				value = arr[max];
			}
		}
		return max;
	}

	public static int alternateMethod(int arr[]) {

		int max = Integer.MIN_VALUE, value = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				value = i;
			}
		}
		return value;
	}
}

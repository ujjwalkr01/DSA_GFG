package arrays_Questions;

import java.util.Scanner;

public class LeftRotateArray_byOne {

	public static void main(String[] args) {

		int arr[] = new int[7];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		leftRotateByOne(arr);

	}

	public static void leftRotateByOne(int arr[]) {

		int n = arr.length;
		int temp = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;

		System.out.println("After left rotating array by one:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}

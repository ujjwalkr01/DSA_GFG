package arrays_Questions;

import java.util.Scanner;

public class Remove_DuplicateElement1 {

	public static void main(String[] args) {
		int arr[] = new int[6];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int y = duplicateElement_alternateMethod(arr);
		System.out.println("After eliminating the duplicate element:");
		for (int i = 0; i < y; i++)
			System.out.println(arr[i]);

	}

	public static int duplicateElement_alternateMethod(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];
		temp[0] = arr[0];
		int res = 1;
           //this method also has time complexity of O(n) but in this auxiliary space is O(n) because we have created new array as temp[]....
		for (int i = 1; i < n; i++) {
			if (arr[i] != temp[res - 1]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
			System.out.println("Arrays:" + arr[i]);
		}

		return res;
	}
}

package arrays_Questions;

import java.util.Scanner;

public class Remove_DuplicateElement {

	public static void main(String[] args) {

		int arr[] = new int[8];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int x = duplicateElement(arr);
		System.out.println("After eliminating the duplicate element:");
		for (int i = 0; i < x; i++)
			System.out.println(arr[i]);

	}

	public static int duplicateElement(int[] arr) {
		int n = arr.length;
		int res = 1;
		// basically this method takes O(n) time complexity and auxiliary space is O(1)
		// as we have completed our work in only one array...
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

}

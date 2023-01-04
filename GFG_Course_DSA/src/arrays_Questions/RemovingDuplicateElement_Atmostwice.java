package arrays_Questions;

import java.util.Scanner;

public class RemovingDuplicateElement_Atmostwice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int y = eliminateMoreThanTwice(arr);
		System.out.println("After eliminating the duplicate element:");
		for (int i = 0; i < y; i++)
			System.out.println(arr[i]);

	}

	private static int eliminateMoreThanTwice(int[] arr) {
		int res = 1, count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
				count = 1;
			} else {
				count++;
				if (count <= 2) {
					arr[res] = arr[i];
					res++;
				}
			}
		}

		return res;
	}

}

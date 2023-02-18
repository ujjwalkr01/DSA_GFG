package Recursion_Question;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0;
		System.out.println(sumOfelements(arr, i));
	}

	private static int sumOfelements(int[] arr, int i) {

		if (i == arr.length) {
			return 0;
		}
		return sumOfelements(arr, i + 1)+ arr[i];
	}

}

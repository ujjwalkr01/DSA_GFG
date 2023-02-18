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

		System.out.println(sumOfelements(arr, n));
	}

	private static int sumOfelements(int[] arr, int n) {

		if (n <=0) {
			return 0;
		}
		return sumOfelements(arr, n-1)+ arr[n-1];
	}

}

package arrays_Questions;

import java.util.Scanner;

public class MimimumConsecutiveFlips {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		minConsFlips(arr, n);
	}

	private static void minConsFlips(int[] arr, int n) {
/*
 * as we know that our second group count will give min flips so we run a loop from 1 to last....
 */
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0]) {
					System.out.print("from " + i + " to ");
				} else {
					System.out.println(i - 1);
				}
			}
			
		}if (arr[n - 1] != arr[0]) {
			System.out.println(n - 1);
		}
		
	}

}

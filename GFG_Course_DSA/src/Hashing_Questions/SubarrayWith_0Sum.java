package Hashing_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWith_0Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		if (ChecksubarrayWithZeroSum(arr, n)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean ChecksubarrayWithZeroSum(int[] arr, int n) {

		HashSet<Integer> set = new HashSet<>();
		set.add(0);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (set.contains(sum)) {
				return true;
			} else {
				set.add(sum);
			}
		}

		return false;
	}

}

package Hashing_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWith_givenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=21;

		if (ChecksubarrayWithZeroSum(arr, n,sum)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean ChecksubarrayWithZeroSum(int[] arr, int n, int sum) {

		HashSet<Integer> set = new HashSet<>();
		set.add(0);

		int prefixSum=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(prefixSum==sum) {
				return true;
			}

			prefixSum += arr[i];

			if (set.contains(prefixSum-sum)) {
				return true;
			} else {
				set.add(prefixSum);
			}
		}

		return false;
	}

}

package Hashing_Questions;

import java.util.HashSet;

public class PairwithThegivenSum_UnsortedArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 7, 8, 4, 7, 6, 1 };
		int sum = 14;
		if (findThepairSum(arr, sum)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("--------Method2----------------");
		if (findThepairSum1(arr, sum)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	private static boolean findThepairSum1(int[] arr, int sum) {

		HashSet<Integer> set1 = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set1.contains(sum - arr[i])) {
				return true;
			}
			set1.add(arr[i]);
		}
		return false;
	}

	private static boolean findThepairSum(int[] arr, int sum) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		int count = 0;
		for (int num : arr) {
			if (set.contains(sum - num)) {
				count++;
				if (count == 2) {
					return true;
				}
			}
		}

		return false;
	}

}

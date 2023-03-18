package Hashing_Questions;

import java.util.HashSet;

public class UnionOfTwoArrays2 {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 3, 3, 3 };
		int arr1[] = new int[] { 3, 3, 3, 3, 10 };

		int count = findUnionElement(arr, arr1);
		System.out.println(count);
	}

	private static int findUnionElement(int[] arr, int[] arr1) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		int count = 0;
		for (int num : arr1) {
			set.add(num);
		}
		System.out.println(set);
		return set.size();
	}

}

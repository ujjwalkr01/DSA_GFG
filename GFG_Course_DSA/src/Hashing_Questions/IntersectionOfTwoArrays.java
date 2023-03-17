package Hashing_Questions;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 15, 20, 15, 30, 30, 5 };
		int arr1[] = new int[] { 30, 5, 30, 80 };

		int count = findIntersectionElement(arr, arr1);
		System.out.println(count);
	}

	private static int findIntersectionElement(int[] arr, int[] arr1) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		int count = 0;
		for (int num : arr1) {
			if (set.contains(num)) {
				count++;
				set.remove(num);
			}
		}
		System.out.println(set);
		return count;
	}

}

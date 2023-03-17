package Hashing_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CountDistinctELement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(countDistinctEle(arr, n));

		System.out.println("-----------------------------------");
		Integer arr1[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println(countDistinctEle_EfficientMethod(arr1, n));
	}

	private static int countDistinctEle_EfficientMethod(Integer[] arr1, int n) {

		HashSet<Integer> s = new HashSet<>(Arrays.asList(arr1));
		System.out.println(s);
		return s.size();
	}

	private static int countDistinctEle(int[] arr, int n) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		return set.size();
	}

}

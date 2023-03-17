package Hashing_Questions;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		countFreq(arr);
	}

	private static void countFreq(int[] arr) {

		LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();

		for (int x : arr) {
			mp.put(x, mp.getOrDefault(x, 0) + 1);
		}
		 System.out.println(mp);
		for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

package arrays_Questions;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			max=Math.max(A[i], max);
		}
		//System.out.println(missingNumber(A, n));
		alternateMthod(A, n, max);
	}

	private static void alternateMthod(int[] a, int n, int max) {

		int hash[] = new int[max + 2];
        System.out.println("lenght ="+hash.length);
		for (int i = 0; i < n; i++) {
			if (a[i] >= 1) {
				hash[a[i]]++;
			}
		}
		for (int i = 1; i < hash.length; i++) {
			System.out.print(hash[i]+" ");
		}

		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				System.out.println("\n"+i);
				break;
			}
		}
	}

	private static int missingNumber(int[] A, int n) {

		// Brute Force
		int num = 0;
		for (int i = 1; i <= n + 1; i++) {
			boolean ismissing = true;
			for (int j = 0; j < n; j++) {
				if (A[j] == i) {
					ismissing = false;
					break;
				}
			}
			if (ismissing == true) {
				return i;
			}
		}
		return 0;
	}

}

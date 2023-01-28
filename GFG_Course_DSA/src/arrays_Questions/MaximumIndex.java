package arrays_Questions;

import java.util.Scanner;

public class MaximumIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(maxIndexDiff(A, n));
		System.out.println(maxIndexDiffalternate(A, n));
	}

	private static int maxIndexDiffalternate(int[] A, int n) {

		int max=0;
		for(int j=n-1;j>=0;j--) {
			int i=0;
			while(j>i) {
				if(A[i]<A[j]) {
					max=Math.max(max, j-i);
					break;
				}
				i++;
			}
		}
		return max;
	}

	private static int maxIndexDiff(int[] A, int N) {

		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j >= 0; j--) {
				if (A[i] <= A[j] && i <= j) {
					max = Math.max(max, j - i);
					break;
				}
			}
		}
		return max;
	}
	// 17
//	35 98 95 94 75 8 47 28 75 91 28 83 72 54 67 9 34
}

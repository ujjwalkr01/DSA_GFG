package More_2DArrays_Questions;

import java.util.Scanner;

public class SumOfDiagonalMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		diagonalMatrix(arr, n);
	}

	private static void diagonalMatrix(int[][] arr, int n) {

		int sum = 0, Secsum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
				if (i + j == n-1) {
					Secsum += arr[i][j];
				}
			}
		}
		System.out.println(sum + " " + Secsum);

	}

}

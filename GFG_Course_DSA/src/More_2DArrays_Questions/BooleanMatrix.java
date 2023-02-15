package More_2DArrays_Questions;

import java.util.Scanner;

public class BooleanMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3, col = 3;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		booleanMatrix(arr, row, col);
		printMatrix(arr, row, col);

	}

	private static void printMatrix(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void booleanMatrix(int[][] matrix, int r, int c) {

		int row[] = new int[r];
		int col[] = new int[c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrix[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 1;
				}
			}
		}
	}

}

package arrays2D_Questions;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // no of rows
		int col = sc.nextInt(); // no of columns

		int a[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("now enter the element for the second matrix");
		int row1 = sc.nextInt(); // no of rows
		int col1 = sc.nextInt(); // no of columns

		int b[][] = new int[row1][col1];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		matrixMultiply(a, row, col, b, row1, col1);
	}

	private static void matrixMultiply(int[][] a, int row, int col, int[][] b, int row1, int col1) {

		if (col != row1) {
			int c[][] = new int[0][0];
		} else {
			int c[][] = new int[row][col1];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col1; j++) {
					for (int k = 0; k < row1; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col1; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}

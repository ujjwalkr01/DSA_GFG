package More_2DArrays_Questions;

import java.util.Scanner;

public class ExchangeColumn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int matrix[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		exchangeColumn(matrix);
	}

	private static void exchangeColumn(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			int low = 0, high = matrix[0].length - 1;

			int temp = matrix[i][low];
			matrix[i][low] = matrix[i][high];
			matrix[i][high] = temp;

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

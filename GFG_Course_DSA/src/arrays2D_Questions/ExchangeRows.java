package arrays2D_Questions;

import java.util.Scanner;

public class ExchangeRows {

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
		interchangeRows(matrix);
	}

	private static void interchangeRows(int[][] matrix) {

			for (int j = 0; j < matrix[0].length; j++) {
				int low = 0, high = matrix.length - 1;

				while (low < high) {

					int temp = matrix[low][j];
					matrix[low][j] = matrix[high][j];
					matrix[high][j] = temp;

					low++;
					high--;
				}

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

package arrays2D_Questions;

import java.util.Scanner;

public class AddingTwoMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int A[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		int B[][] = new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		int res[][] = sumofTwoMatrix(A, row, col, B, row1, col1);
		printArray(res, row, col);

	}

	private static void printArray(int[][] res, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] sumofTwoMatrix(int[][] A, int row, int col, int[][] B, int row1, int col1) {

		if(row!=row1 || col!=col1) {
			int res[][]=new int[0][0];
			return res;
		}
		int res[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = A[i][j] + B[i][j];
			}
		}

		return res;
	}

}

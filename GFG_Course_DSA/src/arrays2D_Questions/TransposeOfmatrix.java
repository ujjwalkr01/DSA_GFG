package arrays2D_Questions;

import java.util.Scanner;

public class TransposeOfmatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 4, col = 4;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		transposeMatrix(arr, row, col);
		System.out.println("--------------------Optimised method------------");
		alternateMethod(arr, row, col);
	}

	private static void alternateMethod(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < col; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void transposeMatrix(int[][] arr, int row, int col) {

		int arr1[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[j][i] = arr[i][j];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}

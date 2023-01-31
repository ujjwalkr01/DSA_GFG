package arrays2D_Questions;

import java.util.Scanner;

public class RotateMatrixAnticlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 4, col = 4;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		rotateMatrixby90(arr, row, col);
		System.out.println("--------------------Optimised method------------");
		alternateMethod(arr, row, col);
	}

	private static void alternateMethod(int[][] arr, int row, int col) {

		maketransposeMatrix(arr, row, col);
		reverseColumn(arr, row, col);
	}

	private static void maketransposeMatrix(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < col; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

	}

	private static void reverseColumn(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			int low = 0, high = row - 1;

			while (low < high) {
				int temp = arr[low][i];
				arr[low][i] = arr[high][i];
				arr[high][i] = temp;
				low++;
				high--;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotateMatrixby90(int[][] arr, int row, int col) {

		int temp[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				temp[col - j - 1][i] = arr[i][j];
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}

}

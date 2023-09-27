package arrays2D_Questions;

import java.util.Scanner;

public class RotateMatrix_90ClockWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3, col = 3;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("--------------------Optimised method------------");
		alternateMethod(arr, row, col);
	}

	private static void alternateMethod(int[][] arr, int row, int col) {

		maketransposeMatrix(arr, row, col);
//		reverseRow(arr, row, col); if we transpose from right to left then we have to reverse row
		reverseColumn(arr, row, col); //if we transpose from left to right then we have to reverse column...
		printMatrix(arr, row, col);
	}

	private static void maketransposeMatrix(int[][] arr, int row, int col) {

//		for (int i = 0; i < row; i++) {
//			int k = i;
//			for (int j = col - i - 2; j >= 0; j--) {
//				k++;
//				int temp = arr[i][j];
//				arr[i][j] = arr[k][col - i - 1];
//				arr[k][col - i - 1] = temp;
//			}
//		}
		
//		alternate way
		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < col; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

	}

	private static void reverseRow(int[][] arr, int row, int col) {

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

	}

	private static void reverseColumn(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			int low = 0, high = row - 1;

			while (low < high) {
				int temp = arr[i][low];
				arr[i][low] = arr[i][high];
				arr[i][high] = temp;
				low++;
				high--;
			}
		}

	}

	private static void printMatrix(int[][] arr, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

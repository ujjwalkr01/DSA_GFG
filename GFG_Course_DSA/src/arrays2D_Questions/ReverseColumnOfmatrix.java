package arrays2D_Questions;

import java.util.Scanner;

public class ReverseColumnOfmatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 2, col = 5;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		reversetheArray(arr, row, col);
	}

	private static void reversetheArray(int[][] arr, int row, int col) {

		for (int i = 0; i < row; i++) {
			int low = 0, high = col - 1;

			while (low < high) {
				int temp = arr[i][low];
				arr[i][low] = arr[i][high];
				arr[i][high] = temp;
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

}

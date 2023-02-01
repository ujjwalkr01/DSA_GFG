package arrays2D_Questions;

import java.util.Scanner;

public class SearchInSortedmatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 4, col = 4;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int x = 24;
		searchInMatrix(arr, row, col, x);
	}

	private static void searchInMatrix(int[][] arr, int row, int col, int x) {

		int i = 0, j = col - 1;

		while (i < row && j >= 0) {

			if (arr[i][j] == x) {
				System.out.println("Yes found at: " + i + " " + j);
				return;
			} else if (arr[i][j] > x) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("not Found");

	}

}

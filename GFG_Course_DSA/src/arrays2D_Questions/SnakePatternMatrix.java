package arrays2D_Questions;

import java.util.Scanner;

public class SnakePatternMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3, col = 4;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		SnakePattern(arr, row, col);
	}

	private static void SnakePattern(int[][] arr, int row, int col) {

		int left = 0, right = col - 1;
		int top = 0, down = row - 1;

		while (true) {
			leftToright(arr, left, right, top);
			top++;
			if (top > down) {
				break;
			}

			rightToleft(arr, right, left, top);
			top++;

			if (top > down) {
				break;
			}
		}
	}

	public static void leftToright(int arr[][], int start, int end, int top) {
		for (int i = start; i <= end; i++) {
			System.out.print(arr[top][i] + " ");
		}
	}

	public static void rightToleft(int arr[][], int start, int end, int top) {
		for (int i = start; i >= end; i--) {
			System.out.print(arr[top][i] + " ");
		}
	}

}

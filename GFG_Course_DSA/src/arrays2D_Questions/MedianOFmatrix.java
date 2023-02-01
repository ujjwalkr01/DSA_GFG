package arrays2D_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOFmatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 3, col = 5;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int median = findMin_max(arr, row, col);
		System.out.println(median);
	}

	private static int findMin_max(int[][] arr, int row, int col) {

		int min = arr[0][0], max = arr[0][col - 1];

		for (int i = 1; i < row; i++) {
			if (min > arr[i][0]) {
				min = arr[i][0];
			}
			if (max < arr[i][col - 1]) {
				max = arr[i][col - 1];
			}
		}

		return findMedianPos(arr, min, max, row, col);
	}

	private static int findMedianPos(int[][] arr, int min, int max, int row, int col) {
		int med_pos = ((row * col) + 1) / 2;

		while (min < max) {
			int mid = (min + max) / 2;

			int midPos = 0;
			for (int i = 0; i < row; i++) {
				int pos = Arrays.binarySearch(arr[i], mid) + 1;
				midPos += Math.abs(pos);
			}

			if (midPos < med_pos) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}
		return min;
	}

}

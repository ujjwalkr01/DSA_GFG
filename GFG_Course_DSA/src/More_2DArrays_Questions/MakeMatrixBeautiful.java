package More_2DArrays_Questions;

import java.util.Scanner;

public class MakeMatrixBeautiful {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int arr[][] = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(countOfOperations(arr, row));
	}

	private static int countOfOperations(int[][] matrix, int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += matrix[i][j];
			}
		}

		int mx = 0;
		for (int i = 0; i < n; i++) {
			int row = 0, col = 0;
			for (int j = 0; j < n; j++) {
				row += matrix[i][j]; // for calculating the sum of rows
				col += matrix[j][i]; // for calculating the sum of column
			}
			// here we are calculating the max of all sum of the rows and column
			mx = Math.max(mx, row);
			mx = Math.max(mx, col);
		}
		int beautiMatrix = n * mx;

		return (beautiMatrix - sum);
	}

}

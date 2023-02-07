package arrays2D_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOFupper_lowerTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = 2, col = 2;

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		sumofUpperTrangle(arr, row, col, list);
		sumOfLowerTriangle(arr, row, col, list);

		System.out.println(list);
	}

	private static void sumofUpperTrangle(int[][] arr, int row, int col, ArrayList<Integer> list) {

		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = i; j < col; j++) {
				sum += arr[i][j];
			}
		}
		list.add(sum);
	}

	private static void sumOfLowerTriangle(int[][] arr, int row, int col, ArrayList<Integer> list) {

		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = i; j < col; j++) {
				sum += arr[j][i];
			}
		}
		list.add(sum);
	}

}

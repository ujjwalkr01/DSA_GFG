package More_2DArrays_Questions;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();

		System.out.println(sumOFallDiagonal(n));
	}

	public static long sumOFallDiagonal(long n) {
		long diagonal = (n * (n + 1)) * 2;

		if (n % 2 == 0) {
			return diagonal;
		} else {
			return (diagonal - (n + 1));
		}
	}

}

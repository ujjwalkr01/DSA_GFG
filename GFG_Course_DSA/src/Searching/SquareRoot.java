package Searching;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = findsqrt(num);
		System.out.println(res);
	}

	private static int findsqrt(int num) {
		int low = 1, high = num, res = -1;
		// applying the binary search
		while (low <= high) {
			int mid = (low + high) / 2;
			int square = mid * mid;

			if (square == num) {
				return mid;
			} else if (square > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
				res = mid;
			}

		}

		return res;
	}

}

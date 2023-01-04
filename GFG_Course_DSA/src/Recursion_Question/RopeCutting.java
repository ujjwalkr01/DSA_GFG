package Recursion_Question;

import java.util.Scanner;

public class RopeCutting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 23, a = 12, b = 9, c = 11;

		System.out.println(maxpieces(n, a, b, c));
	}

	public static int maxpieces(int n, int a, int b, int c) {

		if (n == 0)
			return 0;
		if (n <= -1)
			return -1;

		int res = Math.max(maxpieces(n - a, a, b, c), Math.max(maxpieces(n - b, a, b, c), maxpieces(n - c, a, b, c)));

		if (res == -1)
			return -1;

		return res + 1;
	}

}

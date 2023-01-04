package Recursion_Question;

import java.util.Scanner;

public class SumOfNnatural {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		sumOf(n);
		System.out.println(sumOf(n));

	}

	static int sumOf(int n) {

		if (n == 0)
			return 0;
		return n + sumOf(n - 1);
	}

}

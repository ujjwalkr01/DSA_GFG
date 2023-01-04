package Recursion_Question;

import java.util.Scanner;

public class Digitalroots {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int finalRes = DigitalRoots(n);
		System.out.println(finalRes);
	}

	public static int DigitalRoots(int n) {

		return rec(n);
	}

	static int rec(int n) {
		if (n < 10)
			return n;
		return rec(sumOfDigits(n));
	}

	static int sumOfDigits(int n) {

		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}

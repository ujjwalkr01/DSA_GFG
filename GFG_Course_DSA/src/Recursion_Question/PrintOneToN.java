package Recursion_Question;

import java.util.Scanner;

public class PrintOneToN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		printRevNum(n); // printing the number from N to 1

		System.out.println("------------------------------------------");

		printNum(n);// prinnting the number from 1 to N
	}

	private static void printNum(int n) {

		if (n == 0) {
			return;
		}

		printNum(n - 1);
		System.out.println(n);
	}

	private static void printRevNum(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);
		printRevNum(n - 1);
	}

}

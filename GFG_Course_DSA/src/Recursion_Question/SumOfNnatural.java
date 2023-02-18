package Recursion_Question;

import java.util.Scanner;

public class SumOfNnatural {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		sumOf(n);
		System.out.println(sumOf(n));
		System.out.println("----------------------------------");
		
		int sum=0;		
		alternateMethod(n, sum);
		System.out.println(alternateMethod(n, sum));


	}
	private static int alternateMethod(int n, int sum) {

		if (n == 0) {
			return sum;
		}

		return alternateMethod(n - 1, sum + n); //tail recursion 
	}

	static int sumOf(int n) {

		if (n == 0)
			return 0;
		return n + sumOf(n - 1);
	}

}

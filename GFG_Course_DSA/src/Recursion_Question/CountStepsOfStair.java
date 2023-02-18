package Recursion_Question;

import java.util.Scanner;

public class CountStepsOfStair {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(countSteps(n));
	}

	private static int countSteps(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} 
		return countSteps(n - 1) + countSteps(n - 2);
	}

}

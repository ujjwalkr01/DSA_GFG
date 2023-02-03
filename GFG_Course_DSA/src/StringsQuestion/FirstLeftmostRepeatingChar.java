package StringsQuestion;

import java.util.Scanner;

public class FirstLeftmostRepeatingChar {

	static final int CHAR = 256;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();

		System.out.println(BruteForce(s1)); // naive approach
		System.out.println("___________________________________");
		System.out.println(optimisedSol(s1));
		System.out.println("___________________________________");
		System.out.println(EfficientSol(s1));

	}

	private static int BruteForce(String s1) {

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j))
					return i;
			}
		}
		return -1;
	}

	private static int optimisedSol(String s1) {

		int count[] = new int[CHAR];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}

		for (int i = 0; i < CHAR; i++) {
			if (count[s1.charAt(i)] > 1)
				return i;
		}
		return -1;
	}

	private static int EfficientSol(String s1) {

		boolean isVisited[] = new boolean[CHAR];
		int res = -1;

		for (int i = s1.length() - 1; i >= 0; i--) {
			if (isVisited[s1.charAt(i)]) {
				res = i;
			} else {
				isVisited[s1.charAt(i)] = true;
			}
		}
		return res;
	}

}

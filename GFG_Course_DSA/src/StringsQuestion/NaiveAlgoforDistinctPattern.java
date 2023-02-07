package StringsQuestion;

import java.util.Scanner;

public class NaiveAlgoforDistinctPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String pat = sc.next();

		checkPattern(text, pat); // improved naive algorithm
	}

	private static void checkPattern(String text, String pat) {

		int n = text.length();
		int m = pat.length();

		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (pat.charAt(j) != text.charAt(i + j)) {
					break;
				}
			}
			if (j == m) {
				System.out.println(i + " ");
			}
			if (j == 0) {
				i++;
			} else {
				i = i + j;
			}
		}

	}

}

package StringsQuestion;

import java.util.Scanner;

public class NaivepatternSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pat = sc.next();

		if (checkifPresentOrnot(text, pat)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkifPresentOrnot(String text, String pat) {

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
				return true;
			}
			if (j == 0) {
				i++;
			} else {
				i += j;
			}
		}
		return false;
	}

}

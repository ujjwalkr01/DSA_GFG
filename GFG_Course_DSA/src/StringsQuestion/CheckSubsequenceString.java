package StringsQuestion;

import java.util.Scanner;

public class CheckSubsequenceString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int n = str.length();

		String s2 = sc.next();
		int m = s2.length();

		if (subsequenceIspresent(str, n, s2, m)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("---------------------------------");
		if (recursionMethod(str, n, s2, m)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	private static boolean recursionMethod(String str, int n, String s2, int m) {

		if (m == 0) {
			return true;
		}
		if (n == 0) {
			return false;
		}

		if (str.charAt(n - 1) == s2.charAt(m - 1)) {
			return recursionMethod(str, n - 1, s2, m - 1);
		} else {
			return recursionMethod(str, n - 1, s2, m);
		}

	}

	private static boolean subsequenceIspresent(String str, int n, String s2, int m) {

		int i = 0, j = 0;
		while (i < n && j < m) {
			if (str.charAt(i) == s2.charAt(j)) {
				j++;
			}

			i++;
		}
		return (j == m);
	}

}

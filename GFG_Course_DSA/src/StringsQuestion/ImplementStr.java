package StringsQuestion;

import java.util.Scanner;

public class ImplementStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String x = sc.next();

		System.out.println(implementStr(s, x));
		System.out.println("-----------------------------");
		System.out.println(OptimisedFunc(s, x));
	}

	private static int OptimisedFunc(String s, String x) {
        	 return s.indexOf(x);
	}

	private static int implementStr(String s, String x) {

		int n = s.length();
		int m = x.length();

		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (x.charAt(j) != s.charAt(i + j)) {
					break;
				}

			}
			if (j == m) {
				return i;
			}
			if (j == 0 || j < m) {
				i++;
			}
		}
		return -1;
	}

}

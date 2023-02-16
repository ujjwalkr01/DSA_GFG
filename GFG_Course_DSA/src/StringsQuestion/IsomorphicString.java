package StringsQuestion;

import java.util.Scanner;

public class IsomorphicString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
///		System.out.println(str1.charAt(0)-'a');

		if (checkMapping(str1, str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("False");
		}
	}

	private static boolean checkMapping(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int countstr1[] = new int[256];

		int countstr2[] = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			if (countstr1[str1.charAt(i)] != countstr2[str2.charAt(i)]) {
				return false;
			}
			countstr1[str1.charAt(i)] = i + 1;
			countstr2[str2.charAt(i)] = i + 1;
		}
		return true;
	}

}

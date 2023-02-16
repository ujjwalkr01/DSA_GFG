package StringsQuestion;

import java.util.Scanner;

public class CheckIfStringRotations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		if (checkSubstringAfterRotation(str1, str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkSubstringAfterRotation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		String s = str1 + str1;

		if (s.indexOf(str2) >= 0) {
			return true;
		} else {
			return false;
		}
	}

}

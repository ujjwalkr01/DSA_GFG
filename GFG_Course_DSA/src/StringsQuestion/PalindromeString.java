package StringsQuestion;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		if (checkPalindrome(str)) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}

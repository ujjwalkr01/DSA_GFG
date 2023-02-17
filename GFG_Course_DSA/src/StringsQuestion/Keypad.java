package StringsQuestion;

import java.util.Scanner;

public class Keypad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();

		System.out.println(keypadPrint(s, n));

	}

	private static String keypadPrint(String s, int n) {

		String str = "";

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);

			if (ch == 'a' || ch == 'b' || ch == 'c') {
				str += "2";
			} else if (ch == 'd' || ch == 'e' || ch == 'f') {
				str += "3";
			} else if (ch == 'g' || ch == 'h' || ch == 'i') {
				str += "4";
			} else if (ch == 'j' || ch == 'k' || ch == 'l') {
				str += "5";
			} else if (ch == 'm' || ch == 'n' || ch == 'o') {
				str += "6";
			} else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
				str += "7";
			} else if (ch == 't' || ch == 'u' || ch == 'v') {
				str += "8";
			} else {
				str += "9";
			}
		}
		return str;
	}

}

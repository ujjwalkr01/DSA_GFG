package StringsQuestion;

import java.util.Scanner;

public class ConvertCharacter {

	public static void main(String args[]) throws Exception {
		// BufferedReader
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(changetheChar(str));
	}

	public static String changetheChar(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				s += Character.toLowerCase(ch);
			} else {
				s += Character.toUpperCase(ch);
			}
		}
       return s;
	}

}

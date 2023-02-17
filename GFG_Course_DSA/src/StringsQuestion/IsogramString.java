package StringsQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class IsogramString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (checkIsogram(str)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	private static boolean checkIsogram(String str) {

		char ch[] = str.toCharArray();
		Arrays.sort(ch);

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				return false;
			}
		}
		return true;
	}

}

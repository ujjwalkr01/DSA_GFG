package StringsQuestion;

import java.util.Scanner;

public class BinaryString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();

		System.out.println(countBinarySubstring(n, str));
	}

	private static int countBinarySubstring(int a, String str) {

		int count = 0;

		for (int i = 0; i < a; i++) {
			if (str.charAt(i) - '0' == 1) {
				count++;
			}
		}
		int res = 0;
		if (count == 0 || count == 1) {
			return res;
		} else {
			res = count * (count - 1) / 2;
		}
		return res;
	}

}

package StringsQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingAnagramStrings {

	static final int CHAR = 256;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		if (checkStringisEqual(s1, s2)) {
			System.out.println("Yes they are same");
		} else {
			System.out.println("No they are not same");
		}
		System.out.println("-----------------------------------");
		if (efficientMethod(s1, s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean efficientMethod(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		int count[] = new int[CHAR];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for (int i = 0; i < CHAR; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}

	private static boolean checkStringisEqual(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char arr1[] = s1.toCharArray();
		Arrays.sort(arr1);
		s1 = new String(arr1);

		char arr2[] = s2.toCharArray();
		Arrays.sort(arr2);
		s2 = new String(arr2);

		return s1.equals(s2);

	}

}

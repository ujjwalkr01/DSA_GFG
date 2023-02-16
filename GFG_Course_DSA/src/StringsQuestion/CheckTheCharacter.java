package StringsQuestion;

import java.util.Scanner;

public class CheckTheCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		checkisLoweCase(s);
		System.out.println();
		checkisDigit(s);
		System.out.println();
		checkisUpperCase(s);
	}

	private static void checkisLoweCase(String s) {

		int countL = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				System.out.print(c + " ");
				countL++;
			}
		}
		System.out.println("total lowercase character is " + countL);
	}

	private static void checkisDigit(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				System.out.print(c + " ");
				count++;
			}
		}
		System.out.println("count of the digit is " + count);
	}

	private static void checkisUpperCase(String s) {
		int countU = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
				countU++;
			}
		}
		System.out.println("count of the upper case: " + countU);
	}

}

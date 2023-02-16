package StringsQuestion;

import java.util.Scanner;

public class PrintEachCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		printString(s);
	}

	private static void printString(String s) {

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c + " " + (int) c); //basically to print the ascii value just u have to typeCast the char to int..
		}
	}

}

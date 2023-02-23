package Recursion_Question;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr = "abbcbbd";
		int start = 0, end = arr.length() - 1;

		System.out.println(palindromeCheck(arr, start, end));
		System.out.println("________________________________________");

		System.out.println(alternateMethod(arr, start, end));
	}
	
	private static boolean alternateMethod(String arr, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (arr.charAt(start) != arr.charAt(end)) {
			return false;
		}
		return alternateMethod(arr, start + 1, end - 1);
	}

	private static boolean palindromeCheck(String arr, int start, int end) {

		if (start >= end)
			return true;
		return (arr.charAt(start) == arr.charAt(end) && palindromeCheck(arr, start + 1, end - 1));
	}

}

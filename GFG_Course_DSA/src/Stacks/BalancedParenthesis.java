package Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (checkEqualParenthesis(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkEqualParenthesis(String str) {

		ArrayDeque<Character> s = new ArrayDeque<>();

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				s.push(x);
			} else {
				if (s.isEmpty()) {
					return false;
				} else if (matching(s.peek(), x) == false) {
					return false;
				} else {
					s.pop();
				}
			}
		}

		return (s.isEmpty() == true);
	}

	private static boolean matching(char a, char b) {

		return (a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}');
	}

}

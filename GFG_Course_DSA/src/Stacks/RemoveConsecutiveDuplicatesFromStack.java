package Stacks;

import java.util.Stack;

public class RemoveConsecutiveDuplicatesFromStack {

	public static void main(String[] args) {

		String str = "aaaaaabaabccccccc";
		System.out.println(removeDuplicates(str));
		System.out.println(removeDuplicatesMethod2(str));
	}

	private static String removeDuplicatesMethod2(String str) {

		Stack<Character> s = new Stack<>();
		int n = str.length();
		String ans = "";
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (!s.isEmpty() && s.peek() == c)
				continue;
			else {
				s.push(c);
				ans = ans + c;
			}
		}
		return ans;
	}

	private static String removeDuplicates(String str) {

		Stack<Character> s = new Stack<>();

		s.push(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				s.push(str.charAt(i));
			} else {
				continue;
			}
		}
		// System.out.println(s);
		String bag = "";
		for (int i = 0; i < s.size(); i++) {
			bag += s.get(i);
		}
		return bag;
	}

}

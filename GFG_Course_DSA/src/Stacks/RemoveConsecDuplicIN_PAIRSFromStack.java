package Stacks;

import java.util.Stack;

public class RemoveConsecDuplicIN_PAIRSFromStack {

	public static void main(String[] args) {

		String str = "aaaa";
		System.out.println(removeDuplicates(str));
	}

	private static String removeDuplicates(String str) {

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (!s.isEmpty() && s.peek() == str.charAt(i)) {
				s.pop();
			} else {
				s.push(str.charAt(i));
			}
		}
		System.out.println(s);
		String bag = "";

		for (int j = 0; j < s.size(); j++) {
			bag += s.get(j);
		}
//		if (!s.isEmpty() || s.get(j) != s.get(j - 1)) {
//			bag += s.get(j);
//		}
		return bag;
	}

}

package Stacks;

import java.util.Stack;

public class PreviousGreater_problem {

	public static void main(String[] args) {

		int arr[] = new int[] { 15, 10, 18, 12, 4, 6, 2, 8 };

		checkForClosestPreviousGreater(arr);
	}

	private static void checkForClosestPreviousGreater(int[] arr) {

		Stack<Integer> s = new Stack<>();

		s.push(arr[0]);
		System.out.print("-1 ");

		for (int i = 1; i < arr.length; i++) {

			while (s.isEmpty() == false && s.peek() <= arr[i]) {
				s.pop();
			}

			// int prevGreater= s.isEmpty()?-1:s.peek();
			if (s.isEmpty() == false) {
				System.out.print(s.peek() + " ");
			} else {
				System.out.print("-1 ");
			}

			s.push(arr[i]);
		}
	}

}

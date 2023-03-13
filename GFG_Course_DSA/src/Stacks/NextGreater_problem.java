package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater_problem {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };

		checkForClosestNextGreater(arr);
	}

	private static void checkForClosestNextGreater(int[] arr) {

		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();

		s.push(arr[arr.length - 1]);
		list.add(-1);
		// System.out.print("-1 ");

		for (int i = arr.length - 2; i >= 0; i--) {

			while (s.isEmpty() == false && s.peek() <= arr[i]) {
				s.pop();
			}

			// int prevGreater= s.isEmpty()?-1:s.peek();
			if (s.isEmpty() == false) {
				list.add(s.peek());
				System.out.print(s.peek() + " ");
			} else {
				list.add(-1);
				System.out.print("-1 ");
			}

			s.push(arr[i]);
		}

		System.out.println();
		Collections.reverse(list);
		System.out.println(list);

	}

}

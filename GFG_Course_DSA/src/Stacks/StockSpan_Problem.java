package Stacks;

import java.util.Stack;

public class StockSpan_Problem {

	public static void main(String[] args) {

		int arr[] = new int[] { 60, 20, 10, 15, 35, 50 };

		checkForStockSpan(arr);
	}

	private static void checkForStockSpan(int[] arr) {

		Stack<Integer> s = new Stack<>();

		s.push(0);
		System.out.print("1 ");

		for (int i = 1; i < arr.length; i++) {
			while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
				s.pop();
			}
			int span = s.isEmpty() ? i + 1 : i - s.peek();
			System.out.print(span + " ");
			s.push(i);
		}
	}

}

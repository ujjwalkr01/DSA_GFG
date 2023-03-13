package Stacks;

import java.util.Stack;

public class LongestAreaofRecatangle_InHistogram {

	public static void main(String[] args) {

		int arr[] = new int[] { 6, 2, 5, 4, 1, 5, 6 };

		int res = checkLongestArea(arr);
		System.out.println(res);
	}

	private static int checkLongestArea(int[] arr) {

		Stack<Integer> s = new Stack<>();
		int res = 0, n = arr.length;
//finding the previous smaller element 
		for (int i = 0; i < n; i++) {

			while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
				int val = s.pop();
				int curr = arr[val] * (s.isEmpty() ? i : (i - s.peek() - 1));
				res = Math.max(res, curr);
			}
			s.push(i);
		}
//removing the element left in the stack
		while (s.isEmpty() == false) {
			int val = s.pop();
			int curr = arr[val] * (s.isEmpty() ? n : (n - s.peek() - 1));
			res = Math.max(res, curr);
		}
		return res;
	}

}

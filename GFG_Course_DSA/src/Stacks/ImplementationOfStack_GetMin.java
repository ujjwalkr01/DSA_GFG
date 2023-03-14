package Stacks;

import java.util.Stack;

class GetMin {

	Stack<Integer> ms = new Stack<>();
	Stack<Integer> as = new Stack<>();

	void push(int x) {
		if (ms.isEmpty()) {
			ms.push(x);
			as.add(x);
			return;
		}
 //add method also do the same inserting process for the stack
		ms.add(x);
		if (ms.peek() <= as.peek()) {
			as.push(x);
		}
	}

	void pop() {
		if (as.peek() == ms.peek()) {
			as.pop();
		}
		ms.pop();
	}

	int top() {
		return ms.peek();
	}

	int getMin() {
		return as.peek();
	}
}

public class ImplementationOfStack_GetMin {

	public static void main(String[] args) {

		GetMin s = new GetMin();
		s.push(4);
		s.push(5);
		s.push(8);
		s.push(1);
		s.pop();

		System.out.print(" Minimum Element from Stack: " + s.getMin());
	}

}

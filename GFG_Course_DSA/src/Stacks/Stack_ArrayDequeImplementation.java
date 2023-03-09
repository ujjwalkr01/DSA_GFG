package Stacks;

import java.util.ArrayDeque;
import java.util.Stack;

public class Stack_ArrayDequeImplementation {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(40);
		stack.push(20);
		stack.push(50);

		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println("--------------------------");

		ArrayDeque<Integer> s = new ArrayDeque<>();

		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}

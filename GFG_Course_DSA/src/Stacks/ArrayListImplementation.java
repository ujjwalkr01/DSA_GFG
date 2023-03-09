package Stacks;

import java.util.ArrayList;

class MyStack {

	ArrayList<Integer> list = new ArrayList<>();

	void push(int x) {

		list.add(x);
	}

	int pop() {

		int res = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return res;
	}

	int peek() {

		return list.get(list.size() - 1);
	}

	int size() {

		return list.size();
	}

	boolean isEmpty() {

		return list.isEmpty();
	}
}

public class ArrayListImplementation {

	public static void main(String[] args) {

		MyStack s = new MyStack();
		s.push(10);
		s.push(20);

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

}

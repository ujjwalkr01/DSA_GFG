package Stacks;

class ArrayImplementation {

	int cap;
	int top;
	int arr[];

	public ArrayImplementation(int c) {
		this.cap = c;
		top = -1;
		arr = new int[cap];
	}

	void push(int x) {
		if (top == cap - 1) {
			System.out.println("Stack is full!");
		}

		top++;
		arr[top] = x;
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack is empty!");
		}
		int res = arr[top];
		top--;
		return res;
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack is empty!");
		}
		return arr[top];
	}

	int size() {
		return (top + 1);
	}

	boolean isEmpty() {
		return (top == -1);
	}
}

public class IntroductionOFStack {

	public static void main(String[] args) {

		ArrayImplementation s = new ArrayImplementation(5);
		s.push(10);
		s.push(20);

		System.out.println(s.pop());
		s.push(30);
		System.out.println(s.peek());
	}

}

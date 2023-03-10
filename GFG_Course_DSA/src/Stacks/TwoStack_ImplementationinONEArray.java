package Stacks;

import java.util.ArrayList;
import java.util.Scanner;

class TwoStack {

	int arr[];
	int cap, top1, top2;

	public TwoStack(int n) {
		this.cap = n;
		top1 = -1;
		top2 = cap;
		arr = new int[n];
	}

	void push1(int x) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	void push2(int x) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	int pop1() {
		if (top1 >= 0) {
			int res = arr[top1];
			top1--;
			return res;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return 0;
	}

	int pop2() {
		if (top2 < cap) {
			int res = arr[top2];
			top2++;
			return res;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		return 0;
	}

	int peek1() {
		return arr[top1];
	}

	int peek2() {
		return arr[top2];
	}

	int size1() {
		return top1++;
	}

	int size2() {
		return top2--;
	}

	boolean isEmpty() {
		return (top1 == -1 && top2 == cap);
	}
}

public class TwoStack_ImplementationinONEArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		TwoStack s = new TwoStack(n);
		s.push1(10);
		s.push2(50);
		s.push1(20);
		s.push2(40);
		s.push1(30);

		System.out.println(s.pop1());
		System.out.println(s.peek2());
		System.out.println(s.isEmpty());
	}

}

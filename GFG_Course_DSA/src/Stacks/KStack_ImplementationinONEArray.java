package Stacks;

import java.util.Scanner;

class Kstack {

	int arr[], next[], top[];
	int k, freetop, cap;

	public Kstack(int k1, int n) {
		k = k1;
		cap = n;
		arr = new int[n];
		next = new int[cap];
		top = new int[k];

		for (int i = 0; i < k; i++) {
			top[i] = -1;
		}
		freetop = 0;

		for (int i = 0; i < cap - 1; i++) {
			next[i] = i + 1;
		}
		next[cap - 1] = -1;
	}

	boolean isFull() {
		return (freetop == -1);
	}

	boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}

	void push(int x, int sn) {

		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		int i = freetop;
		freetop = next[i];
		next[i] = top[sn];
		top[sn] = i;
		arr[i] = x;
	}

	int pop(int sn) {

		if (isFull()) {
			System.out.println("Stack Overflow");
			return Integer.MAX_VALUE;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = freetop;
		freetop = i;

		return arr[i];
	}

}

public class KStack_ImplementationinONEArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		Kstack s = new Kstack(k, n);
		s.push(15, 2);
		s.push(45, 2);

		s.push(17, 1);
		s.push(49, 1);
		s.push(39, 1);

		s.push(11, 0);
		s.push(9, 0);
		s.push(7, 0);

		System.out.println("Popped element from stack 2 is " + s.pop(2));
		System.out.println("Popped element from stack 1 is " + s.pop(1));
		System.out.println("Popped element from stack 0 is " + s.pop(0));
	}

}

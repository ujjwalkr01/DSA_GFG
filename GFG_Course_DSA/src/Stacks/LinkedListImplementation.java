package Stacks;

import java.util.ArrayList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class MyStack1 {

	Node head;
	int size;

	public MyStack1() {
		head = null;
		size = 0;
	}

	void push(int x) {
		Node temp = new Node(x);

		temp.next = head;
		head = temp;
		size++;
	}

	int pop() {

		if (head == null) {
			System.out.println("Stack is empty!");
			return -1;
		}

		int res = head.data;
		head = head.next;
		size--;
		return res;
	}

	int peek() {
		if (head == null) {
			return -1;
		}
		return head.data;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return (head == null);
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {

		MyStack1 s = new MyStack1();
		s.push(10);
		s.push(20);

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

}

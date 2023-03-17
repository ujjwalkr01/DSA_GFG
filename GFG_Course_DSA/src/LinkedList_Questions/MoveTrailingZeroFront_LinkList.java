package LinkedList_Questions;

import java.util.Arrays;
import java.util.Stack;

class Node9 {
	int data;
	Node9 next;

	public Node9(int data) {
		this.data = data;
		next = null;
	}
}

public class MoveTrailingZeroFront_LinkList {

	public static void main(String[] args) {
// 0 1 0 1 2 0 5 0 4 0
		// 0 0 0 0 0 1 1 2 5 4
		Node9 head = new Node9(0);
		head.next = new Node9(1);
		head.next.next = new Node9(0);
		head.next.next.next = new Node9(1);
		head.next.next.next.next = new Node9(2);
		head.next.next.next.next.next = new Node9(0);
		head.next.next.next.next.next.next = new Node9(5);
		head.next.next.next.next.next.next.next = new Node9(0);
		head.next.next.next.next.next.next.next.next = new Node9(4);
		head.next.next.next.next.next.next.next.next.next = new Node9(0);

		printHead(head);
		MoveTrailingZero(head);
	}

	private static void MoveTrailingZero(Node9 head) {

		Node9 temp = new Node9(-1);
		Node9 temp1=new Node9(-1);

		Node9 curr = head, ptr = temp, ptr1=temp1;

		while (curr != null) {
			if (curr.data == 0) {
				ptr.next = curr;
				ptr = ptr.next;				
			}else {
				ptr1.next=curr;
				ptr1=ptr1.next;
			}

			curr = curr.next;
		}

		ptr1.next=null;
		ptr.next=temp1.next;
		
		System.out.println();

		printHead(temp.next);
	}

	private static void printHead(Node9 head) {

		Node9 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
//	if (head == null) {
//
//		return;
//
//		Node current = head;
//
//		Node previous = null;
//
//		while (current != null) {
//
//		if (current.value == 0) {
//
//		if (previous != null) {
//
//		previous.next = current.next;
//
//		current.next = head;
//
//		head = current;
//
//		current = previous.next;
//
//		} else {
//
//		current = current.next;
//
//		}
//
//		} else {
//
//		previous = current;
//
//		current = current.next;
//
//		}

}

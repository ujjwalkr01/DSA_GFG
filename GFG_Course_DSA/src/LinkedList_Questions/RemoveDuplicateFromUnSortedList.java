package LinkedList_Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Node6 {
	int data;
	Node6 next;

	public Node6(int data) {
		this.data = data;
		next = null;
	}
}

public class RemoveDuplicateFromUnSortedList {

	public static void main(String[] args) {

		Node6 head = new Node6(30);
		head.next = new Node6(40);
		head.next.next = new Node6(50);
		head.next.next.next = new Node6(50);
		head.next.next.next.next = new Node6(30);
		head.next.next.next.next.next = new Node6(60);

		printList(head);
		System.out.println("After removing the duplicate element in an Unsorted List");
		head = removeDuplicate(head);
		printList(head);
	}

	private static Node6 removeDuplicate(Node6 head) {

		HashSet<Integer> set = new HashSet<>();

		Node6 curr = head;

		while (curr.next != null) {
			set.add(curr.data);
			if (set.contains(curr.next.data)) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return head;

	}

	private static void printList(Node6 head) {

		Node6 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

package LinkedList_Questions;

class Node2 {
	int data;
	Node2 next;

	public Node2(int x) {
		this.data = x;
		next = null;
	}
}

public class RecursiveFunc_DisplayList {

	public static void main(String[] args) {

		Node2 head = new Node2(10);
		head.next = new Node2(20);
		head.next.next = new Node2(30);
		head.next.next.next = new Node2(40);

		printList(head);
	}

	private static void printList(Node2 head) {

		if (head == null) {
			return;
		}
		System.out.println(head.data);
		printList(head.next);
	}

}

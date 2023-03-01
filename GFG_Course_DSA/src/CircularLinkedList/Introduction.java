package CircularLinkedList;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class Introduction {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(30);
		head.next.next = new Node(20);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head;

		printList(head);

	}

	private static void printList(Node head) {

		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

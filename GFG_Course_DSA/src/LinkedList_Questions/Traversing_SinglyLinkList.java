package LinkedList_Questions;

class Node1 {
	int data;
	Node1 next;

	public Node1(int x) {
		this.data = x;
		next = null;
	}
}

public class Traversing_SinglyLinkList {

	public static void main(String[] args) {

		Node1 head = new Node1(10);
		head.next = new Node1(20);
		head.next.next = new Node1(30);
		head.next.next.next = new Node1(40);
		printHead(head);

	}

	private static void printHead(Node1 head) {

		Node1 current = head;
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

}

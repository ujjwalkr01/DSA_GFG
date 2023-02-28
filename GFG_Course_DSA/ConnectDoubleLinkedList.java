package LinkedList_DoublyLinkList;

class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

public class ConnectDoubleLinkedList {

	public static void main(String[] args) {

		Node head = new Node(10);
		Node temp = new Node(20);
		Node temp1 = new Node(30);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp1;

		System.out.println("Connecting the element");
		printList(head);
	}

	private static void printList(Node head) {

		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}

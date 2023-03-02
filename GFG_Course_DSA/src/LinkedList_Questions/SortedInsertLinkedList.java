package LinkedList_Questions;

class Node0 {
	int data;
	Node0 next;

	public Node0(int data) {
		this.data = data;
		next = null;
	}
}

public class SortedInsertLinkedList {

	public static void main(String[] args) {

		Node0 head = new Node0(10);
		head.next = new Node0(20);
		head.next.next = new Node0(30);
		head.next.next.next = new Node0(40);

		printList(head);
		System.out.println("-------------------------");
		System.out.println("After inserting the element in the correct position");
		int data = 15;
		head = insertInplace(head, data);
		printList(head);
	}

	private static Node0 insertInplace(Node0 head, int data) {
		Node0 temp = new Node0(data);
		if (head == null) {
			return temp;
		}
		if (temp.data <= head.data) {
			temp.next = head;
			return temp;
		}
		Node0 curr = head;
		while (curr.next != null && curr.next.data <= temp.data) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	private static void printList(Node0 head) {

		Node0 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

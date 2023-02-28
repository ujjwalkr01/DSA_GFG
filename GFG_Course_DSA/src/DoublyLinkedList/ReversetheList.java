package DoublyLinkedList;

class Node2 {
	int data;
	Node2 prev;
	Node2 next;

	public Node2(int data) {
		this.data = data;
		prev = next = null;
	}
}

public class ReversetheList {

	public static void main(String[] args) {

		Node2 head = new Node2(10);
		Node2 temp = new Node2(20);
		Node2 temp1 = new Node2(40);
		Node2 temp2 = new Node2(35);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;

		printList(head);
		System.out.println("After reversing the list");

		head = reverseList(head);
		printList(head);
	}

	private static Node2 reverseList(Node2 head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node2 curr = head;
		Node2 temp = null;
		while (curr != null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
	}

	private static void printList(Node2 head) {

		Node2 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

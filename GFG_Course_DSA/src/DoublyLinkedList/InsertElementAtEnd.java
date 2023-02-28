package DoublyLinkedList;

class Node1 {
	int data;
	Node1 prev;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		prev = next = null;
	}
}

public class InsertElementAtEnd {

	public static void main(String[] args) {

		Node1 head = new Node1(10);
		head.next = new Node1(20);
		head.next.next = new Node1(40);
		head.next.next.next = new Node1(35);
		printList(head);
		System.out.println("After inserting element at end ");
		int ele = 5;
		head = insertElementAtEnd(head, ele);
		printList(head);
	}

	private static Node1 insertElementAtEnd(Node1 head, int data) {

		Node1 temp = new Node1(data);

		if (head == null) {
			return temp;
		}
		Node1 curr = head;

		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;

		return head;
	}

	private static void printList(Node1 head) {

		Node1 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

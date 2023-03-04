package LinkedList_Questions;

class Node7 {
	int data;
	Node7 next;

	public Node7(int data) {
		this.data = data;
		next = null;
	}
}

public class DeleteNodeWithoutHead {

	public static void main(String[] args) {

		Node7 head = new Node7(10);
		head.next = new Node7(20);
		head.next.next = new Node7(30);
		head.next.next.next = new Node7(40);

		printList(head);
		System.out.println("After deleting the specific node");
		deleteNode(head.next.next);
		printList(head);
	}

	private static void deleteNode(Node7 ptr) {
		if (ptr.next == null) {
			return;
		}
		ptr.data = ptr.next.data;
		ptr.next = ptr.next.next;
	}

	private static void printList(Node7 head) {

		Node7 ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}

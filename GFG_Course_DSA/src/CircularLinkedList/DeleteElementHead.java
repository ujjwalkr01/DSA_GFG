package CircularLinkedList;

class Node3 {
	int data;
	Node3 next;

	public Node3(int data) {
		this.data = data;
		next = null;
	}
}

public class DeleteElementHead {

	public static void main(String[] args) {

		Node3 head = new Node3(10);
		head.next = new Node3(30);
		head.next.next = new Node3(20);
		head.next.next.next = new Node3(40);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("After deleting the element head");

//		head = delHeadElement(head);
//		printList(head);
		System.out.println("------------------------");
		head = efficientSol(head);
		printList(head);
		
	}

	private static Node3 efficientSol(Node3 head) {

		if (head == null || head.next == head) {
			return null;
		} else {
			head.data = head.next.data;
			head.next = head.next.next;
		}

		return head;
	}

	private static Node3 delHeadElement(Node3 head) {
		if (head == null || head.next == head) {
			return null;
		} else {
			Node3 curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			head = head.next;
			curr.next = head;
		}
		return head;
	}

	private static void printList(Node3 head) {

		Node3 curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);

	}

}

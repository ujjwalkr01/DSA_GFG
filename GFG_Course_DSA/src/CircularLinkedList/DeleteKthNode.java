package CircularLinkedList;

class Nodess {
	int data;
	Nodess next;

	public Nodess(int data) {
		this.data = data;
		next = null;
	}
}

public class DeleteKthNode {

	public static void main(String[] args) {

		Nodess head = new Nodess(10);
		head.next = new Nodess(30);
		head.next.next = new Nodess(20);
		head.next.next.next = new Nodess(40);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("After deleting kth element");
		int k = 1;
		head = delHeadElement(head, k);
		printList(head);
//		System.out.println("------------------------");
//		head = efficientSol(head);
//		printList(head);

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

	private static Nodess delHeadElement(Nodess head, int k) {
		if (head == null || head.next == head) {
			return null;
		}
		if (k == 1) {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
		Nodess curr = head;
		for (int i = 1; i < k - 1; i++) {
			curr = curr.next;
		}

			curr.next = curr.next.next;

		return head;
	}

	private static void printList(Nodess head) {

		Nodess curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);

	}

}

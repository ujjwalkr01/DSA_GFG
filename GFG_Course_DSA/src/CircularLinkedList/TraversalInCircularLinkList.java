package CircularLinkedList;

class Nodes {
	int data;
	Nodes next;

	public Nodes(int data) {
		this.data = data;
		next = null;
	}
}

public class TraversalInCircularLinkList {

	public static void main(String[] args) {

		Nodes head = new Nodes(10);
		head.next = new Nodes(30);
		head.next.next = new Nodes(20);
		head.next.next.next = new Nodes(40);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("-----------------------");
		alternateMethod(head);
	}

	private static void alternateMethod(Nodes head) {

		if (head == null) {
			return;
		}
		Nodes curr = head;
		do {
			System.out.print(curr.data+" ");
			curr = curr.next;
		} while (curr != head);
	}

	private static void printList(Nodes head) {

		Nodes curr = head;
		while (curr.next != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(curr.data + " ");
	}

}

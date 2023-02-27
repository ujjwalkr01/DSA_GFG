package LinkedList_Questions;

class Nodes {
	int data;
	Nodes next;

	public Nodes(int x) {
		this.data = x;
		next = null;
	}
}

public class DeleteFirstNode {

	public static void main(String[] args) {

		Nodes head = new Nodes(10);
		head.next = new Nodes(30);
		head.next.next = new Nodes(20);
		printList(head);
		head = deleteFirstNode(head);
		System.out.println("After deleting");
		printList(head);

	}

	private static Nodes deleteFirstNode(Nodes head) {

		if (head == null) {
			return null;
		}
		return head.next;
	}

	public static void printList(Nodes head) {
		Nodes curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}

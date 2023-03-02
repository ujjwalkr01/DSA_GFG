package CircularLinkedList;

class Node2 {
	int data;
	Node2 next;

	public Node2(int data) {
		this.data = data;
		next = null;
	}
}

public class InsertElementAtEnd {

	public static void main(String[] args) {

		Node2 head = new Node2(10);
		head.next = new Node2(30);
		head.next.next = new Node2(20);
		head.next.next.next = new Node2(40);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("After inserting the element at end");
		int data = 15;
//		head = insertElement(head, data);
//		printList(head);
		System.out.println("-------------------");
		head = efficientSolu(head, data);
		printList(head);

	}

	private static Node2 efficientSolu(Node2 head, int data) {

		Node2 temp = new Node2(data);
		if (head == null) {
			temp.next = temp;
			return temp;
		} else {
			temp.next = head.next;
			head.next = temp;
			int t = temp.data;
			temp.data = head.data;
			head.data = t;
		}
		return temp;
	}

	private static Node2 insertElement(Node2 head, int data) {
		Node2 temp = new Node2(data);
		if (head == null) {
			temp.next = temp;
			return temp;
		}
		Node2 curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}

		curr.next = temp;
		temp.next = head;

		System.out.println(curr.data);
		return head;
	}

	private static void printList(Node2 head) {

		Node2 curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);

	}

}

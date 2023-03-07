package DoublyLinkedList;

class Nod {
	int data;
	Nod prev;
	Nod next;

	public Nod(int data) {
		this.data = data;
		prev = next = null;
	}
}

public class InsertElementAtanyPos {

	public static void main(String[] args) {

		Nod head = new Nod(10);
		head.next = new Nod(20);
		head.next.next = new Nod(30);
		// head.next.next.next = new Nod(40);

		head.next.prev = head;
		head.next.next.prev = head.next;
		// head.next.next.next.prev = head.next.next;
		printList(head);
		System.out.println("After inserting the element at any position");
		int x = 6, pos = 0;
		head = insertELement(head, pos, x);
		printList(head);
	}

	private static Nod insertELement(Nod head, int pos, int data) {

		Nod temp = new Nod(data);

		Nod curr = head;
		for (int i = 0; i < pos && curr != null; i++) {
			curr = curr.next;
		}
		if (curr.next == null) {
			curr.next = temp;
			temp.next = null;
			temp.prev = curr;
		} else {
			temp.next = curr.next;
			curr.next.prev = temp;			
			curr.next = temp;
			temp.prev = curr;
		}

		return head;
	}

	private static void printList(Nod head) {

		Nod curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

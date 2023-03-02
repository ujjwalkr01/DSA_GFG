package LinkedList_Questions;

class Nodes6 {
	int data;
	Nodes6 next;

	public Nodes6(int data) {
		this.data = data;
		next = null;
	}
}

public class RemoveDuplicateFromSortedList {

	public static void main(String[] args) {

		Nodes6 head = new Nodes6(10);
		head.next = new Nodes6(20);
		head.next.next = new Nodes6(20);
		head.next.next.next = new Nodes6(30);
		head.next.next.next.next = new Nodes6(30);
		head.next.next.next.next.next = new Nodes6(30);

		printList(head);
		System.out.println("After removing the duplicate element");
		removeDuplicate(head);
		printList(head);
	}

	private static void removeDuplicate(Nodes6 head) {

		if (head == null) {
			System.out.println(head.data);
			return;
		}
		Nodes6 curr = head;
		while (curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
	}

	private static void printList(Nodes6 head) {

		Nodes6 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

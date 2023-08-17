package LinkedList;

class Node5 {
	int data;
	Node5 next;

	Node5(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {

		Node5 head1 = new Node5(5);
		head1.next = new Node5(10);
		head1.next.next = new Node5(15);
		head1.next.next.next = new Node5(40);
		head1.next.next.next.next = new Node5(60);

		Node5 head2 = new Node5(2);
		head2.next = new Node5(3);
		head2.next.next = new Node5(10);
		head2.next.next.next = new Node5(20);
//		head2.next.next.next.next = new Node5(60);

		Node5 head = mergeTwoLinkedList(head1, head2);

		printNode(head);
	}

	private static Node5 mergeTwoLinkedList(Node5 head1, Node5 head2) {

		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		Node5 head = null, tail = null;

		if (head1.data <= head2.data) {
			head = tail = head1;
			head1 = head1.next;
		} else {
			head = tail = head2;
			head2 = head2.next;
		}

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
		}

		if (head1 == null) {
			tail.next = head2;
		} else {
			tail.next = head1;
		}

		return head;
	}

	private static void printNode(Node5 head) {

		Node5 curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}

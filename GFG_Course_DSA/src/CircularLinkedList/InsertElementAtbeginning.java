package CircularLinkedList;

class Node1 {
	int data;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		next = null;
	}
}

public class InsertElementAtbeginning {

	public static void main(String[] args) {

		Node1 head = new Node1(10);
		head.next = new Node1(30);
		head.next.next = new Node1(20);
		head.next.next.next = new Node1(40);
		head.next.next.next.next = head;

		printList(head);
		System.out.println("After inserting the element at beginning");
		int ele = 15;
//		head = insertElementAtBegin(head, ele);
//		printList(head);
		System.out.println("----------------------------------");
		// efficient Solution
		head = efficientSolution(head, ele);
		printList(head);

	}

	private static Node1 efficientSolution(Node1 head, int data) {
		Node1 temp = new Node1(data);
		if (head == null) {
			temp.next = temp;
			return temp;
		} else {
			temp.next = head.next;
			head.next = temp;

			int t = head.data;
			head.data = temp.data;
			temp.data = t;
		}
		return head;
	}

	private static Node1 insertElementAtBegin(Node1 head, int data) {

		Node1 temp = new Node1(data);

		if (head == null) {
			return temp;
		}
		Node1 curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.next = head;

		return temp;
	}

	private static void printList(Node1 head) {

		Node1 curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);

	}

}

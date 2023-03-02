package LinkedList_Questions;

class Nodes0 {
	int data;
	Nodes0 next;

	public Nodes0(int data) {
		this.data = data;
		next = null;
	}
}

public class MiddleOfLinkedList {

	public static void main(String[] args) {

		Nodes0 head = new Nodes0(10);
		head.next = new Nodes0(20);
		head.next.next = new Nodes0(30);
		head.next.next.next = new Nodes0(40);
		head.next.next.next.next = new Nodes0(50);
		head.next.next.next.next.next = new Nodes0(60);

		printhead(head);
		System.out.println("The middle element is ");
		findtheMidElement(head);
		System.out.println("-------------------------------");
		efficientSol(head);

	}

	private static void efficientSol(Nodes0 head) {

		if (head == null) {
			return;
		}
		Nodes0 slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println(slow.data);
	}

	private static void findtheMidElement(Nodes0 head) {

		if (head == null) {
			return;
		}
		int pos = 0;
		Nodes0 curr = head;
		while (curr != null) {
			pos++;
			curr = curr.next;
		}
		Nodes0 obj = head;
		int mid = (pos / 2) + 1;
		for (int i = 1; i < mid; i++) {
			obj = obj.next;
		}
		System.out.println(obj.data);
	}

	private static void printhead(Nodes0 head) {

		Nodes0 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

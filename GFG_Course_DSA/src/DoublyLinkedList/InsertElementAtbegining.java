package DoublyLinkedList;

class Nodes {
	int data;
	Nodes prev;
	Nodes next;

	public Nodes(int data) {
		this.data = data;
		prev = next = null;
	}
}

public class InsertElementAtbegining {

	public static void main(String[] args) {

		Nodes head = new Nodes(10);
		head.next = new Nodes(20);
		head.next.next = new Nodes(40);
		head.next.next.next = new Nodes(35);
		
		head.next.prev = head;
		head.next.next.prev = head.next;
		head.next.next.next.prev = head.next.next;
		
		printList(head);
		System.out.println("After inserting ");
		int ele = 5;
		head = insertElement(head, ele);
		printList(head);
	}

	private static Nodes insertElement(Nodes head, int data) {

		Nodes temp = new Nodes(data);
		temp.next = head;
		
		if (head != null) {
			head.prev = temp;
		}
		
		return temp;
	}

	private static void printList(Nodes head) {

		Nodes curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

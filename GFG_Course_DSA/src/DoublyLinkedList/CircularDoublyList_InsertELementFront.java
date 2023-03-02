package CircularLinkedList;

class Nodess1 {
	int data;
	Nodess1 next;
	Nodess1 prev;

	public Nodess1(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class CircularDoublyList_InsertELementFront {

	public static void main(String[] args) {

		Nodess1 head = new Nodess1(10);
		Nodess1 temp = new Nodess1(20);
		Nodess1 temp1 = new Nodess1(30);
		Nodess1 temp2 = new Nodess1(40);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;
		temp2.next = head;
		head.prev = temp2;

		printList(head);
		System.out.println("---------------------");
		System.out.println("After inserting the element in the front");
		int ele = 15;
		head = insertAtfront(head, ele);
		printList(head);
		System.out.println("---------------------");
		System.out.println("After inserting the element at the end");
		int el = 15;
		head = insertAtend(head, el);
		printList(head);

	}

	private static Nodess1 insertAtend(Nodess1 head, int data) {

		Nodess1 obj = new Nodess1(data);
		if (head == null) {
			obj.next = obj;
			obj.prev = obj;
			return obj;
		}
		obj.prev = head.prev.next;
		head.prev.next = obj;
		obj.next = head;
		head.prev = obj;

		return head;
	}

	private static Nodess1 insertAtfront(Nodess1 head, int data) {
		Nodess1 obj = new Nodess1(data);
		if (head == null) {
			obj.next = obj;
			obj.prev = obj;
			return obj;
		}
		obj.next = head;
		obj.prev = head.prev;
		head.prev.next = obj;
		head.prev = obj;
//         System.out.println(head.prev.data);
		return obj;
	}

	private static void printList(Nodess1 head) {

		Nodess1 curr = head;
		do {
			System.out.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
	}

}

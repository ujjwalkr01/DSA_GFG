package LinkedList_Questions;

class Node4 {
	int data;
	Node4 next;

	public Node4(int x) {
		this.data = x;
		next = null;
	}
}

class LinkedList1 {
	Node4 head;

	public void insertAtEnd(int data) {
		Node4 temp = new Node4(data);
		if (head == null) {
			head = temp;
			return;
		}

		Node4 curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;

	}

	public void printList() {
		Node4 curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}

public class InsertElementAtEnd {

	public static void main(String[] args) {

		LinkedList1 list = new LinkedList1();
		// Node4 head=null;
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		int x = 50;
		list.insertAtEnd(x);
		System.out.println("After Inserting");
		list.printList();
	}

}

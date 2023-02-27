package LinkedList_Questions;

class Node3 {
	int data;
	Node3 next;

	public Node3(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node3 head;

	public void insertAtBegin(int data) {
		Node3 temp = new Node3(data);
		temp.next = head;
		head = temp;
	}

	public void printList() {
		Node3 curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}

public class InsertElementAtBegining {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insertAtBegin(10);
		list.insertAtBegin(20);
		list.insertAtBegin(30);
		list.insertAtBegin(40);
		list.insertAtBegin(50);
		int x=5;
		list.insertAtBegin(x);
		System.out.println("After printing list");
		list.printList();

	}

}

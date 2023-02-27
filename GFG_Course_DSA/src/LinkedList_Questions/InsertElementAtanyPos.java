package LinkedList_Questions;

class Node5 {
	int data;
	Node5 next;

	public Node5(int data) {
		this.data = data;
		next = null;
	}
}

class LinkedLists {

	public Node5 insertElement(Node5 head, int data, int pos) {
		Node5 temp = new Node5(data);
		if (pos == 1) {
			temp.next = head;
			return temp;
		}
		Node5 curr = head;
		for (int i = 1; i <= pos - 2 && curr != null; i++) {
			curr = curr.next;
		}
		if (curr == null) {
			return temp;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}

	public void printList(Node5 head) {
		Node5 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

public class InsertElementAtanyPos {

	public static void main(String[] args) {

		Node5 head = new Node5(10);
		head.next = new Node5(30);
		head.next.next = new Node5(20);

		LinkedLists list = new LinkedLists();
		list.printList(head);
		System.out.println("After inserting");
		head = list.insertElement(head, 25, 2);
		list.printList(head);
	}

}

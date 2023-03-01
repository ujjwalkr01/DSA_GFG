package DoublyLinkedList;

class Node4 {
	int data;
	Node4 prev;
	Node4 next;

	public Node4(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DeleteLastNodeOfList {

	public static void main(String[] args) {

		Node4 head = new Node4(10);
		Node4 temp = new Node4(20);
		Node4 temp1 = new Node4(40);
		Node4 temp2 = new Node4(30);

		head.next = temp;
		temp.prev = head;
		temp.next = temp1;
		temp1.prev = temp;
		temp1.next = temp2;
		temp2.prev = temp1;

		printList(head);
		System.out.println("After removing the last node");
		head = deleteHeadNode(head);
		printList(head);
	}

	private static Node4 deleteHeadNode(Node4 head) {

		if (head == null || head.next == null) {
			return null;
		}
		Node4 curr = head;
		
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;

		return head;
	}

	private static void printList(Node4 head) {

		Node4 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

package DoublyLinkedList;

class Node3 {
	int data;
	Node3 prev;
	Node3 next;

	public Node3(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DeleteHeadofList {

	public static void main(String[] args) {

		Node3 head = new Node3(10);
//		Node3 temp = new Node3(20);
//		Node3 temp1 = new Node3(40);
//		Node3 temp2 = new Node3(30);
//
//		head.next = temp;
//		temp.prev = head;
//		temp.next = temp1;
//		temp1.prev = temp;
//		temp1.next = temp2;
//		temp2.prev = temp1;

		printList(head);
		System.out.println("After removing the first node");
		head = deleteHeadNode(head);
		printList(head);
	}

	private static Node3 deleteHeadNode(Node3 head) {
		
		if(head==null || head.next==null) {
			return null;
		}
        Node3 curr=head;
        head=curr.next;
//        head.prev=null;
        
		return head;
	}

	private static void printList(Node3 head) {

		Node3 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

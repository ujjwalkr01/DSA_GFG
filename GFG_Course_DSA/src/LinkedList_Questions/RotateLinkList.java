package LinkedList_Questions;

class Node8 {
	int data;
	Node8 next;

	public Node8(int data) {
		this.data = data;
		next = null;
	}
}

public class RotateLinkList {

	public static void main(String[] args) {

		Node8 head = new Node8(2);
		head.next = new Node8(4);
		head.next.next = new Node8(7);
		head.next.next.next = new Node8(8);
		head.next.next.next.next = new Node8(9);
//		head.next.next.next.next.next = new Node8(6);
//		head.next.next.next.next.next.next = new Node8(7);
//		head.next.next.next.next.next.next.next = new Node8(8);

		printList(head);
		System.out.println("After rotating the element Kth times");
		int k = 3;
// 		head = rotateTheList(head, k);
// 		printList(head);
		
		head = rotateTheListMethod2(head, k); //in this approach we are not using any extra space
		printList(head);
	}
	
        private static Node8 rotateTheListMethod2(Node8 head, int k) {

		Node8 curr = head;
		for (int i = 1; i < k; i++) {
			curr = curr.next;
		}
		Node8 temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = head;
		head = curr.next;
		curr.next = null;

		return head;
	}

	private static Node8 rotateTheList(Node8 head, int k) {

		Node8 dummy = new Node8(0);

		int count = getCount(head);
		if (k >= count) {
			return head;
		}

		Node8 curr = head, ptr = dummy;
		for (int i = 1; i <= k; i++) {
			ptr.next = curr;
			ptr = ptr.next;
			curr = curr.next;
			ptr.next = null;
		}
		head = curr;
		Node8 temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = dummy.next;

		return head;
	}

	private static int getCount(Node8 head) {

		Node8 curr = head;
		int count = 0;

		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	private static void printList(Node8 head) {

		Node8 ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}

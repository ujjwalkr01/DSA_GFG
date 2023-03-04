package LinkedList_Questions;

class Node6 {
	int data;
	Node6 next;

	public Node6(int data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLinkedListInKthGroup {

	public static void main(String[] args) {

		Node6 head = new Node6(10);
		head.next = new Node6(20);
		head.next.next = new Node6(30);
		head.next.next.next = new Node6(40);
		head.next.next.next.next = new Node6(50);
		head.next.next.next.next.next = new Node6(60);
		head.next.next.next.next.next.next = new Node6(70);

		printList(head);
		System.out.println("-----------------------------------");
		System.out.println("After reversing the list in the kth group");
//		int k = 3;
//		head = recursiveMethod(head, k);
//		printList(head);

		int k = 3;
		head = IterativeMethod(head, k);
		printList(head);
	}

	private static Node6 IterativeMethod(Node6 head, int k) {
		Node6 curr = head, prevFirst = null;
		boolean isFirstPass = true;

		while (curr != null) {
			Node6 first = curr, prev = null;
			int count = 0;

			while (curr != null && count < k) {
				Node6 temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
				count++;
			}
			if (isFirstPass) {
				head = prev;
				isFirstPass = false;
			} else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return head;
	}

	private static Node6 recursiveMethod(Node6 head, int k) {
		Node6 curr = head, next = null, prev = null;
		int count = 0;
		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			Node6 temp = recursiveMethod(next, k);
			head.next = temp;
		}
		return prev;
	}

	private static void printList(Node6 head) {

		Node6 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

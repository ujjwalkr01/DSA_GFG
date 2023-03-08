package LinkedList_Questions;

class Nodess7 {
	int data;
	Nodess7 next;

	public Nodess7(int data) {
		this.data = data;
		next = null;
	}
}

public class FindLengthOfLoop {

	public static void main(String[] args) {

		Nodess7 head = new Nodess7(15);
		head.next = new Nodess7(10);
		head.next.next = new Nodess7(12);
		head.next.next.next = new Nodess7(30);
		head.next.next.next.next = new Nodess7(40);
		head.next.next.next.next.next = new Nodess7(50);
		head.next.next.next.next.next.next = new Nodess7(70);
		head.next.next.next.next.next.next = head.next.next;

		// printList(head);
		int len = findLen(head);
		System.out.println(len);
	}

	private static int findLen(Nodess7 head) {

		Nodess7 slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				int count = 1;
				slow = slow.next;

				while (slow != fast) {
					count++;
					slow = slow.next;
				}
				return count;
			}
		}
		return 0;
	}

	private static void printList(Nodess7 head) {

		Nodess7 ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}

package LinkedList_Questions;

class Nodess {
	int data;
	Nodess next;

	public Nodess(int data) {
		this.data = data;
		next = null;
	}
}

public class SearchElementInLinkedList {

	public static void main(String[] args) {

		Nodess head = new Nodess(10);
		head.next = new Nodess(20);
		head.next.next = new Nodess(5);
		head.next.next.next = new Nodess(30);
		int ele = 6;
		System.out.println(searchElement(head, ele));
		System.out.println("-----------------------------------");
		System.out.println(recursiveMethod(head, ele));
	}
	private static int recursiveMethod(Nodess head, int ele) {
		if (head == null) {
			return -1;
		}
		if (head.data == ele) {
			return 1;
		} else {
			int res = recursiveMethod(head.next, ele);
			if (res == -1) {
				return -1;
			} else {
				return (res + 1);
			}
		}

	}

	private static int searchElement(Nodess head, int ele) {

		Nodess curr = head;
		int pos = 1;
		while (curr != null) {
			if (curr.data == ele) {
				return pos;
			}
			curr = curr.next;
			pos++;
		}
		return -1;
	}

}

package LinkedList_Questions;

class Nod8 {
	int data;
	Nod8 next;

	public Nod8(int data) {
		this.data = data;
		next = null;
	}
}

public class CheckIdenticalLinkList {

	public static void main(String[] args) {

		Nod8 head1 = new Nod8(1);
		head1.next = new Nod8(2);
		head1.next.next = new Nod8(3);
		head1.next.next.next = new Nod8(4);

		Nod8 head2 = new Nod8(1);
		head2.next = new Nod8(2);
		head2.next.next = new Nod8(3);
		head2.next.next.next = new Nod8(5);

		printList(head1, head2);
		if (checkIndenctical(head1, head2)) {
			System.out.println("Yes Identical");
		} else {
			System.out.println("Not Identical");
		}
	}

	private static boolean checkIndenctical(Nod8 head1, Nod8 head2) {

		int count1 = getCount(head1);
		int count2 = getCount(head2);

		Nod8 curr1 = head1, curr2 = head2;
		if (count1 > count2 || count2 > count1) {
			return false;
		} else {
			while (curr1 != null && curr2 != null) {
				if (curr1.data != curr2.data) {
					return false;
				}
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		}
		return true;
	}

	private static int getCount(Nod8 head) {
		Nod8 curr = head;
		int cnt = 0;

		while (curr != null) {
			cnt++;
			curr = curr.next;
		}
		return cnt;
	}

	private static void printList(Nod8 head1, Nod8 head2) {

		Nod8 curr = head1;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
		curr = head2;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

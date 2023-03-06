package LinkedList_Questions;

class Nod1 {
	int data;
	Nod1 next;

	public Nod1(int data) {
		this.data = data;
		next = null;
	}
}

public class IntersectionOfTwoList {

	public static void main(String[] args) {

		Nod1 head1 = new Nod1(5);
		head1.next = new Nod1(8);
		head1.next.next = new Nod1(7);
		head1.next.next.next = new Nod1(10);
		head1.next.next.next.next = new Nod1(12);
		head1.next.next.next.next.next = new Nod1(15);

		Nod1 head2 = new Nod1(9);
		head2.next = new Nod1(10);
		head2.next.next = new Nod1(12);
		head2.next.next.next = new Nod1(15);

		printList(head1, head2);
		System.out.println("Interesection point of list1 and list2 are");
		int commonPoint = intersectionPoint(head1, head2);
		System.out.println(commonPoint);

	}

	private static int intersectionPoint(Nod1 head1, Nod1 head2) {

		int count1 = getCount(head1);
		int count2 = getCount(head2);
		int d;

		Nod1 curr1 = head1, curr2 = head2;

		if (count1 > count2) {
			d = count1 - count2;
			for (int i = 1; i <= d; i++) {
				curr1 = curr1.next;
			}

		} else {
			d = count2 - count1;
			for (int i = 1; i <= d; i++) {
				curr2 = curr2.next;
			}
		}

		while (curr1 != null && curr2 != null) {
			if (curr1.data == curr2.data) {
				return curr1.data;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}

		return -1;
	}

	private static int getCount(Nod1 node) {
		Nod1 curr = node;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	private static void printList(Nod1 head1, Nod1 head2) {

		Nod1 curr = head1;
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

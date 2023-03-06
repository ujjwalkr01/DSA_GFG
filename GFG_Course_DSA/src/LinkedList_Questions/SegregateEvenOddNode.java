package LinkedList_Questions;

class Nod {
	int data;
	Nod next;

	public Nod(int data) {
		this.data = data;
		next = null;
	}
}

public class SegregateEvenOddNode {

	public static void main(String[] args) {

		Nod head = new Nod(17);
		head.next = new Nod(15);
		head.next.next = new Nod(8);
		head.next.next.next = new Nod(10);
		head.next.next.next.next = new Nod(12);
		head.next.next.next.next.next = new Nod(5);

		printList(head);
		System.out.println(
				"After sepereating the even and odd node and then joining again by keeping the even nodes at front");
		head = segEven_Odd(head);
		printList(head);

	}

	private static Nod segEven_Odd(Nod head) {

		Nod eS = null, eE = null, oS = null, oE = null;

		for (Nod curr = head; curr != null; curr = curr.next) {
			int x = curr.data;

			if (x % 2 == 0) {
				if (eS == null) {
					eS = curr;
					eE = eS;
					// System.out.println(eE.data);
				} else {
					eE.next = curr;
					// System.out.println(eE.next.data);
					eE = eE.next;
				}
			} else {
				if (oS == null) {
					oS = curr;
					oE = oS;
				} else {
					oE.next = curr;
					oE = oE.next;
				}
			}

		}
		if (oE == null || oS == null) {
			return head;
		}
		eE.next = oS;
		oE.next = null;

		return eS;
	}

	private static void printList(Nod head) {

		Nod curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

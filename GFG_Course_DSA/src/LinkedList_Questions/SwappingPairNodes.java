package LinkedList_Questions;

class Nod2 {
	int data;
	Nod2 next;

	public Nod2(int data) {
		this.data = data;
		next = null;
	}
}

public class SwappingPairNodes {

	public static void main(String[] args) {

		Nod2 head1 = new Nod2(5);
		head1.next = new Nod2(8);
		head1.next.next = new Nod2(7);
		head1.next.next.next = new Nod2(10);
		head1.next.next.next.next = new Nod2(12);
		//head1.next.next.next.next.next = new Nod2(15);

		printList(head1);
		System.out.println("After Swapping the nodes in pair");
		head1 = pairwiseSwapping(head1);
		printList(head1);
	}

	private static Nod2 pairwiseSwapping(Nod2 head1) {

		Nod2 curr = head1;

		while (curr != null) {
			if (curr.next != null) {
				int temp = curr.data;
				curr.data = curr.next.data;
				curr.next.data = temp;
			} else {
				break;
			}
			curr = curr.next.next;
		}
		return head1;
	}

	private static void printList(Nod2 head1) {

		Nod2 curr = head1;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

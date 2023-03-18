package LinkedList_Questions;

class Nodes4 {
	int data;
	Nodes4 next;

	public Nodes4(int data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {

		Nodes4 head = new Nodes4(10);
		head.next = new Nodes4(20);
		head.next.next = new Nodes4(30);
		head.next.next.next = new Nodes4(40);
		head.next.next.next.next = new Nodes4(50);
		head.next.next.next.next.next = new Nodes4(60);

		printhead(head);
		System.out.println("the Nth element from the last");
		int n = 6;
		findtheNthLastEle(head, n);
		System.out.println("-------------------------");
		findtheNthLastEleMethod2(head, n);
	}

private static Nodes5 efficientSol(Nodes5 head) {

		Nodes5 curr = head;
		Nodes5 prev = null;

		while (curr != null) {
			Nodes5 temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	private static Nodes5 reverseThelist(Nodes5 head) {

		ArrayList<Integer> list = new ArrayList<>();

		for (Nodes5 curr = head; curr != null; curr = curr.next) {
			list.add(curr.data);
		}
		for (Nodes5 curr = head; curr != null; curr = curr.next) {
			curr.data = list.remove(list.size() - 1);
		}
		return head;
	}

	private static void printList(Nodes5 head) {

		Nodes5 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

package LinkedList_Questions;

class Nodes4 {
	int data;
	Nodes4 next;

	public Nodes4(int data) {
		this.data = data;
		next = null;
	}
}

public class FindNthNodefromEnd {

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

	private static void findtheNthLastEleMethod2(Nodes4 head, int n) {

		if (head == null) {
			return;
		}
		Nodes4 first = head;
		for (int i = 1; i <= n; i++) {
			if (first == null) {
				return;
			}
			first = first.next;
		}
		Nodes4 second = head;
		while (first != null) {
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data);
	}

	private static void findtheNthLastEle(Nodes4 head, int n) {

		Nodes4 curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		if (n > count) {
			return;
		}
		curr = head;
		for (int i = 1; i <= count - n; i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);

	}

	private static void printhead(Nodes4 head) {

		Nodes4 curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

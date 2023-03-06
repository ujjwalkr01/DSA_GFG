package LinkedList_Questions;

class Nod3 {
	char data;
	Nod3 next;

	public Nod3(char data) {
		this.data = data;
		next = null;
	}
}

public class PalindromeLinkedList {

	public static void main(String[] args) {

		Nod3 head1 = new Nod3('r');
		head1.next = new Nod3('a');
		head1.next.next = new Nod3('d');
		head1.next.next.next = new Nod3('d');
		head1.next.next.next.next = new Nod3('a');
		head1.next.next.next.next.next = new Nod3('s');

		printList(head1);
//		if (checkPalindrome(head1)) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
		if (checkPalindromeMethod2(head1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean checkPalindromeMethod2(Nod3 head1) {

		Nod3 slow = head1, fast = head1;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// System.out.println(slow.data);
		Nod3 rev = reverseList(slow.next);

		Nod3 curr = head1;
		while (rev != null) {
			if (curr.data != rev.data) {
				return false;
			}
			curr = curr.next;
			rev = rev.next;
		}
		return true;
	}

	private static boolean checkPalindrome(Nod3 head1) {

		Nod3 dummy = new Nod3('0');
		Nod3 ptr = dummy, curr = head1;

		while (curr != null) {
			ptr.next = curr;
			ptr = ptr.next;
			curr = curr.next;
			ptr.next = null;
		}
//		printList(dummy.next);

		Nod3 rev = reverseList(head1);

		curr = dummy.next;

		while (curr != null && rev != null) {
			if (curr.data != rev.data) {
				return false;
			}
			curr = curr.next;
			rev = rev.next;
		}
		return true;
	}

	private static Nod3 reverseList(Nod3 head1) {

		Nod3 curr = head1;
		Nod3 prev = null;

		while (curr != null) {
			Nod3 temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
//		printList(prev);
		return prev;
	}

	private static void printList(Nod3 head1) {

		Nod3 curr = head1;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

}

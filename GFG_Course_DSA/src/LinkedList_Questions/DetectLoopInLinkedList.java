package LinkedList_Questions;

import java.util.HashSet;

class Nodes7 {
	int data;
	Nodes7 next;

	public Nodes7(int data) {
		this.data = data;
		next = null;
	}
}

public class DetectLoopInLinkedList {

	public static void main(String[] args) {

		Nodes7 head = new Nodes7(15);
		head.next = new Nodes7(10);
		head.next.next = new Nodes7(12);
		head.next.next.next = new Nodes7(20);
		head.next.next.next.next = head.next;

//		printList(head);
//		if (checkLoopMethod1(head)) { // Method1 is pointer/reference but linked list get destroyed
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
		
// 		if (checkLoopMethod2Hashing(head)) { // Method2 is hashing but linked list don't get destroyed
// 			System.out.println("Yes");
// 		} else {
// 			System.out.println("No");
// 		}
		
		if (checkLoopEfficientApproach(head)) { // this is efficient method and doesn't required extra space..
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
       private static boolean checkLoopEfficientApproach(Nodes7 head) {
              Nodes7 slow=head, fast=head;
        
              while(slow!=null && fast!=null && fast.next!=null) {
        	  slow=slow.next;
        	  fast=fast.next.next;
        	
        	  if(slow==fast) {
        		return true;
        	  }
             }
		return false;
	}

	private static boolean checkLoopMethod2Hashing(Nodes7 head) {
		HashSet<Nodes7> set = new HashSet<>();
		for (Nodes7 curr = head; curr != null; curr = curr.next) {
			if (set.contains(curr)) {
				return true;
			}
			set.add(curr);
		}
		return false;
	}

	private static boolean checkLoopMethod1(Nodes7 head) {

		Nodes7 temp = new Nodes7(0);
		Nodes7 curr = head;

		while (curr != null) {
			if (curr.next == null) {
				return false;
			}
			// System.out.println("hi" + curr.next.data);
			if (curr.next == temp) {
				return true;
			}
			Nodes7 curr_next = curr.next;

			curr.next = temp;
			curr = curr_next;
			// System.out.println(curr.data);
		}
		return false;
	}

	private static void printList(Nodes7 head) {

		Nodes7 ptr1 = head;
		while (ptr1 != null) {
			System.out.print(ptr1.data + " ");
			ptr1 = ptr1.next;
		}
	}

}

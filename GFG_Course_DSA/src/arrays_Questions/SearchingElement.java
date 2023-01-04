package arrays_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
                                                 //searching the element for unsorted order.....
		int arr[] = { 20, 5, 7, 25 };
		int n = arr.length;
		System.out.println("Enter the element");
		int x = sc.nextInt();

		Searchelement obj = new Searchelement();
		obj.search(arr, x, n);

		AlternateMethod obj1 = new AlternateMethod();
		obj1.search1();

	}
}

class Searchelement {

	public void search(int arr[], int x, int n) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				System.out.println("yes: " + x);
				break;
			}
		}
	}
}

class AlternateMethod {

	public void search1() {

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(5);
		list.add(7);
		list.add(25);

		System.out.println(list);
		
		if(list.contains(30)) {
			System.out.println("Yes the element is present in the list...");
		}else {
			System.out.println("No element is not present in the list...");
		}
	}
}

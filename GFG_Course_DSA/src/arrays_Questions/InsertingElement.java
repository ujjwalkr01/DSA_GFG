package arrays_Questions;

import java.util.Scanner;

public class InsertingElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		int cap = arr.length;
		int n = 3;
		arr[0] = 5;
		arr[1] = 3;
		arr[2] = 8;

		System.out.println("Before Insertion:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter the element you want to enter");
		int element = sc.nextInt();

		System.out.println("Enter the position at which u want to insert the element:");
		int pos = sc.nextInt();

		n = insertElement(arr, cap, n, element, pos);
		System.out.println("After insertion:");

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int insertElement(int[] arr, int cap, int n, int element, int pos) {

		if (n == cap)
			return n;
		int idx = pos - 1;
		//first we have to decrement the index by 1 and then
		//logic is---> i= [no of elements present in the array-1]...

		for (int i = n - 1; i >= idx; i--) {  //for inserting the element at the any position except last....
			arr[i + 1] = arr[i];
		}
		arr[idx] = element;   //for inserting the element at the end postion...
		return n + 1;

	}

}

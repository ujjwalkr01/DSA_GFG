package arrays_Questions;

import java.util.Scanner;

public class DeletingElement {

	public static void main(String[] args) {

		int arr[] = new int[8];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to delete:");
		int element = sc.nextInt();

		System.out.println("After deleting the element: ");
		n = deleteELement(arr, n, element);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int deleteELement(int arr[], int n, int element) {
		int i = 0;
		for (i = 0; i < n; i++) {
			if (arr[i] == element) {
				break;
			}
		}
		if (i == n)    //this condition is used to return the value of n as the element provided is not present in the array... 
			return n;

		for (int j = i; j < n - 1; j++) {
			arr[j] = arr[j + 1];
		}
		return n - 1;
	}

}

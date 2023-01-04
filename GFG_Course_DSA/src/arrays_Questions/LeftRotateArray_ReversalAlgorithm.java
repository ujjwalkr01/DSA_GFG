package arrays_Questions;

import java.util.Scanner;

public class LeftRotateArray_ReversalAlgorithm {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the no of times u want to rotate the array:");
		int d = sc.nextInt();

		n = leftRotateByD_ReverseAlgo(arr, d); // reversal algorithm
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static int leftRotateByD_ReverseAlgo(int arr[], int d) {

		int n = arr.length;

		if (d == 0) {
			System.out.println("No reverse");
			return 0;
		}

		d = d % n;  //if rotating factor is greater than array length.....

		reverse_Algo(arr, 0, d - 1);
		reverse_Algo(arr, d, n - 1);
		reverse_Algo(arr, 0, n - 1);

		return n;
	}

	public static void reverse_Algo(int arr[], int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

}

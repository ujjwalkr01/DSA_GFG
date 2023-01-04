package arrays_Questions;

import java.util.Scanner;

public class LeftRotatArray_byDtimes {

	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the no of times u want to rotate the array:");
		int d = sc.nextInt();

		leftRotateByD(arr, d); // Efficient solution
		System.out.println("\n-----------------------------------------");

		leftRotateBy_D(arr, d); //naive solution...Time complexity is Theta(nd)
		                        //auxiliary space is Theta(1);
		System.out.println("\n-----------------------------------------");

	}

	public static void leftRotateByD(int[] arr, int d) {

		int n = arr.length;
		int arr1[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (i < d)
				arr1[n - d + i] = arr[i];
			else
				arr1[i - d] = arr[i];
		}
		System.out.println("After rotating " + d + " times:");
		for (int i = 0; i < n; i++)
			System.out.print(arr1[i] + " ");
	}

	public static void leftRotateBy_D(int arr[], int d) {
		int n = arr.length;

		for (int i = 0; i < d; i++)
			leftRotateByOne(arr);

		System.out.println("After rotating array by " + d);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);

	}

	public static void leftRotateByOne(int arr[]) {

		int n = arr.length;
		int temp = arr[0];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;

	}

}

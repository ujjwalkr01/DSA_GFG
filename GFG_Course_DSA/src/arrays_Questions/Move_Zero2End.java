package arrays_Questions;

import java.util.Scanner;

public class Move_Zero2End {

	public static void main(String[] args) {

		int arr[] = new int[7];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		moveZero_ToEnd(arr);
		moveZero_ToEnd_efficientMethod(arr);
	}

	public static void moveZero_ToEnd(int[] arr) {

		int n = arr.length;
   //in this time complexity is O(n^2) , so its better to use efficient code..
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					System.out.print("i= " + i + " j=" + j);
					System.out.println("---------------------");
					if (arr[j] != 0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}

				}
			}
		}
		System.out.println("After modifying:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		System.out.println("-------------------------------------------");
	}

	public static void moveZero_ToEnd_efficientMethod(int arr[]) {

		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.println("After modifying by efficient method:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}

}

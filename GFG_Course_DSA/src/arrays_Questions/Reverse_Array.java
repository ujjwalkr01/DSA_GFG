package arrays_Questions;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		reversearray(arr);
		System.out.println("After reversing the array:");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void reversearray(int[] arr) {

		int n = arr.length;
        //in this logic is basically we have to take first index[0] as low and last index[n-1] as high and we have to just compare both 
		//and we have to swap the high with low .....
		//and increment the lower and decrement the higher ....
		int low = 0, high = n - 1;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

}

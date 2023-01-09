package arrays_Questions;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		thirdlargest(arr, n);
	}

	private static void thirdlargest(int[] arr, int n) {

		int max1 = arr[0], max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

//		for (int i = 1; i < n; i++) {
//			if (max1 < arr[i]) {
//				max1 = arr[i];
//			}
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (max2 < arr[i] && arr[i] < max1) {
//				max3=max2;
//				max2 = arr[i];
//			}
//			if(max3<=max2) {
//				
//			}
//		}
//
////		for (int i = 0; i < n; i++) {
////			if ((max3 < arr[i] && arr[i] < max2) || (max3==max2) ) {
////				max3 = arr[i];
////			}
////		}

		for (int i = 1; i < n; i++) {
			if (max1 < arr[i]) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			} else if (max2 < arr[i]) {
				max3 = max2;
				max2 = arr[i];
			} else if (max3 < arr[i]) {
				max3 = arr[i];
			}
		}
		System.out.println(max1 + " " + max2 + " " + max3);
	}

}

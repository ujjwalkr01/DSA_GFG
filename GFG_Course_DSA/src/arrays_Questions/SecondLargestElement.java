package arrays_Questions;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int res = secondLargestEle(arr);
		System.out.println("The second largest element is : " + res);
		System.out.println("-------------------------------------------");

		int secLarge = fun1(arr);
		System.out.println(secLarge);

	}

	private static int fun1(int[] arr) {

		int max = arr[0], secMax = -1;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				secMax = max;
				max = arr[i];
			} else if (secMax < arr[i] && max != arr[i]) {
				secMax = arr[i];
			}
		}
		System.out.println(max);
		return secMax;
	}

	private static int secondLargestEle(int[] arr) {
		int max = 0, max2 = -1;
		int secondLargest = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max2 = max;
				secondLargest = arr[max2];
				max = i;
			} else if (arr[i] != arr[max]) {
				if (max2 == -1 || arr[i] > arr[max2]) {
					max2 = i;
					secondLargest = arr[max2];
				}

			}

		}
		System.out.println("largest:" + arr[max]);
		return secondLargest;
	}

}

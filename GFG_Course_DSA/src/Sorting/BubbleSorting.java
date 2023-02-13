package Sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[] {7,8,3,1,2};
		int n = arr.length;// no of elements

		bubbleSort(arr, n);
		System.out.println("-----------------------------------");
		BubbleSort(arr,n); 
		System.out.println("\n-----------------------------------");
		optimisedBubbleSort(arr,n);
	}

	private static void optimisedBubbleSort(int[] arr, int n) {
        
		for(int i=0;i<n;i++) {
			boolean isSwapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(isSwapped==false) {
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubbleSort(int[] arr, int n) {
		/*
		 * here we are running the outer loop from n to 0 and we are decreasing the lastIndex for every element
		 * as the largest element will shift to last so we are running the while loop till n-1, then n-2 ..and goes on 
		 */

		for (int lastIndex = arr.length; lastIndex > 0; lastIndex--) {
			int i = 0;
			int j = i + 1;

			while (j < lastIndex) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void BubbleSort(int arr[],int n) {
		/*
		 * here we are running inner loop from 0 to n-1 times and for each outer loop iteration
		 * we are using the inner loop that will push the largest element in the last
		 * and our first element will be the smallest element
		 */
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

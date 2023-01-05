package arrays_Questions;

import java.util.ArrayList;
import java.util.Scanner;
//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
//If at any instance,there are no more subarrays of size greater than or equal to K,then reverse 
//the last subarray(irrespective of its size).You shouldn'treturn any array,modify the given array in-place.

public class ReverseArray_inGroup {

	public static void main(String[] args) {

		// int arr[] = new int[5];
		ArrayList<Integer> list = new ArrayList<>(5);
		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter the elements:");
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		System.out.println("Enter the group of elements u want to reverse:");
		int k = sc.nextInt();

		reversearray(list, k);
	}

	private static void reversearray(ArrayList<Integer> list, int k) {

		int n=list.size();
		for(int i=0;i<n;i+=k) {
			int low=i, high=i+k-1;
			
			if(high>n-1)
				high=n-1;
			
			while(low<high) {
				int temp=list.get(low);
				list.set(low, list.get(high));
				list.set(high, temp);
				low++; high--;
			}
		}
		System.out.println(list);
	}

}

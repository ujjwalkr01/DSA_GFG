package arrays_Questions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Leader_InArray {

	public static void main(String[] args) {

		int arr[] = new int[7];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		leaderInArray(arr, n); // naive solution
		System.out.println("-----------------------------------");

		leaderIn_Array(arr, n); // efficient solution
	}

	public static void leaderInArray(int[] arr, int n) {

		boolean flag;
		System.out.println("Leaders in the element are:");

		for (int i = 0; i < n; i++) {
			flag = false;
			for (int j = i + 1; j < n; j++) { // time complexity is Theta(n^2) and auxiliary space is Theta(n)...
				if (arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(arr[i]);
			}

		}
	}

	public static void leaderIn_Array(int arr[], int n) {
		int curr_lead = arr[n - 1];
//		System.out.println(curr_lead);
//time complexity is Theta(n)...and auxiliary space is Theta(1)...but it prints in reverse order...
		//to print in exact same order use the reverse array logic ..but then also time complexity will be same
		//only auxiliary space will be Theta(n) because we will create another array and then reverse...
		ArrayList<Integer> list=new ArrayList<>();
		 list.add(arr[n-1]);
		 
		for (int i = n - 2; i >= 0; i--) {
			if (curr_lead < arr[i]) {
				curr_lead = arr[i];
				//System.out.println(curr_lead);
				list.add(arr[i]);
			}
		}
		Collections.reverse(list); //used to reverse the list....
        System.out.println(list);
	}

}

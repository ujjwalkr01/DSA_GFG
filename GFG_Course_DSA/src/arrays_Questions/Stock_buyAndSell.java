package arrays_Questions;

import java.util.Scanner;

public class Stock_buyAndSell {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int profit = stockBuy_Sell(arr);
		System.out.println("Profit is :" + profit);
	}

	public static int stockBuy_Sell(int arr[]) {
		int profit = 0;
		int n = arr.length;
//
//		for (int i = 1; i < n; i++) {
//			if (arr[i] > arr[i - 1])
//				profit += arr[i] - arr[i - 1];
//		}
//		return profit;
		
		for (int i = 0; i < n-1; i++) {
			if (arr[i] < arr[i + 1])
				profit += arr[i + 1] - arr[i];
		}
		return profit;

	}
}

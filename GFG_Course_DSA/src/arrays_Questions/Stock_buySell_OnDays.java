package arrays_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stock_buySell_OnDays {

	public static void main(String[] args) {
		int arr[] = new int[7];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Object stockBuy = Sell(arr, n);
		System.out.println(stockBuy);

		Object stockBuy1 = Sell1(arr, n);
		System.out.println(stockBuy1);

	}

	private static Object Sell(int[] arr, int n) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				ArrayList<Integer> arr1 = new ArrayList<>();

				arr1.add(i);
				arr1.add(i + 1);
				list.add(arr1);
			}
		}
		return list;
	}

	public static Object Sell1(int arr[], int n) {
		ArrayList<ArrayList<Integer>> segments = new ArrayList<>();
		int buyDay = 0, sellDay = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				// isIncreasing = true;
				sellDay++;
			} else {
				// isIncreasing = false;
				if (arr[buyDay] != arr[sellDay])
					segments.add(new ArrayList<Integer>(Arrays.asList(buyDay, sellDay)));
				buyDay = i;
				sellDay = i;
			}
		}

		if (buyDay != sellDay)
			segments.add(new ArrayList<Integer>(Arrays.asList(buyDay, sellDay)));

		return segments;
	}

}

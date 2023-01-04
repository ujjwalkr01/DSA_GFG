package arrays_Questions;

import java.util.Scanner;

public class FreuencyIn_SortedArray {

	public static void main(String[] args) {

		int arr[] = new int[8];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}


		// works only when array is sorted...
		find_Frequency(arr, n); // naive solution
		System.out.println("___________________________________");

		find_frequency(arr, n); // optimized method...
	}

	public static void find_Frequency(int arr[], int n) {

		int count;
//time complexity will be O(n^2) as we are running two loops...
		for (int i = 0; i < n; i += count) {
			count = 0;
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			System.out.println(arr[i] + "  " + count);
		}
	}

	public static void find_frequency(int arr[], int n) {

		int frequency = 1, i = 1;
		// time complexity is Theta(n)...as in the worst case if there is one element
		// then it will n time...
		while (i <= n) {

				while (i < n && arr[i] == arr[i - 1]) {
					frequency++;
					i++;
				}
				System.out.println(arr[i - 1] + "  " + frequency);

			i++;
			frequency = 1;
		}
		if (n == 1 /* || arr[n - 1] != arr[n - 2] */) {
			System.out.println(arr[n - 1] + "  " + frequency);
		}

	}

}

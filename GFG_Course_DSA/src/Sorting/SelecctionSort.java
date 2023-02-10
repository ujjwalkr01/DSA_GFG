package Sorting;

public class SelecctionSort {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 8, 20, 2, 18 };
		int arr1[] = { 10, 5, 8, 20, 2, 18 };

		selectionSort(arr);
		System.out.println("-------------------------------");
		optimisedSelectionsort(arr1);
	}

	private static void optimisedSelectionsort(int[] arr1) {

		for (int i = 0; i < arr1.length - 1; i++) {
			int min_idx = i;

			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[j] < arr1[min_idx]) {
					min_idx = j;
				}
			}
			swapElement(arr1, min_idx, i);

		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	private static void swapElement(int[] arr1, int min_idx, int i) {

		int temp = arr1[min_idx];
		arr1[min_idx] = arr1[i];
		arr1[i] = temp;
	}

	private static void selectionSort(int[] arr) {

		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int min_ind = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}
			temp[i] = arr[min_ind];
			arr[min_ind] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}

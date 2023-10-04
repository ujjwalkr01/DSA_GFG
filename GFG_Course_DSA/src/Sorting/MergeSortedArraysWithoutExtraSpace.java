package Sorting;

import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {

	public static void main(String[] args) {

		long arr1[] = { 1, 4, 5, 7 };
		long arr2[] = { 2, 3, 6 };

		int n = arr1.length, m = arr2.length;

		// optimised approach with complexity of -->O(min(n, m)) + O(n*logn) + O(m*logm)
//		mergeTwoArr_Alternate(arr1, arr2, n, m);

		// most efficent approach using shell sort with time complexity of
		// O(log2(n+m))--->for outer loop * O(n+m)-->for inner loop
		mergeTwoArr(arr1, arr2, n, m);

		for (int i = 0; i < n; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	private static void mergeTwoArr_Alternate(long[] arr1, long[] arr2, int n, int m) {

		int i = n - 1, j = 0;

		while (j < m) {
			if (arr1[i] > arr2[j]) {
				swapIfGreater(arr1, arr2, i, j);
			} else {
				break;
			}
			i--;
			j++;

		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

	private static void mergeTwoArr(long[] arr1, long[] arr2, int n, int m) {

		// based on shell sorting technique...

		int len = n + m;

		int gap = (len / 2) + (len % 2);

		while (gap > 0) {
			int left = 0;
			int right = left + gap;

			while (right < len) {
				// left lies in arr1 and right lies in arr2
				if (left < n && right >= n) {
					swapIfGreater(arr1, arr2, left, right - n);
				} // left and right lies in arr2
				else if (left >= n) {
					swapIfGreater(arr2, arr2, left - n, right - n);
				} // left and right lies in arr1
				else {
					swapIfGreater(arr1, arr1, left, right);
				}
				left++;
				right++;
			}
			if (gap == 1) {
				break;
			}
			gap = (gap / 2) + (gap % 2);
		}
	}

	private static void swapIfGreater(long[] arr1, long[] arr2, int indx1, int indx2) {

		if (arr1[indx1] > arr2[indx2]) {
			long temp = arr1[indx1];
			arr1[indx1] = arr2[indx2];
			arr2[indx2] = temp;
		}
	}
}

package Searching;

public class MedianOfTwoSortedArr {

	public static void main(String[] args) {

		int arr1[] = { 30, 40, 50, 60 };
		int arr2[] = { 5, 6, 7, 8, 9 };

		System.out.println(findMedianofArrays(arr1, arr2));
	}

	private static int findMedianofArrays(int[] arr1, int[] arr2) {

		int n1 = arr1.length, n2 = arr2.length;

		int low = 0, high = n1;

		while (low <= high) {
			// finding mid for arr1...
			int mid1 = (low + high) / 2;

			// finding the mid for arr2 using the formula...
			int mid2 = (n1 + n2 + 1) / 2 - mid1;

			// now finding the min and max from arr1...
			int min1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1[mid1];
			int max1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];

			// now similarly finding the min and max from arr2...
			int min2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2[mid2];
			int max2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];

			// now checking for the condition if we find our mid element
			if (max2 <= min1 && max1 <= min2) {
				// now checking for if the merge of length of two arrays are odd or even..
				if ((n1 + n2) % 2 == 0) {
					return (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
				} else {
					return Math.max(max1, max2);
				}
			} else if (max1 > min2) { // condition for checking the left part
				high = mid1 - 1;
			} else {// condition for checking in right part..
				low = mid1 + 1;
			}
		}

		return -1;
	}

}

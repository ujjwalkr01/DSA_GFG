package Searching;

public class SearchInSortedInfiniArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 10, 15, 20, 40, 60, 80, 100, 200, 500 };
		int x = 100;

		int res = findElement(arr, x);
		System.out.println(res);
	}

	private static int findElement(int[] arr, int x) {
		if (arr[0] == x)
			return 0;

		int i = 1;
		while (arr[i] < x) {
			i = i * 2;
		}
		if (arr[i] == x)
			return i;

		return binarySearch(arr, x, (i / 2) + 1, i - 1);
	}

	private static int binarySearch(int[] arr, int x, int i, int j) {
		int low = i, high = j;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}

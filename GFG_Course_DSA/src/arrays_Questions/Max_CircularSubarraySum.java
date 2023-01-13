package arrays_Questions;

public class Max_CircularSubarraySum {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, -2, 3, 4 };
		int n = arr.length;
		int res = maxCircularSubarraySum(arr, n);
		System.out.println(res);
		System.out.println("-------------------------------------");
		int alternateMethod = maxCircularSum(arr, n);
		System.out.println(alternateMethod);
	}

	private static int maxCircularSubarraySum(int[] arr, int n) {

		int res = arr[0];
		for (int i = 0; i < n; i++) {
			int curr_sum = arr[i];
			int curr_max = arr[i];

			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
			}
			res = Math.max(curr_max, res);
		}
		return res;

	}

	public static int maxCircularSum(int arr[], int n) {
		int max_normal = kadaneAlgo(arr, n);

		//this condition checks whether the max_normal is greater than 0 
		//if it's less than 0 it will return the max_normal ..if we don't use this condition then it will give the output 0;
		if (max_normal < 0) {
			return max_normal;
		}

		int arr_sum = 0;
		//we use this loop for calculating the total sum of the element and inverting the array
		//we are inverting the array so that we can find the minimum sum using the kadane algorithm...
		for (int i = 0; i < n; i++) {
			arr_sum += arr[i];
			arr[i] = -arr[i];
		}
		int max_circularSum = arr_sum + kadaneAlgo(arr, n);
		return Math.max(max_normal, max_circularSum);
	}

	private static int kadaneAlgo(int[] arr, int n) {
		int currSum = arr[0], maxEnd = arr[0];

		for (int i = 1; i < n; i++) {
			maxEnd = Math.max(maxEnd + arr[i], arr[i]);
			currSum = Math.max(maxEnd, currSum);
		}
		return currSum;
	}

}

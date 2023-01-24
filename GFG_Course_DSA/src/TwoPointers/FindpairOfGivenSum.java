package TwoPointers;

import java.util.Scanner;

public class FindpairOfGivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
//Array must be sorted for two pointer
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=sc.nextInt();
		if(checkSumExist(arr,n,sum)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean checkSumExist(int[] arr, int n, int sum) {
        int i=0, j=n-1;
        
        while(i<j) {
        	if(arr[i]+arr[j]==sum) {
        		return true;
        	}else if(arr[i]+arr[j]>sum) {
        		j--;
        	}else {
        		i++;
        	}
        }
		return false;
	}

}

package arrays_Questions;

import java.util.Scanner;

public class MaxOccuredIntegerInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int L[] = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = sc.nextInt();
		}
		int R[] = new int[n];
		for (int i = 0; i < n; i++) {
			R[i] = sc.nextInt();
		}
		int max=R[0];
		for(int i=1;i<n;i++) {
			max=Math.max(R[i], max);
		}
		System.out.println(max);
		System.out.println(maxOccured(L, R, n, max));
	}

	private static int maxOccured(int[] L, int[] R, int n, int max) {
   // we have taken the max element from the right array and we have keep the length of our new array as max+2; because element will end till there..
		int arr[] = new int[max+2];

		
		for (int i = 0; i < n; i++) {
			arr[L[i]]++;
			arr[R[i] + 1]--;
		}
		int maxm=arr[0], res=0;
		for(int i = 1; i < arr.length; i++)
    	{
    		arr[i] += arr[i - 1];

    		if(maxm < arr[i])
    		{
    			maxm = arr[i];

    			res = i;
    		}
    	}
         for(int i=0;i<arr.length;i++) {
        	 System.out.print(arr[i]+" ");
         }
		return res;
	}

}

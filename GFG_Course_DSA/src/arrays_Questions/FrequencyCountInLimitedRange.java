package arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCountInLimitedRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		checkifElementisPresentOrNot(arr, n);

	}

	private static void checkifElementisPresentOrNot(int[] arr, int N) {
	       int hash[]=new int[N+1];
	        
	       for(int i=0;i<N;i++) {
	    	   if(arr[i]<=N) {
	    		   hash[arr[i]]++;
	    	   }
	       }
	       for(int i=0;i<N;i++) {
	    	   System.out.print(hash[i]+" ");
	       }
	       
	       for(int i=0;i<N;i++) {
	    	   arr[i]=hash[i+1];
	       }
	       
	       for(int i=0;i<N;i++) {
	    	   System.out.print(arr[i]+" ");
	       }
	
	}

}

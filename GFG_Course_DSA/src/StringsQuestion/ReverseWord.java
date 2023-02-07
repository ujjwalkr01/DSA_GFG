package StringsQuestion;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char arr[] = str.toCharArray();
		reverseWord(arr);
	}

	private static void reverseWord(char[] arr) {

		int start = 0;
		for (int end = 0; end < arr.length; end++) {
			if (arr[end] == ' ') {
				reverseCharacter(arr, start, end - 1);
				start = end + 1;
			}
		}
		reverseCharacter(arr, start, arr.length - 1);
		reverseCharacter(arr, 0, arr.length - 1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
	}

	private static void reverseCharacter(char[] arr, int low, int high) {

		while (low <= high) {
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

}

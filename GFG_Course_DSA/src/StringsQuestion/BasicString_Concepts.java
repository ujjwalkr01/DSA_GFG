package StringsQuestion;

import java.util.Scanner;

public class BasicString_Concepts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		System.out.println(s1);

		sc.nextLine();

		String s2 = sc.nextLine();
		System.out.println(s2);

		String s3 = sc.next();
		System.out.println(s3);
		printReverse(s3);
	}

	private static void printReverse(String s3) {

		int low = 0, high = s3.length() - 1;

		char arr[] = s3.toCharArray();

		while (low < high) {
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		String rev = new String(arr);

		System.out.println(rev);
	}

}

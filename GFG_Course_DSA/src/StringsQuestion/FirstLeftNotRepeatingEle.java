package StringsQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLeftNotRepeatingEle {

	static final int CHAR = 256;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "geeksforgeeks";

		System.out.println(optimisedSolution(str));
		System.out.println("--------------------------------------------");
		System.out.println(efficientSol(str));
	}

	private static int efficientSol(String str) {
		int count[] = new int[CHAR];
		Arrays.fill(count, -1);

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == -1) {
				count[str.charAt(i)] = i;
			} else {
				count[str.charAt(i)] = -2;
			}
		}
		
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= 0) {
				res = Math.min(res, count[i]);
			}
		}

		return (res == Integer.MAX_VALUE) ? -1 : res;
	}

	private static int optimisedSolution(String str) {
		int count[] = new int[CHAR];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}

}

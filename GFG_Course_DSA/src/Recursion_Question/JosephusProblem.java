package Recursion_Question;

public class JosephusProblem {

	public static void main(String[] args) {

		/*
		 * question states that there is given n people and killing number that means
		 * kth number person will get killed and counting of people will always start
		 * from 0 and will end at n-1; at last only one person will left and that will
		 * be our answer.
		 */
		int n = 5;
		int k = 3;

		System.out.println(joseph(n, k));
	}

	private static int joseph(int n, int k) {

		if (n == 1) {
			return 0;
		} else {
			return (joseph(n - 1, k) + k) % n;
		}
	}

}

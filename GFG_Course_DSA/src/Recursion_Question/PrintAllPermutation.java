package Recursion_Question;

public class PrintAllPermutation {

	public static void main(String[] args) {

		String str = "ABC";
		int indx = 0;

		printPermutation(str, indx);
	}

	private static void printPermutation(String str, int indx) {

		if (indx == str.length() - 1) {
			System.out.println(str);
			return;
		}

		for (int j = indx; j < str.length(); j++) {
			str = swapChar(str, indx, j);
			printPermutation(str, indx + 1);
			str = swapChar(str, indx, j);
		}
	}

	private static String swapChar(String str, int i, int j) {

		char arr[] = str.toCharArray();

		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return String.valueOf(arr);

	}

}

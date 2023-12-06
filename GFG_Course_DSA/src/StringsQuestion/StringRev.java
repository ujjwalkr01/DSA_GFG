package StringsQuestion;

public class StringRev {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		String str = "Hi my name is Ujjwal";

		String res = revWord(str);
		System.out.println(res);
	}

	public static String revWord(String str) {

		String arr[] = str.split(" ");

		int low = 0, high = arr.length - 1;

		while (low < high) {
			String temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		String res = "";
		for (int i = 0; i < arr.length; i++) {

			arr[i] = revEachWord(arr[i]);

			if (i != arr.length - 1) {
				res += arr[i] + " ";
			} else {
				res += arr[i];
			}
		}
		return res;
	}

	public static String revEachWord(String word) {
		char arr[] = word.toCharArray();

		int low = 0, high = arr.length - 1;
		String res = "";
		while (low < high) {
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		return new String(arr);
	}

}

package StringsQuestion;

import java.util.Scanner;

public class CheckIfStringRotations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		if (checkSubstringAfterRotation(str1, str2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	private static boolean checkSubstringAfterRotation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		if(str1.length()<=2 || str2.length()<=2) {
			return (str1.equals(str2));
		}

		String clock_rot = "";
		String antiClock_rot = "";
		int len = str1.length();

		clock_rot = str1.substring(len - 2) + str1.substring(0, len - 2);
		System.out.println(clock_rot);

		antiClock_rot = str1.substring(2, len) + str1.substring(0, 2);
		System.out.println(antiClock_rot);

		if(str2.equals(antiClock_rot)||str2.equals(clock_rot)) {
			return true;
		}else {
			return false;
		}
	}

}

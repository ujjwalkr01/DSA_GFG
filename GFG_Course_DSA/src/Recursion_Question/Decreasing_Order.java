package Recursion_Question;

public class Decreasing_Order {

	public static void main(String[] args) {

		int n = 5;
		fun(n); //decreasing order.....
		System.out.println("-------------------------------");
		fun1(n); //increasing order.....
	}

	public static void fun(int n) {

		if (n == 0)
			return;
		System.out.println(n);
		fun(n - 1);
	}

	public static void fun1(int n) {
		if (n == 0)
			return;
		fun1(n - 1);
		System.out.println(n);
	}
}

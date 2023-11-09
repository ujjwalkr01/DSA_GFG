package Recursion_Question;

public class TowerOfHanoi {

	public static void main(String[] args) {

		int n = 3;

		towerOfHanoi(n, 'A', 'B', 'C');
	}

	private static void towerOfHanoi(int n, char a, char b, char c) {

		if (n == 1) {
			System.out.println("move 1 from " + a + " to " + c);
			return;
		}

		towerOfHanoi(n - 1, a, c, b);// keeping c as auxilary tower.

		System.out.println("move " + n + " from " + a + " to " + c);

		towerOfHanoi(n - 1, b, a, c); // keeping b as auxilary tower
	}

}

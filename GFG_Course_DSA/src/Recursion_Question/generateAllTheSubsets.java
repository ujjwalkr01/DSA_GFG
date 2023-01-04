package Recursion_Question;

import java.util.ArrayList;
import java.util.List;

public class generateAllTheSubsets {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3 };

		subset(num);
	}

	private static void subset(int[] num) {

		List<List<Integer>> res = new ArrayList<>();

		generateSubset(num, res, new ArrayList<>(), 0);

	}

	private static void generateSubset(int[] num, List<List<Integer>> res, List<Integer> path, int i) {

		if (i == num.length) {
			res.add(path);
			System.out.println(res);
			return;
		}

		path.add(num[i]);
		generateSubset(num, res, path, i + 1); // include...

		path.remove(path.size() - 1); // backtracking..

		generateSubset(num, res, path, i + 1); // exclude

	}

}

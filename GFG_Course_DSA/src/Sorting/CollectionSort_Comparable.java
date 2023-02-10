package Sorting;

import java.util.*;

class Pointss implements Comparable<Pointss> {

	int x, y;

	public Pointss(int x, int y) {
		this.x = x;
		this.y = y;
	}
//compareTo defining the sorting nature based on the x coordinate
	public int compareTo(Pointss p) {

		return this.x - p.x;
	}
}

public class CollectionSort_Comparable {

	public static void main(String[] args) {

		List<Pointss> list = new ArrayList<>();
		list.add(new Pointss(5, 20));
		list.add(new Pointss(2, 30));
		list.add(new Pointss(6, 40));
//list is sorted in natural order
		Collections.sort(list);

		for (Pointss p : list) {
			System.out.println(p.x+" "+p.y);
		}
	}

}

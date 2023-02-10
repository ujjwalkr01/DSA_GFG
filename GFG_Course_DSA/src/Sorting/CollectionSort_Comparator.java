package Sorting;

import java.util.*;

class Ponts{
	int x, y;
	
	public Ponts(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Mycompar implements Comparator<Ponts> {

//compareTo defining the sorting nature based on the x coordinate

	@Override
	public int compare(Ponts p1, Ponts p2) {

		return p1.x - p2.x;
	}
}

public class CollectionSort_Comparator {

	public static void main(String[] args) {

		List<Ponts> list = new ArrayList<>();
		list.add(new Ponts(5, 20));
		list.add(new Ponts(2, 30));
		list.add(new Ponts(6, 40));
//list is sorted in natural order
		Collections.sort(list, new Mycompar());

		for (Ponts p : list) {
			System.out.println(p.x + " " + p.y);
		}
	}

}

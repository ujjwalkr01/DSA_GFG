package Sorting;

import java.util.*;

//A user defined Points class that doesn't implement the comparable interface
// and hence this class objects are not comparable
class Points {
	int x, y;

	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//this class implements the comparator interface to compare 
class Mycomp implements Comparator<Points> {

	// sorts the point object according to the x-coordinate in natural order
	@Override
	public int compare(Points p1, Points p2) {
		return p1.x - p2.x;
	}

}

public class ArraysSort_NonPrimitiveComparator {

	public static void main(String[] args) {

		Points arr[] = { new Points(10, 20), new Points(3, 12), new Points(5, 7) };
		// sorting the array of objects by passing the object
		Arrays.sort(arr, new Mycomp());

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].x + " " + arr[i].y);
		}
	}

}

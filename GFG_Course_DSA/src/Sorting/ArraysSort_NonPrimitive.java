package Sorting;

import java.util.*;

//A user defined Point class implementing the comparable interface 
class Point implements Comparable<Point> {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//compareTo() function defining the nature of sorting using x-coordinate
	@Override
	public int compareTo(Point p) {
//comparing the two object by subtracting the current object and passed object
		System.out.print(this.x - p.x+" ");
		return this.x - p.x;
	}
}

public class ArraysSort_NonPrimitive {

	public static void main(String[] args) {

		Point arr[] = { new Point(10, 20), new Point(3, 12), new Point(5, 7) };
		// sorting the array of objects
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].x + " " + arr[i].y);
		}
	}

}

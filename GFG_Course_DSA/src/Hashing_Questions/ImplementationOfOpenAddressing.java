package Hashing_Questions;

import java.util.ArrayList;
import java.util.LinkedList;

class My_hash {

	int arr[];
	int cap, size;

	public My_hash(int b) {
		this.cap = b;
		int size = 0;
		arr = new int[cap];

		for (int i = 0; i < cap; i++) {
			arr[i] = -1;
		}
	}

	int hash(int key) {
		return key % cap;
	}

	boolean insert(int key) {
		if (size == cap)
			return false;
		int i = hash(key);
		while (arr[i] != -1 && arr[i] != -2 && arr[i] != key)
			i = (i + 1) % cap;
		if (arr[i] == key)
			return false;
		else {
			arr[i] = key;
			size++;
			return true;
		}
	}

	boolean search(int key) {
		int h = hash(key);
		int i = h;
		while (arr[i] != -1) {
			if (arr[i] == key)
				return true;
			i = (i + 1) % cap;
			if (i == h)
				return false;
		}
		return false;
	}

	boolean erase(int key) {
		int h = hash(key);
		int i = h;
		while (arr[i] != -1) {
			if (arr[i] == key) {
				arr[i] = -2;
				return true;
			}
			i = (i + 1) % cap;
			if (i == h)
				return false;
		}
		return false;
	}
}

public class ImplementationOfOpenAddressing {

	public static void main(String[] args) {

		My_hash mh = new My_hash(7);
		mh.insert(49);
		mh.insert(56);
		mh.insert(72);
		if (mh.search(56) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		mh.erase(56);
		if (mh.search(56) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

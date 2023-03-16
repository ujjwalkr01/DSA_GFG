package Hashing_Questions;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash {

	int bucket;
	ArrayList<LinkedList<Integer>> table;

	public MyHash(int b) {
		this.bucket = b;
		table = new ArrayList<>();

		for (int i = 0; i < b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}

	void insert(Integer key) {
		int i = key % bucket;
		table.get(i).add(key);
	}

	void delete(Integer key) {
		int i = key % bucket;
		table.get(i).remove(key);
	}

	boolean search(Integer key) {
		int i = key % bucket;
		return table.get(i).contains(key);
	}
}

public class ImplementationOfChaining {

	public static void main(String[] args) {

		MyHash mh = new MyHash(7);
		mh.insert(10);
		mh.insert(21);
		mh.insert(15);
		mh.insert(20);
		mh.insert(25);
		mh.insert(47);
		mh.insert(23);

		System.out.println(mh.search(25));
		mh.delete(25);
		System.out.println(mh.search(25));
	}

}

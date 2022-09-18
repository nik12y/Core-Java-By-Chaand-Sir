package com.collectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Names obj) {

		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return 1;
		}
		return -1; // this will reverse the names of countries
	}

}

public class ComparableInterface {

	public static void main(String[] args) {

		List<Names> names = new LinkedList<>();
		names.add(new Names("Russia"));
		names.add(new Names("Ukrain"));
		names.add(new Names("Japan"));
		names.add(new Names("England"));
		names.add(new Names("MohanJodado"));

		ComparableInterface com = new ComparableInterface();
		com.printList(names);
		System.out.println("\nAfter Sorting *****************8");
		Collections.sort(names);
		com.printList(names);

	}

	void printList(List<Names> list) {
		Iterator<Names> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("Elements :" + iterator.next());
		}

	}
}

package com.collectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		list.add("India");
		list.add("USA");
		list.add("Russia");
		list.add("America");
		list.add("Japan");
		
		System.out.println(list);
		System.out.println("****************");
		Sorting listSort=new Sorting();
		listSort.printList(list);
		
		System.out.println("\nSorted list****************");
		list.sort(null);
		listSort.printList(list);

		System.out.println("\nReverse list****************");
		Collections.reverse(list);
		listSort.printList(list);
		System.out.println("\nSoting using Collections list****************");
		
		//Sort using Collections
		Collections.sort(list);
		listSort.printList(list);
	
	}
	
	void printList(List<String> countries) {
		for(String names: countries) {
			System.out.println(names);
		}
	}
}

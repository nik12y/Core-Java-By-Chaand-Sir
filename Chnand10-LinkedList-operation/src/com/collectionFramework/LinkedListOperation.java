package com.collectionFramework;

import java.util.LinkedList;

public class LinkedListOperation {

	public static void main(String[] args) {

		LinkedList<String> countries = new LinkedList<String>();
		countries.add("India"); // 0
		countries.add("USA");   // 1
		countries.add("Canada");// 2
		countries.add("UK");    // 3

		System.out.println(countries);
		countries.add(1, "Banglore");
		System.out.println("New List of countries :" + countries);

		System.out.println("*******************************************");
		System.out.println(countries.contains("India"));

		System.out.println("*******************************************");
		countries.remove(4);
		System.out.println("New List of countries after remove:" + countries);
		
		System.out.println("*******************************************");
		
		countries.set(1, "Nainital");
		System.out.println("New List of countries :"+countries);
		for (String elements : countries) {
			System.out.println("Eelements :" + elements);
		}
//		
//		ArrayList<String>list=new ArrayList<String>();
//		list.add("India");
//		list.add("USA");
//		list.add("Canada");
//		list.add("UK");
//		System.out.println(list);

	}
}

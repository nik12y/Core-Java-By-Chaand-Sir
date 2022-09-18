package com.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListInterface {

	public static void main(String[] args) {
		//List can extends ArrayList as well as LinkedList
		List<String> countries=new LinkedList<>();
		countries.add("India"); // 0
		countries.add("USA");   // 1
		countries.add("Canada");// 2
		countries.add("UK");    // 3
		System.out.println(countries);
		
		System.out.println("****************88888888");
		List<String>list=new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("Canada");
		list.add("UK");
		System.out.println(list);
		new ListInterface().printList(list);
	}
	
	void printList(List<String> list) {
		for(String element:list) {
			System.out.println(element);
		}
	}
}

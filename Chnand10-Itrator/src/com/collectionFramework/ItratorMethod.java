package com.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class ItratorMethod {

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
		new ItratorMethod().printList(list);
	}
	
	void printList(List<String> list) {
//		for(String element:list) {
//			System.out.println(element);
//		}
		
		//Iterator<String> iterator=list.listIterator();
		ListIterator<String> iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element :"+iterator.next());
		}
	}
}





















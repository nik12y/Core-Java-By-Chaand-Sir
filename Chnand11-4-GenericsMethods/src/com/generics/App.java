package com.generics;

import java.util.LinkedList;
import java.util.List;

class Data{
	
	public <E> void printListData(List<E> elements) {
		for(E listData : elements) {
			System.out.println(listData);
		}
	}
	
	public <E> void printArrayData(E[] elements) {
		for(E arrayData : elements) {
			System.out.println(arrayData);
		}
	}
	
}


public class App {

	public static void main(String[] args) {
	 System.out.println("List of ListDataValue**********");
		List<Integer> listDataValue=new LinkedList<Integer>();
		listDataValue.add(1);
		listDataValue.add(2);
		listDataValue.add(3);
		listDataValue.add(4);
		listDataValue.add(5);
		Data data=new Data();
		data.printListData(listDataValue);
		
		System.out.println("\nList of ListDataString**********");
		List<String> listDataString=new LinkedList<String>();
		listDataString.add("One");
		listDataString.add("Two");
		listDataString.add("Three");
		listDataString.add("Four");
		listDataString.add("Five");
		data.printListData(listDataString);
		
		System.out.println("\nList of ArrayDataString**********");
		String[] stringArray= {"Nik" ,"Rohan","Mohan"};
		data.printArrayData(stringArray);
		
		System.out.println("\nList of ArrayDataInteger**********");
		Integer[] integerArray= {11,22,44,55,66};
		data.printArrayData(integerArray);
		
	}
}




















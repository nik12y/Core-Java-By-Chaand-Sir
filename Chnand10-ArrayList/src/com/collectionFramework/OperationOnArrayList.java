package com.collectionFramework;

import java.util.ArrayList;

public class OperationOnArrayList {

	static ArrayList<String> listNames = new ArrayList<String>();

	public static void main(String[] args) {

		listNames.add("Chaand");
		listNames.add("Rohan");
		listNames.add("Mohan");
		listNames.add("Kiran");
		listNames.add("Ninna");
		listNames.add("Ramesh");
		OperationOnArrayList list = new OperationOnArrayList();
		
		//Displaying the names
		list.displayList(listNames);
		System.out.println("******************\n");
		
		//Removing the Names By Position
		list.removeNameByPosition(0);
		list.displayList(listNames);

		System.out.println("******************\n");
		
		//now  see the number allocated after removing the elements
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
		
		System.out.println("******************\n");
		
		//Removing the Names by Names
		list.removeStringByName("Rohan");
		list.displayList(listNames);
		System.out.println("******************\n");
		
		//now  see the number allocated after removing the elements
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
	}

	// Display list using forEach loop
	void displayList(ArrayList<String> listOfNames) {
		for (String names : listOfNames) {
			System.out.println(names);
		}
	}

	// position(i.e remove by index)
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}

	void removeStringByName(String name) {
		listNames.remove(name);
	}
}

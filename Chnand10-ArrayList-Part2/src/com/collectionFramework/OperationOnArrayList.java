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
		
		System.out.println("Display the list *********");
		list.displayList(listNames);
		
		System.out.println("\nDisplay the Updated list *********");
		list.modifyName(2, "NanaPatekar");
		list.displayList(listNames);
		
		System.out.println("\nDisplay the search from list *********");
		//As we know it is string and I want integer value so parse it 
		int position =list.searchByName("Ninna");
		if(position!=-1) {
			list.modifyName(position, "Murali");
			list.displayList(listNames);
		}else {
		System.out.println("Invalid Entry");
		}
	}

	// Display list using forEach loop
	void displayList(ArrayList<String> listOfNames) {
		for (String names : listOfNames) {
			System.out.println(names);
		}
	}

	void modifyName(int position, String name) {

		listNames.set(position, name);
	}

	int searchByName(String name) {
		// here i want index of names
		return listNames.indexOf(name);
	}
}

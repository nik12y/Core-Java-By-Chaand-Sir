package com.javaForEachArray;

public class InitialiseArray {

	public static void main(String[] args) {

		String[] stringArray = { "Chaand", "Jhon", "Nik", "Doe", "Ankit", "Mohan" };
		// Using for loop
		for (int i = 0; i <= 4; i++) {
			System.out.println(stringArray[i]);
		}
		// Now to know the length of an array
		System.out.println(stringArray.length);

		// using length method in for loop
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		//using for Each loop
		for(String name:stringArray) {
			System.out.println(name);
		}
	}
}

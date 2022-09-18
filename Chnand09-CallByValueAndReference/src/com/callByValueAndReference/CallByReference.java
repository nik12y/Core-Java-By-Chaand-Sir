package com.callByValueAndReference;

public class CallByReference {

	public static void main(String[] args) {
		String[] names = { "Chaand", "Mohan", "Nik", "Jhon", "Doe" };
		System.out.println(names);
		CallByReference callByReference = new CallByReference();
		System.out.println(names[0]);
		callByReference.displayValue(names);
	
	}

	void displayValue(String[] names) {
		names[0] = "salim";
		for (String name : names) {
			System.out.println(name);
		}

	
	}
}

package com.callByValueAndReference;

public class CallByValue {

	public static void main(String[] args) {
		int value = 10;
		System.out.println("Current value of main method is :" + value);
		
		CallByValue displayValue = new CallByValue();
		
		displayValue.displayValue(value);
		System.out.println("Current value of main(display) method is :" + value);

	}

	void displayValue(int value) {
		System.out.println("Current value of display method is :" + value);
		value = 20;
		System.out.println("update the value of value is :" + value);

	}
}

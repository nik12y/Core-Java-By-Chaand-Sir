package com.switchCase;

public class SwitchCasePart2Char {

	public static void main(String[] args) {
		// float x= 1.0f; is not working
		char x = 'B';
		// now if Upper and lower case is use in switch case we can do one thing
		switch (x) {
		case 'a':
		case 'A':
			System.out.println("Fresh Mango");
			break;
		case 'b':
		case 'B':
			System.out.println("Mango is 100 Rupees per kg");
			break;
		case 'c':
		case 'C':
			System.out.println("Ok give  me 2 kg");
			break;
		default:
			System.out.println("Give me changes of 1000 ");
		}
	}
}

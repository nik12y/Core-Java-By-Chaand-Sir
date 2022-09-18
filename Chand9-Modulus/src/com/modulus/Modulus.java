
package com.modulus;

public class Modulus {

	public static void main(String[] args) {

		int value = 1234;
		System.out.println(value/10);
		int sumOfDigit = 0;
		while (true) {
			sumOfDigit = sumOfDigit + value % 10;
			value = value / 10;
			if (value < 10) {
				System.out.println("Hi");
				break;
			}
		}
		sumOfDigit =sumOfDigit+ value;
		System.out.println("SUmOFDigit is "+sumOfDigit);
	}

}

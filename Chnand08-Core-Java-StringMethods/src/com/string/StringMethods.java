package com.string;

public class StringMethods {

	public static void main(String[] args) {
		String x = "Study";
		String y = "easy";
		// String z = x + y;
		String z = x.concat(y);
		System.out.println(z);

		if (z.equals(z)) {
			System.out.println("Text is match");
		} else {
			System.out.println("Text is not match");
		}
	}
}

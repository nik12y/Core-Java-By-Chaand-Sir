package com.stringcompression.withNumbers;

import java.util.Scanner;

public class StringWithNumberAddCompression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the Charcter");
		String nextChar = scn.next();
		System.out.println(compressAddNumber(nextChar));
		}
	

	// aaabbbrrdfffeeskk
	// a3b3r2df3e2sk2

	private static String compressAddNumber(String str) {
		String s = str.charAt(0) + "";
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			char previou = str.charAt(i - 1);
			
			if (current == previou) {
				count++;
			} else {
				if (count > 1) {
					s += count;
					count = 1;
				}
				s += current;
			}
		}
		if (count > 1) {
			s += count;
			count = 1;

		}

		return s;

	}
}

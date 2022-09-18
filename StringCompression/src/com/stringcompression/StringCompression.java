package com.stringcompression;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the Charcter");
		String nextChar = scn.next();
		System.out.println(compress1(nextChar));
	}

	public static String compress1(String str) {
		String s = str.charAt(0) + "";// the purpose of adding empty string into charAt because it convert char to
										// string
		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			char previous = str.charAt(i - 1);
			if (current != previous) {
				s = s + current;// or s+=current
			}
		}
		return s;
	}
}

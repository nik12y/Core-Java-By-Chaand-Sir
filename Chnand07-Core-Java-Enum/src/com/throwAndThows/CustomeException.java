package com.throwAndThows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomeException {

	public static void main(String[] args)  {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("throws FileNotFoundException");
		}
	}
	public static void someMethod() throws FileNotFoundException {
		FileReader file=new FileReader("file.txt");
		System.out.println("Exception FileNotFound");
	}
}

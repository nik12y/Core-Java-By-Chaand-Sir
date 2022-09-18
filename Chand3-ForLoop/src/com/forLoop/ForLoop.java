package com.forLoop;

public class ForLoop {
	static int x = 10;

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println("Value of i is " + i);
		}
		System.out.println("\n______________--\n");
		// for prime number
		for (int x = 1; x <= 100; x++) {
			if(x%2==1) {
				System.out.println("the no. is  prime "+x);
		}
		}
	}
}

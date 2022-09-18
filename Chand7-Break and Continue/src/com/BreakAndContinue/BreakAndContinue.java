package com.BreakAndContinue;

public class BreakAndContinue {
	static int x = 10;

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i is " + i);
			if(i==5) {
			//	System.out.println(i);
				//break; it will take only 5 inputs
				//continue; it will take whole value
			}
		}
	}
}

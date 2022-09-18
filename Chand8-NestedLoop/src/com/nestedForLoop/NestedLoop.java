package com.nestedForLoop;

public class NestedLoop {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('2');
			}
			System.out.println(" ");
		}
		for(int i=5; i>=1;i--) {//for outer loop row
			for(int j=1;j<=i;++j) {//for inner loop column
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<=5;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("N"+"i"+"k"+"h"+"i"+"l");
			}
			System.out.println(" ");
		}
	}
	/*
	 * @
	 * 
	 * @@
	 * 
	 * @@@
	 * 
	 * @@@@
	 * 
	 * @@@@@
	 * 
	 */

}

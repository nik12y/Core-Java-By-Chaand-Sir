package com.switchCase;

public class SwitchCasePart1 {

	public static void main(String[] args) {
	
		int x=5;
		
		switch(x) {
		case 1:
			System.out.println("Fresh Mango");
			break;
		case 2:
			System.out.println("Mango is 100 Rupees per kg");
			break;
		case 3:
			System.out.println("Ok give  me 2 kg");
			break;	
		default:
			System.out.println("Give me changes of 1000 ");
		}
	}
}

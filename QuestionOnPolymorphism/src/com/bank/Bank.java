package com.bank;

public class Bank {

	public void print() {
		System.out.println("Print bankPassbook in bank");
	}
	
}

class SbiBank extends Bank{
	public void print() {
		System.out.println("print pass book from sbi bank");
	}
}

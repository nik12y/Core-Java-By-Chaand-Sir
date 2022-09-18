package com.polymorphism.phones;

public class Nokia extends Phone {

	public Nokia(String model) {
		super(model);
	}

	private String model;
	
	public void features() {
		System.err.println("Nice feature and build quality");
	}
	
}

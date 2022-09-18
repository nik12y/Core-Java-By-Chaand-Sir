package com.polymorphism.phones;

public class Phone {

	private String model;
	
	public Phone(String model) {
		this.model=model;
	}

	public String getModel() {
		return model;
	}
	
	public void features() {
		System.out.println("Nokia old model");
	}
}

package com.core.java.inteface;

public class OnePlus5 implements Phone {

	@Override
	public String processor() {
		return "SD865";
	}

	@Override
	public String os() {
		return "android";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}

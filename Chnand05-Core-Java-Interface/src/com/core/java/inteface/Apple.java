package com.core.java.inteface;

public class Apple implements Phone{

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String os() {
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 256;
	}

}

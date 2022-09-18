package com.mainAbstract;

public abstract class Person implements Alive, LiveLife {

	public void speak() {
		System.out.println("Share his/her thoughts");
	}

	public abstract void eat();
	public void breath() {
		System.out.println("take long breath");
	}
	@Override
	public void message() {
		System.out.println("Life is  journey you can start from sratch");
	}
}

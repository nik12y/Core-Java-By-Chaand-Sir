package com.encapsulation;

public class MainRunner {

	public static void main(String[] args) {
		/*
		 * Person person = new Person(); System.out.println(person);
		 * System.out.println(person.getAge());
		 */

		Person john = new Person("Nihal",20,"Nag");
		john.setAge(-10);
		System.out.println(john);
	}
}

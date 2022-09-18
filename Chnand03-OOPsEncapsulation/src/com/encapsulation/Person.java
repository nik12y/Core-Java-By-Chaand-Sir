package com.encapsulation;

public class Person {
//Encapsulation is hiding of implementation detail of variables to safe it from direct use
	private String name;
	private int age;
	private String city;

	public Person(String name, int age, String city) {

		this.name = name;
		this.age = age;
		this.city = city;
	}

	public boolean setAge(int age) {
		if (age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}

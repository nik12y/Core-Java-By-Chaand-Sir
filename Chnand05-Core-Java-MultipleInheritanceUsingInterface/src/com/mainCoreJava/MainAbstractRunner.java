
package com.mainCoreJava;


import com.mainAbstract.NonVegon;
import com.mainAbstract.Person;
import com.mainAbstract.Vegon;

public class MainAbstractRunner {

	public static void main(String[] args) {
		Person person = new Vegon();
		person.speak();
		person.eat();
		
		Person person1 = new NonVegon();
		person1.eat();
		person1.speak();
		
		person.breath();
	}
}

package com.sets;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Chaand");
		set.add("Mia");
		set.add("Jhon");
		set.add("Armaan");
		set.add("Arif");
		set.add("Faizan");
		
		for(String name:set) {
			System.out.println(name);
		}
	  System.out.println(set.contains("Chaand"));
	}
}

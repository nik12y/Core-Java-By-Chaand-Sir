package com.animal.main;

import java.util.ArrayList;
import java.util.List;

import animal.fish.Eel;
import animal.fish.Fish;
import animal.java.Animal;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class AnimalMainRunner {

	public static void main(String[] args) {
		List<Animal> animals=new ArrayList<>();
		
		Animal animal=new Animal();
		Reptile reptile=new Reptile();
		Crocodile crocodile=new Crocodile();
		Fish fish=new Fish() ;
		Eel eel=new Eel();
		
		animals.add(animal);
		animals.add(reptile);
		animals.add(crocodile);
		animals.add(fish);
		animals.add(eel);
		listAnimals(animals);
	}
 
	public static void listAnimals(List<Animal> animals) {
		for(Animal animal:animals) {
			System.out.println(animal.showInfo());
		}
	}
}

















package com.lambdaExpresion;

@FunctionalInterface
public interface MyInter {

	//To Show it is FunctionalInterface by doing @FunctionalInterface ANnotation before the class
	//It consist of only  one abstract method
	
	public abstract void sayHello();
	
	//we can call this interface by Two way
	//1. By creating Implementation class
	//2. By Calling from main method by creating Parent class Object 
}

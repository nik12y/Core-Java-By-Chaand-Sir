package com.generics;

class Demo {

	private Object obj;

	public Demo(Object theObject) {
		this.obj = theObject;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Demo [obj=" + obj + "]";
	}

}

class GenericValue<T> {
	private T apple;

	public GenericValue(T theApple) {
		this.apple = theApple;
	}

	public T getApple() {
		return apple;
	}
}

public class GenericsClass {

	public static void main(String[] args) {

		Demo data = new Demo("Nik");
		String name = (String) data.getObj();
		System.out.println(name);

		
	//	GenericValue gv = new GenericValue("Rohan");//It gives warning
		GenericValue<String> gv = new GenericValue<String>("Rohan");
		 String  newApple = (String)gv.getApple();
		 System.out.println(newApple);
	}
}

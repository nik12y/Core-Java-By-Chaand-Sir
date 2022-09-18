package com.lambdaExpresion;

public class WorkMain {

	public static void main(String[] args) {

	/*	MyInter my = new MyInterImpl();
		my.sayHello();

		// By 2nd method Creating Anonymous class of parent Interface
		MyInter i = new MyInter() {

			@Override
			public void sayHello() {
				System.out.println("I am calling from Anonymous class");
			}
		};
		i.sayHello();
	} */
		//Also call by lambda expresion
		MyInter i=()->{System.out.println("I am calling from lambda expresion");
		System.out.println("I am calling from lambda expresion");};
		i.sayHello();
	}
	
	
}

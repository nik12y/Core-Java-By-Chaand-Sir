package com.lambda;

interface Lambda{
	public void demo();
}

public class App {

	public static void main(String[] args) {
		
	/*	Lambda lambda=new Lambda() {
		
	//This is the old method to show o/p now we use lambda for the same
			@Override
			public void demo() {
				System.out.println("Statement 1");
			}
			}; */
		Lambda lambda=()->{System.out.println("Statement 1");
		                   System.out.println("Statement 2 ");
		                  };
		lambda.demo();
	}
}

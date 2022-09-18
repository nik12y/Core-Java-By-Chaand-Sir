package com.learn;

enum Level {
	TOP, MEDIUM(10), BOTTOM(30, 40);

	int i, j;

	private Level() {

	}

	private Level(int i) {
		this.i = i;
	}

	private Level(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class MainRunner {

	public static void main(String[] args) {

		System.out.println(Level.TOP);
		System.out.println(Level.TOP.i);
		System.out.println(Level.MEDIUM.i);
		System.out.println(Level.MEDIUM.i);

		System.out.println(Level.BOTTOM.i);
		System.out.println(Level.BOTTOM.j);
		/*
		 * LearningEnum learn = LearningEnum.COLLECTION; switch (learn) { case
		 * COLLECTION: System.out.println("Step 2: Learn CollectionFrame Work"); break;
		 * case COREJAVA: System.out.println("Step 1: Learn CoreJava "); break; case
		 * GENERICS: System.out.println("Step 3: Learn Generics"); break; case
		 * JSPANDSERVLET: System.out.println("Step 5: Learn JSPANDSERVLET"); break; case
		 * MULTITHREADING: System.out.println("Step 4: Learn MULTITHREADING"); break;
		 * default: break;
		 * 
		 * }
		 */
	}
}

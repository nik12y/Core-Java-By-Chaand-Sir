package org.scope;

public class Scope {
	static int i = 20;

	public static void main(String[] args) {
//
//	int i;
		for (i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("::::::::::::::::::::::");
		
		System.out.println(i);
		System.out.println("::::::::::::::::::::::");
//		Scope s=new Scope();
//		System.out.println(s.i);
	}

}


package com.methods;

public class MethodsOverLoading {

	public static void main(String[] args) {
	System.out.println("Adding 1 and 2 is sum is : "+sum(1, 2));
	System.out.println("Adding 5 and 6.5f is sum is : "+sum(5, 6.5f));	
	System.out.println("Adding 5.45 and 6.5f is sum is : "+sum(5.45, 7.85f));	
	System.out.println("Adding 1 and 2 is sum is : "+sum(1, 2, 4));
	}
	
	public static int sum(int x ,int y) {
		System.out.println("Adding 2 entities");
		return x+y;
	}
	
	public static float sum(int x ,float y) {
		System.out.println("\nAdding 1 int and 1 float entities");
		return x+y;
	}

	public static double sum(double x ,float y) {
		System.out.println("\nAdding 1 double and 1 float entities");
		return x+y;
	}	
	
	public static int sum(int x ,int y,int z) {
		System.out.println("\nAdding 3 int entities");
		return x+y+z;
	}

}

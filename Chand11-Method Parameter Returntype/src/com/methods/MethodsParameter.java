
package com.methods;

public class MethodsParameter {

	public static void main(String[] args) {
		loop1();
		System.out.println("+++++++++++++++");
		loop2();
		System.out.println("+++++++++++++++");
		loopMehtod(20, 40);
		System.out.println("Area of reactanle 12.35 and 15.321 = "+areaReactangle(12.35, 15.321));
		double areaOfReactangle = areaReactangle(12.35, 15.321);// it will not directly print for that create object of
																// it
		System.out.println(areaOfReactangle);
	}

	// now we use return type
	public static double areaReactangle(double length, double breath) {
		return length * breath;
	}

	public static void loop1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}

	}

	public static void loop2() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	// Parameter methods
	public static void loopMehtod(int start, int finalValue) {
		while (start <= finalValue) {
			System.out.println(start);
			start++;
		}
	}

}

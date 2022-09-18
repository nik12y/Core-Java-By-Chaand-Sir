
package com.methods;

public class MethodsOverLoading {

	public static void main(String[] args) {
	
		System.out.println("Area of reactanle 12.35 and 15.321 = "+areaReactangle(12.35, 15.321));
		 areaReactangle(12.35, 15.321);// it will not directly print for that create object of // it
																
		System.out.println("Area of reactangle: "+areaReactangle(5.0d));
		System.out.println("Area of square: "+areaSquare(4));
	}

	// now we use return type
	public static double areaReactangle(double length, double breath) {
		return length * breath;
	}
	
	public static double areaReactangle(double side) {
		return side*side;
	}
	public static int areaSquare(int side) {
		return side*side;
	}
	


}

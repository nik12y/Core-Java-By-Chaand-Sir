package com.javaArray;

public class InitialiseArray {

	public static void main(String[] args) {
		
		int[] newArray= new int[10];
		newArray[9]=99;
		System.out.println(newArray[9]);
		               // 0,1,2,3,4,5,6,7,8
		int [] intArray= {1,2,3,4,5,6,7,8,9};
		System.out.println(intArray[8]);
		
		float[] floatArray= {1.0f,2.05f,3.65f};
		System.out.println(floatArray[2]);
	}
}

package com.exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		case1(10,5);
		System.out.println("**************");
		case2(10,0);
	}
	
	//Here we handle exception using condition
	public static void case1(int x, int y) {
		if(y!=0) {
			System.out.println(x/y);
		}else {
		System.out.println("The value of y is 0");
		}
	}

	//Here we handle exception using try catch
	public static void case2(int x , int y) {
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.println("The value of y is 0");
		}
	}
}

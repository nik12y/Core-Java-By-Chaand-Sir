package com.exceptionHandling;

public class MultiTryCatch {

	static int x,y=5;
	public static void main(String[] args) {
		try {
			System.out.println("Run Before exception");
			x=(y=10*10)/0;
			System.out.println("RUn excecute");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithematic Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(y);
	}
	

}

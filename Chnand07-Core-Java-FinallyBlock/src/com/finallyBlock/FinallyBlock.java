package com.finallyBlock;

public class FinallyBlock {

	public static void main(String[] args) {

		int x=10;
		try {
			System.out.println("What is exception :" +x/0);
		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("RuntimeException");
		}catch (Exception e) {
          System.out.println("Exception ");
		}finally {
			System.out.println("Finally block  will execute");
		}
	}
}

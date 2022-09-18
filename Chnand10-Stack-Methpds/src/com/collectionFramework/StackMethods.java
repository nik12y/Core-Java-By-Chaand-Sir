package com.collectionFramework;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {

		Stack<Integer> demo = new Stack<Integer>();
		System.out.println("Before pop");
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);// LIFO (last-in-first-out)
	    demo.push(100);
//		for (Integer temp : demo) {
//			System.out.println(temp);
//		}
//		
//		demo.pop();
//
//		System.out.println("\nIt gives top value in the stack after LIFO "+demo.peek());
//		System.out.println("\nAfter pop");
//		
//		for (Integer temp : demo) {
//			System.out.println(temp);
//		}
//      Now check whether the stack is empty or not
		if(demo.isEmpty()) {
			System.out.println("stack is  empty");
		}else {
			System.out.println("stack is not empty");
		}
		
	 
		System.out.println(demo.search(100));

	}
}

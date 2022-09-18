
package com.methods;

public class Methods {

	public static void main(String[] args) {
		loop1();
		System.out.println("+++++++++++++++");
		loop2();
		System.out.println("+++++++++++++++");
		loopMehtod(20, 40);
	}
	
	public static void loop1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}
		
	}
	public static void loop2() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	//Parameter methods
	public static void loopMehtod(int start,int finalValue) {
		while(start<=finalValue) {
			System.out.println(start);
			start++;
		}
	}

}

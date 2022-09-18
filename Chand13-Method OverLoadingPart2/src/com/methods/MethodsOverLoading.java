
package com.methods;

public class MethodsOverLoading {

	public static void main(String[] args) {

		int num = 7;
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			temp = num % i;//remainder is temp=1
			if (temp == 0) {
				isPrime = false;
				break;
			}

		}
		// if it is not 0 then it is prime number
		if (isPrime) {
			System.out.println(num + "- Is prime Number");
		} else {
			System.out.println(num + "- Is not  prime Number");
		}
	}
}

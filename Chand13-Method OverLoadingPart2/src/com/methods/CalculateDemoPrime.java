package com.methods;

import com.calculateprimeNumber.Calculate;

public class CalculateDemoPrime {

	public static void main(String[] args) {
		Calculate prime =new Calculate();
		if(prime.isPrime(77)) {
			System.out.println("Number passed is prime ");
		}else {
			System.out.println("Number passed is not  prime ");
		}
		System.out.println("\n****OutPut Of fload and double \n");
		if(prime.isPrimeFloat(10)) {
			System.out.println("Number passed is prime ");
		}else {
			System.out.println("Number passed is not  prime ");
		}
	}
}

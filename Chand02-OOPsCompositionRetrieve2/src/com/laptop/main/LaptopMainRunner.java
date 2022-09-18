package com.laptop.main;

import com.laptop.Laptop;

public class LaptopMainRunner {

	public static void main(String[] args) {
		Laptop lappy=new Laptop();
		//retrieve data from processor and graphics
		
		System.out.println(lappy.getProcessor().getCores());
		System.out.println(lappy.getProcessor().getBrand());
		
		System.out.println("\n"+lappy.getGraphics().getMemory());
	}
}

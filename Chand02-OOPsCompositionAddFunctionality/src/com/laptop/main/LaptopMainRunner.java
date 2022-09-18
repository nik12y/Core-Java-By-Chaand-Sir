package com.laptop.main;

import com.laptop.Laptop;
import com.laptop.graphics.Graphics;
import com.laptop.processor.Processor;

public class LaptopMainRunner {

	public static void main(String[] args) {
		
		Processor processor=new Processor("intel", "125U", 5, 8, 4, "1.5Ghz", "2.5Ghz", "3.5Ghz", "350");    
	
		
		Graphics graphics=new Graphics("ICore", 540, "1TB");
		//call of Processor class with constructor
		Laptop gmaingLaptop=new Laptop(1.65f, "265GB", "251Hard", "optical678", "Awesome", processor, graphics);
	System.out.println(gmaingLaptop);
	
	gmaingLaptop.gameMode();
	System.out.println(gmaingLaptop.getProcessor().getFrequency());
	
	}
}

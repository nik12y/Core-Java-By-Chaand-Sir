package com.laptop;

import com.laptop.graphics.Graphics;
import com.laptop.processor.Processor;

public class Laptop {

	private float screen;
	private String ram;
	private String hardDrive;
	private String opticalDrive;
	private String keyboard;

	private Processor processor;
	private Graphics graphics;

	public Processor getProcessor() {
		return processor;
	}

	public Graphics getGraphics() {
		return graphics;
	}

	public Laptop() {
		
		this.screen = 5.6f;
		this.ram = "1028TB";
		this.hardDrive = "1TB";
		this.opticalDrive = "540GB";
		this.keyboard = "52 button";
		this.processor = new Processor();
		this.graphics = new Graphics();
	}

	public Laptop(float screen, String ram, String hardDrive, String opticalDrive, String keyboard,
			Processor processor, Graphics graphics) {
		// super();
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
		this.processor = processor;
		this.graphics = graphics;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDrive="
				+ opticalDrive + ", keyboard=" + keyboard + ", processor=" + processor + ", graphics=" + graphics + "]";
	}
	public String gameMode() {
		processor.setFrequency(processor.getFrequency());
		return "Success";
	}

}

package com.inheritance;

public class Vehical {

	private int wheels;
	private int fuleTank;
	private int seat;
	private String engine;
	private String lights;

	public Vehical() {
		this.engine = "Petrol";
		this.fuleTank = 45;
		this.lights = "Yello";
		this.seat = 4;
		this.wheels = 4;
	}

	public Vehical(int wheels, int fuleTank, int seat, String engine, String lights) {

		super();
		this.wheels = wheels;
		this.fuleTank = fuleTank;
		this.seat = seat;
		this.engine = engine;
		this.lights = lights;
	}

	public int getWheels() {
		return wheels;
	}

	public int getFuleTank() {
		return fuleTank;
	}

	public int getSeat() {
		return seat;
	}

	String getEngine() {
		return engine;
	}

	public String getLights() {
		return lights;
	}
	
	//We make only getters here because we initialize the value in default contructor
	
	

}

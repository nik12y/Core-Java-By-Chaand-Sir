package com.inheritance;

public class Truck extends Vehical {

	private String musicSystem;
	private int continer;
	private String airConditioner;
	private String steering;

	public Truck() {
		this.airConditioner = "Awesome";
		this.continer = 2;
		this.musicSystem = "I am Disco Dance";
		this.steering = "Freely Working";
	}

	public Truck(String musicSystem, int continer, String airConditioner, String steering) {
		super();
		this.musicSystem = musicSystem;
		this.continer = continer;
		this.airConditioner = airConditioner;
		this.steering = steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public int getContiner() {
		return continer;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public String getSteering() {
		return steering;
	}

}

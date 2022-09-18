package com.inheritance;

public class Car extends Vehical {
//Handle,Sterring , FuleTank, engine, Wheels,airCondition, MusicSystem,entertainmentSystem,SeatBelt,
	// lights, fridge,
	private String seatBelt;
	private String musicSystem;
	private String fridge;
	private String airCondition;
	private String entertainmentSystem;
	private String sterring;

	public Car() {
		this.airCondition = "Fresh Air";
		this.entertainmentSystem = "TV";
		this.fridge = "Chilled Water";
		this.musicSystem = "Songs";
		this.seatBelt = "Leather";
		this.sterring = "Circular";
	}

	public Car(String seatBelt, String musicSystem, String fridge, String airCondition, String entertainmentSystem,
			String sterring) {
		super();
		this.seatBelt = seatBelt;
		this.musicSystem = musicSystem;
		this.fridge = fridge;
		this.airCondition = airCondition;
		this.entertainmentSystem = entertainmentSystem;
		this.sterring = sterring;
	}

	public String getSeatBelt() {
		return seatBelt;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getFridge() {
		return fridge;
	}

	public String getAirCondition() {
		return airCondition;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public String getSterring() {
		return sterring;
	}

}

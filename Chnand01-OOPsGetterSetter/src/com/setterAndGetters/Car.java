package com.setterAndGetters;

public class Car {

	private String door;
	private String engine;
	private String driver;
	private int speed;
	
	public Car() {
//		door="open";
//		engine="off";
//		driver="absent";
//		speed=0;
		
	}
	public Car(String doors,String engine, String driver, int speed) {
		this.door=doors;
		this.engine=engine;
		this.driver=driver;
		this.speed=speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setDoor(String theDoor) {
		door = theDoor;
	}

	public String getDoor() {
		return door;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public String run() {
		if(door.equals("closed") && engine.equals("started")
				&& driver.equals("seated") && speed>0) {
		return "Running";
		}else {
			return "Not Running";
		}
		
	}
}












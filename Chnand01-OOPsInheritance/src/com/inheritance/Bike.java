package com.inheritance;

import java.util.Objects;

public class Bike extends Vehical {

	private String handle;

	public Bike() {
		this.handle = "Long";
	}

	public Bike(String handle, int wheels, int fuleTank, int seat, String engine, String lights) {

		super(wheels, fuleTank, seat, engine, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(handle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return Objects.equals(handle, other.handle);
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getWheels()=" + getWheels() + ", getFuleTank()=" + getFuleTank()
				+ ", getSeat()=" + getSeat() + ", getEngine()=" + getEngine() + ", getLights()=" + getLights()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

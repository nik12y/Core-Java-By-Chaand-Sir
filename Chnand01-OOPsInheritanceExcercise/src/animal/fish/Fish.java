package animal.fish;

import animal.java.Animal;

public class Fish extends Animal {

	protected boolean liveInWater;
	protected boolean gills;
	
	public Fish() {
		super();
		this.liveInWater=true;
		this.gills=true;
	}

	
	public String showInfo() {
		return "Fish [liveInWater=" + liveInWater + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", wightInKilos=" + wightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
}

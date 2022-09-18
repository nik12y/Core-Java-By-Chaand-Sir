package animal.reptile;

import animal.java.Animal;

public class Reptile extends Animal{

	protected String skin ,egg;
	protected boolean backBone;
	
	public Reptile() {
		heightInFeet=5;
		wightInKilos=20;
		animalType="reptile";
		bloodType="Cold";
		this.skin="soft Skin";
		this.egg="soft-shelled egg";
		this.backBone=true;
		
	}


	public String showInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backBone=" + backBone + ", heightInFeet=" + heightInFeet
				+ ", wightInKilos=" + wightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	

	
}

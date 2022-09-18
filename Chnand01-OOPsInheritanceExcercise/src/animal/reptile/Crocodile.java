package animal.reptile;

public class Crocodile extends Reptile {

	public Crocodile() {
		super();//here will change the soft-egg shelled to hard
		egg="hard Shelled";
		skin="Hard Skin";
	}

	
	public String showInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backBone=" + backBone + ", heightInFeet=" + heightInFeet
				+ ", wightInKilos=" + wightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
	
}

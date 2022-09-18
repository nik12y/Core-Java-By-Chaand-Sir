package animal.fish;

public class Eel  extends Fish{

	private String special;
	
	public Eel(String special) {
		super();
		this.special="Released Electric Shock";
	}
	public Eel() {
		
	}

	
	public String showInfo() {
		return "Eel [special=" + special + ", liveInWater=" + liveInWater + ", gills=" + gills + ", heightInFeet="
				+ heightInFeet + ", wightInKilos=" + wightInKilos + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
}

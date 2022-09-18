package animal.java;

/**
 * @author lenovo
 *
 */
public class Animal {

	protected float heightInFeet;
	protected float wightInKilos;
	protected String animalType;
	protected String bloodType;
	
	public Animal() {
		this.heightInFeet=10;
		this.wightInKilos=25;
		this.bloodType="Cold";
		this.animalType="Amphibian";
	}

	public String showInfo() {
		return "Animal [heightInFeet=" + heightInFeet + ", wightInKilos=" + wightInKilos + ", animalType=" + animalType
				+ ", bloodType=" + bloodType + "]";
	}

	@Override
	public String toString() {
		return "Animal [heightInFeet=" + heightInFeet + ", wightInKilos=" + wightInKilos + ", animalType=" + animalType
				+ ", bloodType=" + bloodType + "]";
	}
	
	
}

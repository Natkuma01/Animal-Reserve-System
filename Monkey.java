package MOD5;

// inherit from the RescueAnimal class
public class Monkey extends RescueAnimal {
	
	// set instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// constructor
	// add the attributes from RescueAnimal to the Monkey method
	public Monkey(
			String name, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength, String species) {
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
	}
	

	// Accessor Method for tail length
	public String getTailLength() {
		return tailLength;
	}
	// Mutator Method for tail length
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	// Accessor Method for monkey's height
	public String getHeight() {
		return height;
	}
	// Mutator Method for monkey's height
	public void setHeight(String height) {
		this.height = height;
	}
	
	//Accessor Method for body length
	public String getBodyLength() {
		return bodyLength;
	}
	// Mutator Method for body length
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	// Accessor Method for Monkey species
	public String getSpecies() {
		return species;
	}
	// Mutator Method for Monkey species
	public void setSpecies(String species) {
		this.species = species; 
	}
}

package MOD5;

public class Dog extends RescueAnimal {

    // Instance variable
	private String name;
    private String breed;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
    private String trainingStatus;
    private boolean reserved;
    private String inServiceCountry;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }
    
    public String getName() {
    	return name;
    }
    public void setName(String dogName) {
    	name = dogName;
    }
    
    // Accessor Method
    public String getBreed() {
        return breed;
    }
    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    
    public String getGender() {
    	return gender;
    }
    public void setGender(String dogGender) {
    	gender = dogGender;	
    }
    
    public String getAge() {
    	return age;
    }
    public void setAge(String dogAge) {
    	age = dogAge;
    }
    
    public String getWeight() {
    	return weight;
    }
    public void setWeight(String dogWeight) {
    	weight = dogWeight;
    }
    
    public String getAcquisitionDate() {
    	return acquisitionDate;
    }
    public void setAcquisitionDate(String dogAcquisitionDate) {
    	acquisitionDate = dogAcquisitionDate;
    }

    public String getAcquisitionCountry() {
    	return acquisitionCountry;
    }
    public void setAcquisitionCountry(String dogAcquisitionCountry) {
    	acquisitionCountry = dogAcquisitionCountry;
    }
    
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    public void setTrainingStatus(String dogTrainingStatus) {
    	trainingStatus = dogTrainingStatus;
    }
    
    public boolean getReserved() {
    	return reserved;
    }
    public void setReserved(boolean dogReserved) {
    	reserved = dogReserved;
    }
    
    public String getInServiceCountry() {
    	return inServiceCountry;
    }
    public void setInServiceCountry(String dogInServiceCountry) {
    	inServiceCountry = dogInServiceCountry;
    }

}

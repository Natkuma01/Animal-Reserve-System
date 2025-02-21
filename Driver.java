package MOD5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // create a monkey arraylist to store new Monkey objects in this list
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // Use scanner method to acquire user's input
    private static String option ="";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // create a loop for the menu, it stops the loop if user input is "q"
        // if user input is 1, direct user to intakeNewDog method
        // if user input is 2, direct user to intakeNewMonley method
        // if user input is 3, direct user to reserveAnimal method
        // if user input is  4/5/6, direct user to printAnimal method
        // if user input is not valid, display an error message and go back to the menu
        while (!option.equalsIgnoreCase("q")) {
        	displayMenu();
        	option = scanner.nextLine();
        	
        	switch(option) {
        	case"1":
        		intakeNewDog(scanner);
        		break;
        	case"2":
        		intakeNewMonkey(scanner);
        		break;
        	case"3":
        		reserveAnimal(scanner);
        		break;
        	case"4":
        		printAnimals("dog");
        		break;
        	case"5":
        		printAnimals("monkey");
        		break;
        	case"6":
        		printAnimals("available");
        		break;
        	default:
        		if (!option.equalsIgnoreCase("q")) {
        		System.out.println("Your input is not valid. Please try again.");
        		}
        		break;
        	}
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing    
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Donut","male", "4", "12", "02-05-2020", "United States", "Phase I", true, "United States", "2", "8", "35", "Capuchin");
    	Monkey monkey2 = new Monkey("Brownie", "female", "5", "22", "09-02-2020", "Canada", "in service", false, "Canada", "3", "7", "36", "Guenon");
    	Monkey monkey3 = new Monkey("Cookie", "female", "12", "7", "12-12-2017", "United States", "in service", false, "United States", "4", "6", "37", "Macaque");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }
	
    


    // Collect the dog's name from the user
    // if dog's name is already in the dogList, display message and return to the menu
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        //Collect dog's information from user
        	System.out.println("What is the dog's breed?");
        	String breed = scanner.nextLine();
        
        	System.out.println("What is the dog's gender?");
        	String gender = scanner.nextLine();
        
        	System.out.println("What is the dog's age?");
        	String age = scanner.nextLine();
        
        	System.out.println("What is the dog's weight?");
        	String weight = scanner.nextLine();
        
        	System.out.println("What is the dog's acquisition date?");
        	String acquisitionDate = scanner.nextLine();
        
        	System.out.println("What is the dog's acquisition country?");
        	String acquisitionCountry = scanner.nextLine();
        
        	System.out.println("What is the dog's training status?");
        	String trainingStatus = scanner.nextLine();
        
        	System.out.println("The dog is reseverd? (True/False)");
        	boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        
        	System.out.println("Whaich country is the dog serving in?");
        	String inServiceCountry = scanner.nextLine();
        	
        	System.out.println("\nThe dog has been successfully added to the system.");
        
        // Add the code to instantiate a new dog and add it to the appropriate list
        	Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        	dogList.add(newDog);
    }

    

    	
    	// Collect all monkey's information from user
    	// ensure name is unique in the monkeyList
    	// ensure monkey species is valid input
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
        	String name = scanner.nextLine();
        	for(Monkey monkey: monkeyList) {
        		if(monkey.getName().equalsIgnoreCase(name)) {
        			System.out.println("\n\nThis monkey is already in our system.\n\n");
        			return;
        		}
        	}
        
        	System.out.println("What is the monkey's gender?");
        	String gender = scanner.nextLine();
        	
        	System.out.println("What is the monkey's age?");
        	String age = scanner.nextLine();
        	
        	System.out.println("What is the monkey's weight?");
        	String weight = scanner.nextLine();
        	
        	System.out.println("What is the monkey's acquisition date?");
        	String acquisitionDate = scanner.nextLine();
        	
        	System.out.println("What is the monkey's acquisition country?");
        	String acquisitionCountry = scanner.nextLine();
        	
        	System.out.println("What is the monkey's training status?");
        	String trainingStatus = scanner.nextLine();
        	
        	System.out.println("The monkey is reserved? (True/False)");
        	boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        	
        	System.out.println("Which country is the monkey serving in?");
        	String inServiceCountry = scanner.nextLine();
        	
        	
        	System.out.println("What is the monkey's tail length?");
        	String tailLength = scanner.nextLine();
        	
        	
        	System.out.println("What is the monkey's height?");
        	String height = scanner.nextLine();
        	        	
        	
        	System.out.println("What is the monkey's body length?");
        	String bodyLength = scanner.nextLine();
        	       	        	
        	// Collect monkey's species from user
        	// Loop through the speciesList to ensure user input a valid species
        	System.out.println("What is the monkey's species?");
        	List<String> speciesList = List.of("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin");
        	
        	String species = "";
        	boolean found = false;
        	while (!found) {
        		species = scanner.nextLine();
        		for (int i=0; i<speciesList.size(); i++) {
        			if (species.equalsIgnoreCase(speciesList.get(i))) {
        			found = true;
        			break;	
        			}
        		}
        		if (found) {
        			System.out.println("\nThe monkey has been successfully added to the system.");
        		}
        		else {
        			System.out.println("Enter an eligible monkey species: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin?");
        		}
        	}
        
        	// Create a new Monkey object
        	Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength, species);
        	
        	// Add the newMonkey to the monkeyList
        	monkeyList.add(newMonkey);
        }
        

  
        

        
        // allow user to reserve animals in selected country
        // user need to input their animal type and the country they want to reserve animal
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What type of animal you would like to reserve?");
            String animal = scanner.nextLine();
            
            // ensure input is either dog or monkey
            while (!animal.equalsIgnoreCase("dog") && !animal.equalsIgnoreCase("monkey")) {
            	System.out.println("Invalid input. Enter an eligible type of animal: Monkey or Dog.");
            	animal = scanner.nextLine();
            }
            
            // flag to check if a valid country is found
            boolean validCountry = false;
            
            // keep asking for country until a match is found
            while (!validCountry) {
            	System.out.println("From which country would you like to reserve the animal?");
            	String country = scanner.nextLine();
            
            	if (animal.equalsIgnoreCase("dog")) {
            
            	// display a list of dogs is same with userinput's country, and it is not reserved
            		for(Dog dog : dogList) {
            			if (dog.getInServiceCountry().equalsIgnoreCase(country) && !dog.getReserved()) {
            				dog.setReserved(true);
            				System.out.println("\nYou have successfully reserved the dog named: " + dog.getName());
            				validCountry = true;  	// exit loop after a dog is reserved
            				break;
            			}
            		}
            	}
            	else if (animal.equalsIgnoreCase("monkey")) {
            
            		// display a list of monkey is same with userinput's country, and it is not reserved
            		for(Monkey monkey : monkeyList) {
            			if (monkey.getInServiceLocation().equalsIgnoreCase(country) && !monkey.getReserved()) {
            				monkey.setReserved(true);
            				System.out.println("\nYou have successfully reserved the monkey named: " + monkey.getName());
            				validCountry = true;  	//exit loop after a monkey is reserved
            				break;
            			}
            		}
            	}
            	
            	// if no animals was found, inform user so they can input other country
            	if (!validCountry) {
            		System.out.println("\nNo available animal in this country for reservation.");
            		}
            	}
        	}

        // This is for user input option 4, 5, 6
       public static void printAnimals(String userInput) {
    	   
    	   // if user input is 4
    	   //print a list of dogs with their name, training status, acquisition country, and reserved status
        	if (userInput.equals("dog")) {
        		String title = "List of Dogs";
        		System.out.println("\t\t\t" + title);
        		System.out.println("\t\t\t" + "-".repeat(title.length()));
        		for (Dog dog: dogList) {
        			System.out.println("Name: " + dog.getName() +
        								", Status: " + dog.getTrainingStatus() +
        								", Acquisition Country: " + dog.getAcquisitionCountry() +
        								", Is the animal reserved? " + dog.getReserved());
        		}
        	}
        	
        	// if user input is 5
        	// print the monkey list with their name, training status, acquisition country, and reserved status
        	else if (userInput.equals("monkey")) {
        		String title = "List of Monkeys";
        		System.out.println("\t\t\t" + title);
        		System.out.println("\t\t\t" + "-".repeat(title.length()));
        		for (Monkey monkey: monkeyList) {
        			System.out.println("Name: " + monkey.getName() +
        								", Status: " + monkey.getTrainingStatus() +
        								", Acquisition Country: " + monkey.getAcquisitionLocation() +
        								", Is the animal reserved? " + monkey.getReserved());
        		}
        	
        	}
        	
        	// if user input is 6
        	// print out the list of monkey that is not reserved yet and their training status is "in service"
        	else if (userInput.equals("available")) {
        		String title = "List of animals available for reserve";
        		System.out.println("\t\t\t" + title);
        		System.out.println("\t\t\t" + "-".repeat(title.length()));
        		System.out.println("Monkeys: ");
        		for (Monkey monkey: monkeyList) {
        			if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
        				System.out.println("Name: " + monkey.getName() +
        								", Age: " + monkey.getAge() +
        								", Gender: " + monkey.getGender() +
        								", Species: " + monkey.getSpecies() +
        								", Status: " + monkey.getTrainingStatus() +
        								", Acquisition Country: " + monkey.getAcquisitionLocation());
        								
        			}
        		}
        		
        		// follow the instruction: one of the animal list - "This option needs to be implemented"
        		System.out.println("\nDogs: \nThis option needs to be implemented");
        		
        	}
        	else {
        		return;
        	}
       }
}



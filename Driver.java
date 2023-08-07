import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        // Instance variables (if needed)

        do {
            displayMenu();
            Scanner scnr = new Scanner(System.in);
            String option = scnr.nextLine();
            if (option.equals("1")) {
                intakeNewDog(scnr);
            }
            if (option.equals("2")) {
                intakeNewMonkey(scnr);
            }
            if (option.equals("3")) {
                reserveAnimal(scnr);
            }
            if (option.equals("4")) {
                printAnimals("dogs");
            }
            if (option.equals("5")) {
                printAnimals("monkeys");
            }
            if (option.equals("6")) {
                printAnimals("available");
            }
            if (option.equals("q")) {
                break;
            }
        } while (true);
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
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Chow", "Male", "20", "230", "2/2/23", "United States", "in service", false, "Canada", "20", "52", "29", "Capuchin");

        Monkey monkey2 = new Monkey("Mia", "Female", "21", "130", "2/2/23", "United States", "in service", false, "Canada", "20", "52", "29", "Capuchin");

        Monkey monkey3 = new Monkey("Mikey", "Male", "20", "230", "2/2/23", "United States", "in service", false, "Canada", "20", "52", "29", "Capuchin");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Intake method for adding a new dog
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("When did we acquire the dog?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Where was the dog acquired from?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved?");
        String reservedInpt = scanner.nextLine();
        boolean reserved;
        if (reservedInpt.equals("yes")) {
            reserved = true;
        } else {
            reserved = false;
        }

        System.out.println("What country is the dog in service at?");
        String inServiceCountry = scanner.nextLine();

        // Instantiate the new dog
        Dog addedDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);


        dogList.add(addedDog);

    }

    // Intake method for adding a new monkey
    public static void intakeNewMonkey(Scanner scanner) {
        String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};

        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        boolean containsSpecies = Arrays.asList(monkeySpecies).contains(species);

        if (!containsSpecies) {
            System.out.println("Monkey species not valid!");
            return;
        }


        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        System.out.println("When did we acquire the monkey?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Where was the monkey acquired from?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the monkey reserved?");
        String reservedInpt = scanner.nextLine();
        boolean reserved;
        reserved = reservedInpt.equals("yes");

        System.out.println("What country is the monkey in service at?");
        String inServiceCountry = scanner.nextLine();

        // Instantiate the new dog
        Monkey addedMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength, species);


        monkeyList.add(addedMonkey);
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("[M]onkey or [D]og?: ");
        String animalType = scanner.nextLine();
        System.out.println("Animal's name?: ");
        String animalName = scanner.nextLine();
        if (animalType.equalsIgnoreCase("M") || animalType.equalsIgnoreCase("Monkey")) {
            for (int i = 0; i < monkeyList.toArray().length - 1; i++) {
                if (monkeyList.get(i).getName().equalsIgnoreCase(animalName)) {
                    System.out.println(monkeyList.get(i).getName());
                    System.out.println("Reserve " + monkeyList.get(i).getName() + "?");
                    String reserveMonkey = scanner.nextLine();
                    if (reserveMonkey.equalsIgnoreCase("y") || reserveMonkey.equalsIgnoreCase("yes")) {
                        monkeyList.get(i).setReserved(true);
                        System.out.println(monkeyList.get(i).getName() + " reserved!");
                    }
                    return;
                }
            }
            System.out.println("No monkey by that name!");
            return;
        } else if (animalType.equalsIgnoreCase("D") || animalType.equalsIgnoreCase("Dog")) {
            for (int i = 0; i < dogList.toArray().length; i++) {
                if (dogList.get(i).getName().equalsIgnoreCase(animalName)) {
                    System.out.println(dogList.get(i).getName());
                    System.out.println("Reserve " + dogList.get(i).getName() + "?");
                    String reserveDog = scanner.nextLine();
                    if (reserveDog.equalsIgnoreCase("y") || reserveDog.equalsIgnoreCase("yes")) {
                        dogList.get(i).setReserved(true);
                        System.out.println(dogList.get(i).getName() + " reserved!");
                    }
                    return;
                }
            }
            System.out.println("No dog by that name!");
            return;
        }
    }

    // Print list of animals based on listType: monkeys, dogs, or available animals
    public static void printAnimals(String listType) {
        switch (listType) {
            case "dogs" -> {
                for (Dog dog : dogList) {
                    System.out.println(dog.getName());
                    System.out.println(dog.getTrainingStatus());
                    System.out.println(dog.getAcquisitionLocation());
                    System.out.println(dog.getReserved());
                    System.out.println("-------------");
                }
            }
            case "monkeys" -> {
                for (Monkey monkey : monkeyList) {
                    System.out.println(monkey.getName());
                    System.out.println(monkey.getTrainingStatus());
                    System.out.println(monkey.getAcquisitionLocation());
                    System.out.println(monkey.getReserved());
                    System.out.println("-------------");
                }
            }
            case "available" -> {
                System.out.println("Available Monkeys: ");
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equals("in service") && !monkey.getReserved()) {
                        System.out.println("Name: " + monkey.getName());
                        System.out.println("Training Status: " + monkey.getTrainingStatus());
                        System.out.println("Acquisition country: " + monkey.getAcquisitionLocation());
                        System.out.println("-------------");
                    }
                }
                System.out.println("Available Dogs: ");
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equals("in service") && !dog.getReserved()) {
                        System.out.println("Name: " + dog.getName());
                        System.out.println("Training Status: " + dog.getTrainingStatus());
                        System.out.println("Acquisition country: " + dog.getAcquisitionLocation());
                        System.out.println("-------------");
                    }
                }
            }
        }

    }
}


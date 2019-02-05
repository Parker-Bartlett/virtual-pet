package virtualpet;

import java.awt.Toolkit;
import java.util.Scanner;

import organicpets.Cat;
import organicpets.Dog;
import organicpets.OrganicPet;
import petshelter.VirtualPetShelter;
import roboticpets.Bender;
import roboticpets.MrCoffee;
import roboticpets.RoboticPet;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet testPetOne = new Dog("BoBo");
		shelter.addPet(testPetOne);
		VirtualPet testPetTwo = new Cat("FroDo");
		shelter.addPet(testPetTwo);
		VirtualPet testPetThree = new MrCoffee("ToDo");
		shelter.addPet(testPetThree);
		VirtualPet testPetFour = new Bender("Flexo");
		shelter.addPet(testPetFour);

		System.out.println("    Welcome to <Pet Store Name>! \nWhat would you like to Name your pet?");
		String name = input.nextLine();
		VirtualPet introPet = new Dog(name);
		shelter.addPet(introPet);

		System.out.println("Meet " + introPet.getName() + "!");

		System.out.println("To take a tour press 1. \nTo get started press 2.");
		String choice = input.nextLine();

		boolean foo = true;
		while (foo) {
			if (choice.equals("1")) {
				String petAction;
				for (int i = 0; i < 5; i++) {
					introPet.tick();
				}

				System.out.println(
						"Welcome to the Shelter.  In order to keep your pets happy and healthy, you will need to care for your pet");

				System.out.print("Your pet is hungry! Feed it by pressing 1.");
				petAction = input.nextLine();
				if (petAction.equals("1")) {
					introPet.feed();
				}
				System.out.print("Your pet is thirsty! Hydrate it by pressing 2.");
				petAction = input.nextLine();
				if (petAction.equals("2")) {
					((OrganicPet) introPet).hydrate();
				}
				System.out.print("Your pet is bored! Play with it by pressing 3.");
				petAction = input.nextLine();
				if (petAction.equals("3")) {
					introPet.play();
				}
				System.out.print("Your pet is dirty! Clean it by pressing 4.");
				petAction = input.nextLine();
				if (petAction.equals("4")) {
					introPet.clean();
					Toolkit.getDefaultToolkit().beep();
					System.out.println(
							"********************************************************************************");
					System.out.println(
							"************Achievement Unlocked: You have access to Robotic Pets***************");
					System.out.println(
							"********************************************************************************");
					System.out.println(
							"Inside your shelter you can take in both Organic and Robotic Pets\nIsn't that wonderful?");
				}

				foo = false;
				break;

			} else if (choice.equals("2")) {
				foo = false;
				break;
			} else {
				System.out.println("Please enter 1 or 2.");
				choice = input.nextLine();
			}

		}

		// Intro to Game
		System.out.println("Congratulations you have a happy and healthy pet! Lets get started!\n\n");

		boolean gameIsOn = true;
		while (gameIsOn) {
			// Main menu
			userMainMenu(input, shelter);
		}
	}

	private static void userMainMenu(Scanner input, VirtualPetShelter shelter) {
		System.out.println("-Main Menu Options-");
		System.out.println("1. Single Pet Interaction \n2. Go to the shelter \n3. Exit");
		String menuChoice = input.nextLine();
		switch (menuChoice) {
		case "1":
			singlePetInteraction(input, shelter);
			break;
		case "2":
			multiPetInteraction(input, shelter);
			break;
		case "3":
			System.out.println(
					"Well, I guess these animals will all die... \nNo, it's fine, just leave, we'll find somebody else to care for these poor animals.");

			System.exit(0);
		}
	}

	private static void multiPetInteraction(Scanner input, VirtualPetShelter shelter) {
		printAllPets(shelter);

		boolean allAlive = true;
		while (allAlive) {
			System.out.println(
					"1. Feed All  2. Hydrate and Lubricate All\n3. Play With All  4. Clean All\n5.Adopt Out (get rid off) 6. Take in (create)\n7. Display Status of Pets  8.Exit to Main Menu");
			String menuChoice = input.nextLine();
			shelter.tickAll();
			System.out.println(shelter.checkAll());

			switch (menuChoice) {
			case "1":
				shelter.feedAll();
				break;
			case "2":
				shelter.hydrateAll();
				break;
			case "3":
				shelter.playAll();
				break;
			case "4":
				shelter.cleanAll();
				break;
			case "5":
				printAllPets(shelter);
				System.out.println("Which pet is being adopted?");
				String adoptedPet = input.nextLine();
				boolean answerIsNotExistingPet = true;
				while (answerIsNotExistingPet) {
					if (shelter.checkIfListContains(adoptedPet)) {
						VirtualPet pet = shelter.getPet(adoptedPet);
						shelter.removePet(pet);
						answerIsNotExistingPet = false;
					} else {
						System.out.println("Please enter an existing pets name:");
						adoptedPet = input.nextLine();
					}
				}
				break;
			//////////////////// FIX THIS////////////////////////
			case "6":
				System.out.println("What is the new pets name?");
				String petName = input.nextLine();
				System.out.println("Is a Dog, Cat, Bender, or Mr Coffee?");
				boolean validPetType = true;
				while (validPetType) {
					String petType = input.nextLine();
					if (petType.equalsIgnoreCase("Dog")) {
						VirtualPet addPet = new Dog(petName);
						shelter.addPet(addPet);
						validPetType = false;
					} else if (petType.equalsIgnoreCase("Cat")) {
						VirtualPet addPet = new Cat(petName);
						shelter.addPet(addPet);
						validPetType = false;
					} else if (petType.equalsIgnoreCase("Bender")) {
						VirtualPet addPet = new Bender(petName);
						shelter.addPet(addPet);
						validPetType = false;
					} else if (petType.equalsIgnoreCase("Mr Coffee")) {
						VirtualPet addPet = new MrCoffee(petName);
						shelter.addPet(addPet);
						validPetType = false;
					} else {
						System.out.println("Please enter either Cat, Dog, Bender or Mr Coffee");
					}
				}
				break;
			case "7":
				System.out.println(shelter.statusOfAllPets());
				break;
			case "8":

				allAlive = !allAlive;
				break;
			}
		}
	}

	private static void singlePetInteraction(Scanner input, VirtualPetShelter shelter) {

		printAllPets(shelter);
		System.out.println("Please choose a pet by their name.");
		String petToGet = input.nextLine();
		boolean answerIsNotExistingPet = true;
		while (answerIsNotExistingPet) {
			if (!shelter.checkIfListContains(petToGet)) {
				System.out.println("Please enter an existing pets name:");
				petToGet = input.nextLine();
			}

			VirtualPet activePet = shelter.getPet(petToGet);

			String hydrateOrLubricate = "hydrate";
			if (activePet instanceof RoboticPet) {
				hydrateOrLubricate = "lubricate";
			}

			boolean isAlive = true;
			while (isAlive) {
				System.out.println(
						"1. Feed \n2. " + hydrateOrLubricate + "\n3. Play \n4. Clean \n5. Check Status \n6. Exit");
				String menuChoice = input.nextLine();
				activePet.tick();
				System.out.println(activePet.check());

				switch (menuChoice) {
				case "1":
					if (activePet instanceof Dog) {
						feedDog(activePet);
					}
					if (activePet instanceof Bender) {
						feedBender(activePet);
					}
					if (activePet instanceof MrCoffee) {
						feedMrCoffee(activePet);
					}
					break;
				case "2":
					if (activePet instanceof OrganicPet) {
						((OrganicPet) activePet).hydrate();
					}
					if (activePet instanceof RoboticPet) {
						((RoboticPet) activePet).getLubrication();
					}

					break;
				case "3":
					activePet.play();
					break;
				case "4":
					activePet.clean();
					break;
				case "5":
					System.out.println(activePet.printStats());
					break;
				case "6":
					userMainMenu(input, shelter);
					// isAlive = !isAlive;
					break;
				}
			}

		}

	}

	public static void printAllPets(VirtualPetShelter petShelter) {
		System.out.println(petShelter.getVirtualPets());
	}

	public static void feedDog(VirtualPet dog) {

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to feed your dog?");
		System.out.println("1. Fancy Feast \n2. Gravy Train\n3. Cow Femur with Peanut Butter\n4. Cat Poop");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			((Dog) dog).feedFancy();
		case "2":
			((Dog) dog).feedGravy();
		case "3":
			((Dog) dog).feedCow();
		case "4":
			((Dog) dog).feedCat();
		}
	}

	public static void feedBender(VirtualPet bender) {

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to feed your Bender?");
		System.out.println("1. Beer \n2. Non-Alcoholic Beer\n3. Coins\n4. Entree from Elzar's");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			System.out.println(((Bender) bender).beer());
			break;
		case "2":
			System.out.println(((Bender) bender).nonalcoholicBeer());
			break;
		case "3":
			System.out.println(((Bender) bender).coins());
			break;
		case "4":
			System.out.println(((Bender) bender).elzarsEntree());
			break;
		}
	}

	public static void feedMrCoffee(VirtualPet mrCoffee) {

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to feed Mr Coffee?");
		System.out.println("1. Dark Roast \n2. Breakfast Blend\n3. Vinegar\n4. Souls of the Dead");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			// ((MrCoffee) mrCoffee).darkRoast();
			System.out.println(((MrCoffee) mrCoffee).darkRoast());
			break;
		case "2":
			System.out.println(((MrCoffee) mrCoffee).breakfastBlend());
			break;
		case "3":
			System.out.println(((MrCoffee) mrCoffee).vinegar());
			break;
		case "4":
			System.out.println(((MrCoffee) mrCoffee).soulsOfTheDead());
			break;
		}
	}

}
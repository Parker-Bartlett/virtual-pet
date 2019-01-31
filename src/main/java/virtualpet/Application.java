package virtualpet;

import java.awt.Toolkit;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet testPetOne = new OrganicPet("BoBo");
		shelter.addPet(testPetOne);
		VirtualPet testPetTwo = new OrganicPet("FroDo");
		shelter.addPet(testPetTwo);
		VirtualPet testPetThree = new RoboticPet("ToDo");
		shelter.addPet(testPetThree);

		System.out.println("    Welcome to <Pet Store Name>! \nWhat would you like to Name your pet?");
		String name = input.nextLine();
		VirtualPet introPet = new OrganicPet(name);
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
		System.out.println(shelter.listPets());

		boolean allAlive = true;
		while (allAlive) {
			System.out.println(
					"1. Feed All  2. Hydrate and Lubricate All\n3. Play With All  4. Clean All\n5.Adopt Out (get rid off) 6. Take in (create)\n7. Display Status of Pets  8.Exit to Main Menu");
			String menuChoice = input.nextLine();
			shelter.tickAll();

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
				System.out.println(shelter.listPets());
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
			case "6":
				System.out.println("What is the new pets name?");
				String petName = input.nextLine();
				System.out.println("Is it organic or a robotic?");
				String organicOrRobotic = input.nextLine();
				if (organicOrRobotic.equalsIgnoreCase("organic")) {
					VirtualPet addPet = new OrganicPet(petName);
					shelter.addPet(addPet);
				}
				if (organicOrRobotic.equalsIgnoreCase("robotic")) {
					VirtualPet addPet = new RoboticPet(petName);
					shelter.addPet(addPet);
				}
				break;
			case "7":
				shelter.statusOfAllPets();
				break;
			case "8":

				allAlive = !allAlive;
				break;
			}
		}
	}

	private static void singlePetInteraction(Scanner input, VirtualPetShelter shelter) {

		System.out.println(shelter.listPets());
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

				switch (menuChoice) {
				case "1":
					activePet.feed();
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
}
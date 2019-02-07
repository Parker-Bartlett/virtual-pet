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
		VirtualPet testPetOne = new Dog("Spot");
		shelter.addPet(testPetOne);
		VirtualPet testPetTwo = new Cat("Fluffy");
		shelter.addPet(testPetTwo);
		VirtualPet testPetThree = new MrCoffee("Cuisinart");
		shelter.addPet(testPetThree);
		VirtualPet testPetFour = new Bender("Flexo");
		shelter.addPet(testPetFour);

		System.out.println("********************   Welcome to The Old North Pet Shelter and Bar! ********************");
		System.out.println("Before you can have a beer, you have to take care of all of these damn animals.");
		System.out.println(
				"Hey, look, there is a new arrival!  It's a dog!  It's not an impressive dog, but a dog nonetheless.");
		System.out.println("So...  What's it's name?");

		String name = input.nextLine();
		VirtualPet introPet = new Dog(name);
		shelter.addPet(introPet);

		System.out.println("So " + introPet.getName() + " huh?  I guess that will be okay...");
		System.out.println("************************Options*************************");
		System.out.println("             1. Tutorial \n             2. Start the game");
		System.out.println("********************************************************");
		String choice = input.nextLine();

		boolean foo = true;
		while (foo) {
			if (choice.equals("1")) {
				String petAction;
				for (int i = 0; i < 5; i++) {
					introPet.tick();
				}

				System.out.println("Okay rookie, Let's go over the basics here at the bar... and shelter.");

				System.out.print("Your pet is hungry! Feed it by pressing 1.");
				petAction = input.nextLine();
				while (!petAction.equals("1")) {

					System.out.println("Invalid option, please press 1");
					petAction = input.nextLine();
					break;
				}
				((Dog) introPet).feed();
				System.out.println("Your pet has been fed! Their hunger stat improved 5 points!");
				System.out.print("Your pet is thirsty! Hydrate it by pressing 2.");
				petAction = input.nextLine();
				while (!petAction.equals("2")) {

					System.out.println("Invalid option, please press 2.");
					petAction = input.nextLine();
					break;
				}
				((Dog) introPet).hydrate();
				System.out.println("Your pet has been hydrated! Their hydration stat improved 5 points!");
				System.out.print("Your pet is bored! Play with it by pressing 3.");
				petAction = input.nextLine();

				while (!petAction.equals("3")) {
					System.out.println("Invalid option, please press 3.");
					petAction = input.nextLine();
					break;
				}
				introPet.play();
				System.out.println("Your pet has been entertained! Their fulfillment stat improved 5 points!");

				System.out.print("Your pet is dirty! Clean it by pressing 4.");
				petAction = input.nextLine();
				while (!petAction.equals("4")) {
					System.out.println("Invalid option, please press 4.");
					petAction = input.nextLine();
				}
				introPet.clean();
				System.out.println("Your pet has been cleansed! Their cleanliness stat improved 5 points!");
				Toolkit.getDefaultToolkit().beep();

				System.out.println("************Achievement Unlocked: You have access to Robotic Pets***************");
				System.out.println("I'm not sure if a coffee maker and a bender are considered pets... Hmmm. ");
				System.out.println("********************************************************************************");
				
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
		System.out.println("Inside the shelter you can take in both Organic and Robotic Pets\nIsn't that wonderful?");
		boolean gameIsOn = true;
		while (gameIsOn) {
			// Main menu
			userMainMenu(input, shelter);
		}
	}

	private static void userMainMenu(Scanner input, VirtualPetShelter shelter) {
		System.out.println("***********************Main Menu************************");
		System.out.println(
				"             1. Single Pet Interaction \n             2. Go to the shelter \n             3. Exit");
		System.out.println("********************************************************");
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
			System.out.println("**********************Activies**************************");
			System.out.println(
					"         1. Feed All\n         2. Hydrate and Lubricate All\n         3. Play With All\n         4. Clean All\n         5. Adopt Out (get rid off)\n         6. Take in (create)\n         7. Display Status of Pets\n         8. Exit to Main Menu");
			System.out.println("********************************************************");
			String menuChoice = input.nextLine();
			shelter.tickAll();
			System.out.println(shelter.checkAll());

			switch (menuChoice) {
			case "1":
				
				// Insert status update *********************************************************************8
				System.out.println("**********************System Alert**********************");
				System.out.println("          Well look at that!  You fed the pets.         ");
				System.out.println("            I guess there is hope for you.              ");
				System.out.println("********************************************************");
				shelter.feedAll();
				break;
			case "2":
				
				// Insert status update *********************************************************************8
				System.out.println("**********************System Alert**********************");
				System.out.println("          All pets have been given water, or          ");
				System.out.println("            lubricated...  Good for you.              ");
				System.out.println("********************************************************");
				
				
				shelter.hydrateAll();
				break;
			case "3":
				
				// Insert status update *********************************************************************8
				System.out.println("**********************System Alert**********************");
				System.out.println("          Thanks for playing with the pets.              ");
				System.out.println("   It did get a little weird when you were singing to\n the coffee maker.   ");
				System.out.println("********************************************************");
				shelter.playAll();
				break;
			case "4":
				
				// Insert status update *********************************************************************8
				System.out.println("**********************System Alert**********************");
				System.out.println("          All pets have been cleaned.  Great!         ");
				System.out.println("            Looks like you need one too...\n          You smell like sadness and failure.              ");
				System.out.println("********************************************************");
				
				
				shelter.cleanAll();
				break;
			case "5":
				
				// Insert status update *********************************************************************8
				
				printAllPets(shelter);
				System.out.println("**********************Adoption**************************");
				System.out.println("         Hey, one of the people at the bar wants\n           to adopt a pet.  They are fairly hammered");
				System.out.println("             Which one are we giving away?");
				System.out.println("********************************************************");
				String adoptedPet = input.nextLine();
				boolean answerIsNotExistingPet = true;
				while (answerIsNotExistingPet) {
					if (shelter.checkIfListContains(adoptedPet)) {
						VirtualPet pet = shelter.getPet(adoptedPet);
						shelter.removePet(pet);
						answerIsNotExistingPet = false;
					} else {
						System.out.println("**********************System Alert**********************");
						System.out.println("   Have you been drinking?  That doesn't appear to be");
						System.out.println("            the name of a current pet.");
						System.out.println("         Please enter an existing pets name:");
						System.out.println("********************************************************");
						adoptedPet = input.nextLine();
					}
				}
				break;

			case "6":
				System.out.println("********************New Pet In Take*********************");
				System.out.println("           Hey, there is a new pet coming in!");
				System.out.println("           What are we going to name this pet?");
				String petName = input.nextLine(); 
				System.out.println("********************************************************");
				System.out.println("         Please select the type of pet it is.");
				System.out.println("                    1.  Dog\n                    2.  Cat\n                    3.  Bender\n                    4.  Mr.Coffee");
				boolean validPetType = true;
				while (validPetType) {
					String petType = input.nextLine();
					if (petType.equalsIgnoreCase("1")) {
						VirtualPet addPet = new Dog(petName);
						System.out.println("A DOG!  YEAAAAAAA!  Just make sure it doesn't bite anyone.");
						shelter.addPet(addPet);
						validPetType = false;
					} else if (petType.equalsIgnoreCase("2")) {
						VirtualPet addPet = new Cat(petName);
						System.out.println("Great another animal to glare at me and judge me...  Sort of like my ex-wife.");
						shelter.addPet(addPet);
						validPetType = false;
					} else if (petType.equalsIgnoreCase("3")) {
						VirtualPet addPet = new Bender(petName);
						shelter.addPet(addPet);
						System.out.println("A bender?  Crap, I'm going to have to run a beer tap to the shelter.");
						validPetType = false;
					} else if (petType.equalsIgnoreCase("4")) {
						VirtualPet addPet = new MrCoffee(petName);
						shelter.addPet(addPet);
						System.out.println("A coffee maker?  That's weird...");
						validPetType = false;
					} else {
						System.out.println("Due to state regulations, we cannot classify that as a pet.  Please try again.");
						System.out.println("               These are your options.");
						System.out.println("                    1.  Dog\n                    2.  Cat\n                    3.  Bender\n                    4.  Mr.Coffee");
						
					}
				}
				System.out.println("********************************************************");
				break;
			case "7":
				System.out.println(shelter.statusOfAllPets());
				break;
			case "8":
				userMainMenu(input, shelter);
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

			String hydrateOrLubricate = "Hydrate";
			if (activePet instanceof RoboticPet) {
				hydrateOrLubricate = "Lubricate";

			}

			boolean isAlive = true;
			while (isAlive) {
				System.out.println("**********************Activies**************************");
				System.out.println("         1. Feed \n         2. " + hydrateOrLubricate
						+ "\n         3. Play \n         4. Clean \n         5. Check Status \n         6. Exit");
				System.out.println("********************************************************");
				String menuChoice = input.nextLine();
				activePet.tick();
				System.out.println(activePet.check());

				switch (menuChoice) {
				case "1":
					
	// Insert status update *********************************************************************8
					
					if (activePet instanceof Dog) {
						feedDog(activePet);
					}
					if (activePet instanceof Cat) {
						feedCat(activePet);
					}
					if (activePet instanceof Bender) {
						feedBender(activePet);
					}
					if (activePet instanceof MrCoffee) {
						feedMrCoffee(activePet);
					}
					if (activePet instanceof Cat) {
						feedCat(activePet);
					}
					break;
				case "2":
					
// Insert status update *********************************************************************8				
					
					if (activePet instanceof OrganicPet) {
						((OrganicPet) activePet).hydrate();
					}
					if (activePet instanceof RoboticPet) {
						((RoboticPet) activePet).getLubrication();
					}

					break;
				case "3":
					
// Insert status update *********************************************************************8					
					
					activePet.play();
					break;
				case "4":
					
					
// Insert status update *********************************************************************8
					
					activePet.clean();
					break;
				case "5":
					
// Insert status update *********************************************************************8
					
					System.out.println(activePet.printStats());
					break;
				case "6":
					
// Insert status update *********************************************************************8					
					
					
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

	public static void feedCat(VirtualPet cat) {

		Scanner input = new Scanner(System.in);

		System.out.println("*********What would you like to feed your cat?**********");
		System.out.println("         1. Fancy Feast \n         2. Gravy Train\n         3. Mouse\n         4. Cat Nip");
		System.out.println("********************************************************");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			System.out.println("Cat's love the meaty taste of Fancy Feast!");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n          Health +15 \n          Fulfillment +10\n          Nourishment +15");
			System.out.println("********************************************************");
			System.out.println("   ");
			((Cat) cat).feedFancy();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "2":
			System.out.println(
					"This is dog food.  DOG FOOD!  The cat stares at you with a mix of rage, disapointment and disgust.");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health + 0 \n              Fulfillment -10\n              Nourishment - 1\n              Hydration - 1");
			System.out.println("********************************************************");
			System.out.println("   ");
			Toolkit.getDefaultToolkit().beep();
			((Cat) cat).feedGravy();
			break;
		case "3":
			System.out.println("Your pet caught and brutally killed that mouse we've been trying to catch for weeks!");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health +25 \n              Fulfillment +30\n              Nourishment +25\n              Hydration -5 \n              Hygene -10");
			System.out.println("********************************************************");
			System.out.println("   ");
			((Cat) cat).feedMouse();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "4":
			System.out.println(
					"Cat Nip...  Nice.  Your cat is stoned out of it's mind.\n  It has a bad case of the munchines, so it needs fed something else.\n However, it's been cleaning itself non-stop for like 15 minutes.  Weird.");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health + 5 \n              Fulfillment +50\n              Nourishment -20\n              Hydration - 5 \n              Hygene +20");
			System.out.println("********************************************************");
			System.out.println("   ");
			((Cat) cat).feedNip();
			Toolkit.getDefaultToolkit().beep();
			break;
		}
	}

	public static void feedDog(VirtualPet dog) {

		Scanner input = new Scanner(System.in);

		System.out.println("*********What would you like to feed your dog?**********");
		System.out.println(
				"         1. Fancy Feast \n         2. Gravy Train\n         3. Cow Femur with Peanut Butter\n         4. Cat Poop");
		System.out.println("********************************************************");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			System.out.println("That's not dog food...  But that's okay.");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n          Health +5 \n          Fulfillment +10\n          Nourishment +20");
			System.out.println("********************************************************");
			System.out.println("   ");
			((Dog) dog).feedFancy();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "2":
			System.out.println("Gravy Train!  Now we're talking!");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health +15 \n              Fulfillment +5\n              Nourishment +30\n              Hydration -2");
			System.out.println("********************************************************");
			System.out.println("   ");
			Toolkit.getDefaultToolkit().beep();
			((Dog) dog).feedGravy();
			break;
		case "3":
			System.out.println(
					"Cow femur?!  With peanut butter?! Where are you coming up with this stuff?!\n It's a bit messy, so your dog got a bit messy.");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health +25 \n              Fulfillment +30\n              Nourishment +5\n              Hydration -5 \n              Hygene -5");
			System.out.println("********************************************************");
			System.out.println("   ");
			((Dog) dog).feedCow();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "4":
			System.out.println("Cat poop?");
			input.nextLine();
			System.out.println("Seriously?  Cat poop?!");
			input.nextLine();
			System.out.println(
					"What you've just done is on of the most insanely idiotic things I have ever observed. \nAt no point has your decision came anywhere close to helping the overall health of your pet.");
			input.nextLine();
			System.out.println(
					"Everyone in this room is now dumber for having observed you feeding a dog cat poop.\n I award you no points, and may God have mercy on your soul.");
			System.out.println("   ");
			System.out.println(
					"***********The following have stats changed!************\n              Health -15 \n              Fulfillment +10\n              Nourishment -10\n              Hydration -5 \n              Hygene -20");
			System.out.println("********************************************************");
			System.out.println("   ");
			Toolkit.getDefaultToolkit().beep();
			((Dog) dog).feedCat();
			break;
		}
	}

	public static void feedBender(VirtualPet bender) {

		Scanner input = new Scanner(System.in);

		System.out.println("*******What would you like to feed your Bender?*********");
		System.out.println(
				"       1. Beer \n       2. Non-Alcoholic Beer\n       3. Coins\n       4. Entree from Elzar's");
		System.out.println("********************************************************");

		String userChoice = input.nextLine();

		switch (userChoice) {

		case "1":
			System.out.println(((Bender) bender).beer());
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +25");
			System.out.println("              Fulfillment +20");
			System.out.println("              Lubrication +25");
			System.out.println("              Nourishment +20");
			System.out.println("              Hygene      -10");
			System.out.println("********************************************************");
			((Bender) bender).beer();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "2":
			System.out.println(((Bender) bender).nonalcoholicBeer());
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      -10");
			System.out.println("              Fulfillment -20");
			System.out.println("              Lubrication +10");
			System.out.println("              Nourishment +10");
			System.out.println("              Hygene      +10");
			System.out.println("********************************************************");
			Toolkit.getDefaultToolkit().beep();
			((Bender) bender).nonalcoholicBeer();
			break;
		case "3":
			System.out.println(((Bender) bender).coins());
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +15");
			System.out.println("              Fulfillment +50");
			System.out.println("              Lubrication -15");
			System.out.println("              Nourishment +20");
			System.out.println("              Hygene       --");
			System.out.println("********************************************************");
			((Bender) bender).coins();
			Toolkit.getDefaultToolkit().beep();
			break;
		case "4":
			System.out.println(((Bender) bender).elzarsEntree());
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +25");
			System.out.println("              Fulfillment +50");
			System.out.println("              Lubrication +35");
			System.out.println("              Nourishment +50");
			System.out.println("              Hygene      -30");
			System.out.println("********************************************************");
			((Bender) bender).elzarsEntree();
			Toolkit.getDefaultToolkit().beep();
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
			System.out.println("A cup of dark roast was a great choice.");
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +5");
			System.out.println("              Fulfillment +1");
			System.out.println("              Lubrication +1");
			System.out.println("              Nourishment +1");
			System.out.println("              Hygene      -3");
			System.out.println("********************************************************");
			Toolkit.getDefaultToolkit().beep();
			break;
		case "2":
			System.out.println(((MrCoffee) mrCoffee).breakfastBlend());
			System.out.println("A cup of breakfast blend is perfect for at time like this.");
			input.nextLine();
			System.out.println(
					"It takes me back to living in rural Wyoming, oh how peaceful that was to see the sunrise through the foggy trees.\n  That's where I met my first wife Lisa, we were married for 5 years until the accident.\n Ahem... I digress...");
			input.nextLine();
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +5");
			System.out.println("              Fulfillment +1");
			System.out.println("              Lubrication +1");
			System.out.println("              Nourishment +1");
			System.out.println("              Hygene      -3");
			System.out.println("********************************************************");
			Toolkit.getDefaultToolkit().beep();
			break;
		case "3":
			System.out.println(((MrCoffee) mrCoffee).vinegar());

			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +10");
			System.out.println("              Fulfillment + 1");
			System.out.println("              Lubrication +25");
			System.out.println("              Nourishment + 1");
			System.out.println("              Hygene      +10");
			System.out.println("********************************************************");
			Toolkit.getDefaultToolkit().beep();
			break;
		case "4":
			System.out.println(((MrCoffee) mrCoffee).soulsOfTheDead());
			System.out.println("YOU WILL DROWN IN A TSUNAMI OF COFFEE, DEATH AND DESTRUCTION!");
			System.out.println("Error Code: 123a - Press Enter to Continue.");
			input.nextLine();
			System.out.println("Error not resolved.  Press Enter to Debug.");
			input.nextLine();
			System.out.println("Debugging - Press Enter to Continue");
			input.nextLine();

			System.out.println("System Restored.");
			input.nextLine();
			System.out.println("***********The following have stats changed!************");
			System.out.println("              Health      +500");
			System.out.println("              Fulfillment + 20");
			System.out.println("              Lubrication + 25");
			System.out.println("              Nourishment +200");
			System.out.println("              Hygene      + 50");
			System.out.println("********************************************************");
			Toolkit.getDefaultToolkit().beep();
			break;
		}
	}

}
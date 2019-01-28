package virtualpet;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPet testPetOne = new VirtualPet("BoBo");
		shelter.addPet(testPetOne);
		VirtualPet testPetTwo = new VirtualPet("FroDo");
		shelter.addPet(testPetTwo);
		VirtualPet testPetThree = new VirtualPet("ToDo");
		shelter.addPet(testPetThree);
		
		
		System.out.println("    Welcome to <Pet Store Name>! \nWhat would you like to Name your pet?");
		String name = input.nextLine();
		VirtualPet introPet = new VirtualPet(name);
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
				System.out.print("Your pet is thursty! Hydrate it by pressing 2.");
				petAction = input.nextLine();
				if (petAction.equals("2")) {
					introPet.hydrate();
				}
				System.out.print("Your pet is board! Play with it by pressing 3.");
				petAction = input.nextLine();
				if (petAction.equals("3")) {
					introPet.play();
				}
				System.out.print("Your pet is dirty! Clean it by pressing 4.");
				petAction = input.nextLine();
				if (petAction.equals("4")) {
					introPet.clean();
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
		System.out.println("Congratulations you have a happy and healthy pet! Lets get started!");
		System.out.println(introPet.printStats());
		shelter.listPets();
		System.out.println("Please choose a pet by their name.");
		String petToGet = input.nextLine();
		VirtualPet activePet = shelter.getPet(petToGet);
		// Menu
		boolean isAlive = true;
		while (isAlive) {
			System.out.println("1. Feed \n2. Hydrate \n3. Play \n4. Clean \n5. Check Status \n6. Exit");
			String menuChoice = input.nextLine();
			activePet.tick();
			
			switch (menuChoice) {
			case "1":
				activePet.feed();
				break;
			case "2":
				activePet.hydrate();
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
				System.exit(0);
				break;
			}

		}
		input.close();
	}
}

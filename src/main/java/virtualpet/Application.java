package virtualpet;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("    Welcome to <Pet Store Name>! \nWhat would you like to Name your pet?");
		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name);
		System.out.println("Meet " + pet.getName() + "!");

		System.out.println("To take a tour press 1. \nTo get started press 2.");
		String choice = input.nextLine();

		boolean foo = true;
		while (foo) {
			if (choice.equals("1")) {
				String petAction;
				pet.tick();

				System.out.println(
						"Welcome to the Shelter.  In order to keep your pets happy and healthy, you will need to care for your pet");

				System.out.print("Your pet is hungry! Feed it by pressing 1.");
				petAction = input.nextLine();
				if (petAction.equals("1")) {
					pet.feed();
				}
				System.out.print("Your pet is thursty! Hydrate it by pressing 2.");
				petAction = input.nextLine();
				if (petAction.equals("2")) {
					pet.hydrate();
				}
				System.out.print("Your pet is board! Play with it by pressing 3.");
				petAction = input.nextLine();
				if (petAction.equals("3")) {
					pet.play();
				}
				System.out.print("Your pet is dirty! Clean it by pressing 4.");
				petAction = input.nextLine();
				if (petAction.equals("4")) {
					pet.clean();
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
		System.out.println(pet.printStats());

		// Menu
		boolean isAlive = true;
		while (isAlive) {
			System.out.println("1. Feed \n2. Hydrate \n3. Play \n4. Clean \n5. Check Status \n6. Exit");
			String menuChoice = input.nextLine();
			pet.tick();
			
			switch (menuChoice) {
			case "1":
				pet.feed();
				break;
			case "2":
				pet.hydrate();
				break;
			case "3":
				pet.play();
				break;
			case "4":
				pet.clean();
				break;
			case "5":
				System.out.println(pet.printStats());
				break;
			case "6":
				System.exit(0);
				break;
			}

		}
		input.close();
	}
}

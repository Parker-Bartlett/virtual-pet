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
				
				System.out.println("Welcome to the Shelter.  In order to keep your pets happy and healthy, you will need to care for your pet");
				
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
				choice = input.next();
			}
		}


		// Intro and tutorial
		System.out.println(pet.printStats());

		// for (int i = 0; i < 11; i++) {
		// pet.tick();
		// System.out.println(pet.getBoredom() +" "+ pet.getHunger() + " " +
		// pet.getThirst() + " " + pet.getCleanliness());
		//
		
		input.close();
	}

}

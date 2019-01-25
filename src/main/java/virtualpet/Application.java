package virtualpet;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("    Welcome to <Pet Store Name>! \nWhat would you like to Name your pet?");
		String name = input.next();
		VirtualPet pet = new VirtualPet(name);
		System.out.println("Meet " + pet.getName() + "!");
		
		System.out.println("To take a tour press 1. \nTo get started press 2.");
		String choice = input.next();

		boolean foo = true;
		while (foo) {
			if (choice.equals("1")) {
				foo = false;
				
				// enter tutorial
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

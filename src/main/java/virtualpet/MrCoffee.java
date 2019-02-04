package virtualpet;

import java.util.Scanner;

public class MrCoffee extends RoboticPet {
	
	public MrCoffee(String name) {
		super(name);
		
	}


	
	
	
	Scanner input = new Scanner(System.in);
	
	
	public int feed() {
		int hunger = super.getHunger();
		System.out.println("Feeding your organic pet can alter other methods");
		
		System.out.println("What would you like to feed Mr. Coffee?");
		System.out.println("1. Dark Roast \n2. Electricity\n3. Souls of Your Enemies\n4. Pizza");
		String foodChoice = input.next();
		
		switch(foodChoice) {
		
		case "1":
			increaseHealth(15);
			increaseBoredom(10);
			
			hunger = increaseHunger(25);
			break;
			
		case "2":
			increaseHealth(0);
			increaseBoredom(-10);
			increaseHunger(-1);
			increaseLubrication(-1);
			System.out.println("Cats do not eat Gravy Train, you imbecile...  ");
			System.out.println("The cat did not eat it, it is now a bit irritated with you.  Maybe you should feed it something better and play with it.");
			
			break;
			
		case "3":
			increaseHealth(25);
			increaseBoredom(30);
			increaseHunger(25);
			increaseLubrication(-5);
			increaseCleanliness(-10);
			
			System.out.println("Wow, great choice! You let the cat go hunting! It is really happy!");
			
			break;
		case "4":
			increaseHealth(5);
			increaseHunger(-20);
			increaseLubrication(-5);
			increaseBoredom(50);
			increaseCleanliness(20);
			
			System.out.println("The cat got into the cat nip...  Nice brah.");
			System.out.println("It is high as ffffffuuuuudge.  It needs fed real food, it has the munchies hardcore.");
			break;
			
		}
}


	
	
}

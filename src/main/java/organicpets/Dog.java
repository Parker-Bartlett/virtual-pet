package organicpets;

import java.util.Scanner;

public class Dog extends OrganicPet {
	
	public Dog(String name) {
		super(name);
		
		}
	
	
	
	
 Scanner input = new Scanner(System.in);
	
	
	
	public int feed() {
		int hunger = super.getHunger();
		System.out.println("Feeding your organic pet can alter other methods");
		
		System.out.println("What would you like to feed your dog?");
		System.out.println("1. Fancy Feast \n2. Gravy Train\n3. Cow Femur with Peanut Butter\n4. Cat Poop");
		String foodChoice = input.next();
		
		switch(foodChoice) {
		
		case "1":
			increaseHealth(5);
			increaseBoredom(10);
			
			hunger = increaseHunger(20);
			break;
			
		case "2":
			increaseHealth(15);
			increaseBoredom(5);
			increaseHunger(30);
			increaseThirst(-2);
			
			
			break;
			
		case "3":
			increaseHealth(25);
			increaseBoredom(30);
			increaseHunger(5);
			increaseThirst(-5);
			increaseCleanliness(-5);
			
			System.out.println("Wow, great choice!  That cow femur will keep the dog entertained too!");
			
			break;
		case "4":
			increaseHealth(-15);
			increaseHunger(-10);
			increaseThirst(-5);
			increaseBoredom(10);
			increaseCleanliness(-20);
			
			System.out.println("Your dog ate from the litter box...  It vomited and it has the runs...");
			System.out.println("You need to clean it, it pooped on itself...  and its breath smells like cat poop so there's that...");
			break;
		}
		
		
		
//		increaseHealth(); //increases health
//		increaseBoredom(); //increases boredom
//		hunger = increaseHunger(20); //increases hunger by set amount
//		
		return hunger;
}



	
}
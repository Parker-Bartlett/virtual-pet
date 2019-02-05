package organicpets;

public class Dog extends OrganicPet {

	public Dog(String name) {
		super(name);

	}

	public void feedFancy() {
		increaseHealth(5);
		increaseBoredom(10);
		increaseHunger(20);
	}

	public void feedGravy() {
		increaseHealth(15);
		increaseBoredom(5);
		increaseHunger(30);
		increaseThirst(-2);
	}

	public void feedCow() {
		increaseHealth(25);
		increaseBoredom(30);
		increaseHunger(5);
		increaseThirst(-5);
		increaseCleanliness(-5);

		System.out.println("Wow, great choice!  That cow femur will keep the dog entertained too!");

	}

	public void feedCat() {
		increaseHealth(-15);
		increaseHunger(-10);
		increaseThirst(-5);
		increaseBoredom(10);
		increaseCleanliness(-20);

		System.out.println("Your dog ate from the litter box...  It vomited and it has the runs...");
		System.out.println(
				"You need to clean it, it pooped on itself...  and its breath smells like cat poop so there's that...");
	}
}
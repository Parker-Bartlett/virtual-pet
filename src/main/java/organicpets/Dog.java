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
	}

	public void feedCat() {
		increaseHealth(-15);
		increaseHunger(-10);
		increaseThirst(-5);
		increaseBoredom(10);
		increaseCleanliness(-20);

	}
}
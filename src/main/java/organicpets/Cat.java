package organicpets;

public class Cat extends OrganicPet {
	
	public Cat(String name) {
		super(name);
	}

	public void feedFancy() {
		increaseHealth(15);
		increaseBoredom(10);
	}
	

	public void feedGravy() {
		increaseHealth(0);
		increaseBoredom(-10);
		increaseHunger(-1);
		increaseThirst(-1);
	}
		
	public void feedMouse() {
		increaseHealth(25);
		increaseBoredom(30);
		increaseHunger(25);
		increaseThirst(-5);
		increaseCleanliness(-10);
	}
	
	public void feedNip() {
		increaseHealth(5);
		increaseHunger(-20);
		increaseThirst(-5);
		increaseBoredom(50);
		increaseCleanliness(20);
	}

}

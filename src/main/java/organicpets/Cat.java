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
		System.out.println("Cats do not eat Gravy Train, you imbecile...  ");
		System.out.println("The cat did not eat it, it is now a bit irritated with you.  Maybe you should feed it something better and play with it.");
	}
		
	public void feedMouse() {
		increaseHealth(25);
		increaseBoredom(30);
		increaseHunger(25);
		increaseThirst(-5);
		increaseCleanliness(-10);
		System.out.println("Wow, great choice! You let the cat go hunting! It is really happy!");
	}
	
	public void feedNip() {
		increaseHealth(5);
		increaseHunger(-20);
		increaseThirst(-5);
		increaseBoredom(50);
		increaseCleanliness(20);
		System.out.println("The cat got into the cat nip...  Nice brah.");
		System.out.println("It is high as ffffffuuuuudge.  It needs fed real food, it has the munchies hardcore.");
	}

}

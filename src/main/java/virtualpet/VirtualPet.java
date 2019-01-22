package virtualpet;

public class VirtualPet {
	String petName;
	
	public VirtualPet() {
		
	}

	String name;
	int hunger;
	int boredom;
	int thirst;
	int cleanliness;
	int health;

	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 10;
		this.thirst = 10;
		this.boredom = 10;
		this.cleanliness = 10;
		this.health = 100;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {

		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}
	
	public int getCleanliness() {
		return cleanliness;
	}

	public int getHealth() {
		return health;
	}

	public int play() {
		boredom += 5;
		return boredom + 5;
	}

	public int feed() {
		hunger += 5;
		return hunger + 5;
	}

	public void tick() {
		String dm = "Sorry your pet " + name + " has lost 25 health points!";
		thirst = thirst - 1;
		boredom = boredom - 1;
		hunger = hunger - 1;
		cleanliness = cleanliness - 1;
		
		if (thirst <= 0) {
			health -= 25;
			System.out.println(dm);
		}
		
		if (hunger <= 0) {
			health -= 25;
			System.out.println(dm);
		}
		
		if (boredom <= 0) {
			health -= 25;
			System.out.println(dm);
		}
		
		if (cleanliness <= 0) {
			health -= 25;	
			System.out.println(dm);
		}
		
		if (health <= 0) {
			System.out.println("Sorry your pet " + name + " died!");
			System.exit(0);
		}
	}

}

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

	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 10;
		this.thirst = 10;
		this.boredom = 10;
		this.cleanliness = 10;
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

	public int getPlay() {
		boredom += 5;
		return boredom + 5;
	}

	public int getFeed() {
		hunger += 5;
		return hunger + 5;
	}

	public void tick() {
		if (thirst <= 0) {

			System.out.println("Sorry your pet " + name + " died of Thirst");
			System.exit(0);
		}
		thirst = thirst - 1;
		if (hunger <= 0) {

			System.out.println("Sorry your pet " + name + " died of hunger");
			System.exit(0);
		}
		hunger = hunger - 1;
		if (boredom <= 0) {

			System.out.println("Sorry your pet " + name + " died of boredom");
			System.exit(0);
		}
		boredom = boredom - 1;
		if (cleanliness <= 0) {

			System.out.println("Sorry your pet " + name + " died of being too dirty");
			System.exit(0);
		}
		cleanliness = cleanliness - 1;
	}
}

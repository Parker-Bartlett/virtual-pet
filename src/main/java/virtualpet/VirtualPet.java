package virtualpet;

public class VirtualPet {
	private String name;
	private int hunger;
	private int boredom;
	private int thirst;
	private int cleanliness;
	private int health;

	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 25;
		this.thirst = 25;
		this.boredom = 25;
		this.cleanliness = 25;
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
	
	public String printStats() {
		String stats= name + ": \nHunger:" +hunger+ "\nThirst:" +thirst+ "\nBoredom:" +boredom+ "\nCleanliness:" +cleanliness+ "\nHealth:" +health;
		return stats;
	}

	public int play() {
		boredom += 5;
		return boredom;
	}

	public int feed() {
		hunger +=5;
		return hunger;
	}
	
	public int clean() {
		cleanliness += 5;
		return cleanliness;
	}
	
	public int hydrate() {
		thirst += 5;
		return thirst;
	}

	public void tick() {
		String lostHp = "Sorry your pet " + name + " has lost 25 health points!";
		thirst = thirst - 5;
		boredom = boredom - 5;
		hunger = hunger - 5;
		cleanliness = cleanliness - 5;
		
		if (thirst <= 0) {
			health -= 25;
			System.out.println(lostHp);
		}
		
		if (hunger <= 0) {
			health -= 25;
			System.out.println(lostHp);
		}
		
		if (boredom <= 0) {
			health -= 25;
			System.out.println(lostHp);
		}
		
		if (cleanliness <= 0) {
			health -= 25;	
			System.out.println(lostHp);
		}
		
		if (health <= 0) {
			System.out.println("Sorry your pet " + name + " died!");
			System.exit(0);
		}
	}

}

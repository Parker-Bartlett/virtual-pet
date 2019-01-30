package virtualpet;

public abstract class VirtualPet {
	private String name;
	private int hunger;
	private int boredom;
	private int cleanliness;
	private int health;

	public VirtualPet(String name) {
		this.name = name;
		this.hunger = 25;
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

	public int getBoredom() {
		return boredom;
	}

	public int getCleanliness() {
		return cleanliness;
	}

	public int getHealth() {
		return health;
	}

	public abstract String printStats();

	public int play() {
		boredom += 5;
		return boredom;
	}

	public int feed() {
		hunger += 5;
		return hunger;
	}

	public int clean() {
		cleanliness += 5;
		return cleanliness;
	}
	
	public abstract void tick();
	
	public void tickSuperClassVariables() {
		boredom -= 1;
		hunger -= 1;
		cleanliness -= 1;
	}
	
	public void tickHealth() {
		health -= 25;
	}

	public void reducesHealthWhen0() {
		String lostHp = "Sorry your pet " + name + " has lost 25 health points!";

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

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
		increaseHealth();
		return boredom;
	}

	public int feed() {
		hunger += 5;
		increaseHealth();
		return hunger;
	}

	public int clean() {
		cleanliness += 5;
		increaseHealth();
		return cleanliness;
	}
	
	public abstract void tick();
	public abstract String check();
	
	public void tickSuperClassVariables() {
		boredom -= 1;
		hunger -= 1;
		cleanliness -= 1;
		health -= 4;
	}
	
	

	public String checkSuperClassVariables() {
		String checkStatement = "";
		if (hunger <= 0) {
			checkStatement += "Your pet " + name + " is starving, bruh.\nFeed it!";
			hunger = 0;
		}

		if (boredom <= 0) {
			checkStatement += "Your pet " + name + " is bored.  This might lead to depression...\nPlay with it.";
			boredom = 0;
		}

		if (cleanliness <= 0) {
			checkStatement += "What's that smell? It might be " + name + "...  Clean it.";
			cleanliness = 0;
		}

		if (health <= 0) {
			checkStatement += "Sorry your pet " + name + " died!";
			System.exit(0);
		}
		return checkStatement;
	}

	public void increaseHealth() {
		health += 5;
		
	}
	
	@Override 
	public String toString() {
		return "\nName: " + name;
	}
}

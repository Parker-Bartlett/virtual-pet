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
		health += 5;
		increaseHealth(health);
		return boredom;
	}

	public int feed() {
		hunger += 5;
		health += 5;
		increaseHealth(health);
		return hunger;
	}

	public int clean() {
		cleanliness += 5;
		health += 5;
		increaseHealth(health);
		return cleanliness;
	}
	
	public abstract void tick();
	
	public void tickSuperClassVariables() {
		boredom -= 1;
		hunger -= 1;
		cleanliness -= 1;
		health -= 4;
	}
	
	

	public void reducesHealthWhen0() {
		if (hunger <= 0) {
			System.out.println("Your pet " + name + " is starving, bruh.\nFeed it!");
			 hunger = 0;
		}

		if (boredom <= 0) {
			System.out.println("Your pet " + name + " is bored.  This might lead to depression...\nPlay with it.");
			boredom = 0;
		}

		if (cleanliness <= 0) {
			System.out.println("What's that smell? It might be " + name + "...  Clean it.");
			cleanliness = 0;
		}

		if (health <= 0) {
			System.out.println("Sorry your pet " + name + " died!");
			System.exit(0);
		}
	}

	public void increaseHealth(int healthUp) {
		this.health += healthUp;
		
		
		
	}
	
	public void increaseBoredom(int adjustBoredom) {
		this.boredom += adjustBoredom;
		
		//boredom += 5;
		
	
	}
	public int increaseHunger(int hungerUp) {
		
		this.hunger += hungerUp;
		
		return hunger;
		
	}
	
	public int increaseCleanliness(int cleanlinessUp) {
		this.cleanliness += cleanlinessUp;
		
		return cleanliness;
	}
}

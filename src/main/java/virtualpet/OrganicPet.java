package virtualpet;

public class OrganicPet extends VirtualPet {
	
	private int thirst;

	public OrganicPet(String name) {
		super(name);
		
		this.thirst = 25;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public int hydrate() {
		thirst += 5;
		return thirst;
	}
	
	public String printStats() {
		String stats= "Organic Pet - " + this.getName() + ": \nHunger:" +this.getHunger()+ "\nThirst:" +thirst+ "\nBoredom:" +this.getBoredom()+ "\nCleanliness:" +this.getCleanliness()+ "\nHealth:" +this.getHealth();
		return stats;
	}
	
	public void tick() {
		this.tickSuperClassVariables();
		thirst -= 1;
		
		this.reducesHealthWhen0();
		if (thirst <= 0) {
			this.tickHealth();
			System.out.println("Sorry your pet " + this.getName() + " has lost 25 health points!");
		}
	}
		
}

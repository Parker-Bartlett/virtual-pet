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
		super.increaseHealth();
		return thirst;
		
	}
	
	

	public String printStats() {
		String stats= "Organic Pet - " + this.getName() + ": \nHunger:" +this.getHunger()+ "\nThirst:" +thirst+ "\nBoredom:" +this.getBoredom()+ "\nCleanliness:" +this.getCleanliness()+ "\nHealth:" +this.getHealth();
		return stats;
	}
	
	public void tick() {
		this.tickSuperClassVariables();
		thirst -= 1;
	}
	
	public String check() {
		String checkStatement = "";
		checkStatement += this.checkSuperClassVariables();
		if (thirst <= 0) {
			checkStatement += "Your pet," + this.getName() + " is dehydrated. Please Hydrated it.";
		}
		return checkStatement;
	}
		
}

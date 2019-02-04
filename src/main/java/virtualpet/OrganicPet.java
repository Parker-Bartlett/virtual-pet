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
		super.increaseHealth(thirst);
		return thirst;
		
	}
	
	public int increaseThirst(int adjustThirst) {

		this.thirst += adjustThirst;
 
		return thirst;
		
	}
	
	
		
		
		
		
		
	
	

	public String printStats() {
		String stats= "Organic Pet - " + this.getName() + ": \nHunger:" +this.getHunger()+ "\nThirst:" +thirst+ "\nBoredom:" +this.getBoredom()+ "\nCleanliness:" +this.getCleanliness()+ "\nHealth:" +this.getHealth();
		return stats;
	}
	
	public void tick() {
		this.tickSuperClassVariables();
		thirst -= 1;
		if (thirst <= 0) {
			thirst = 0;
			System.out.println("Your pet, " + this.getName() + ", needs the cool refreshing taste of water.");
		}
		this.reducesHealthWhen0();
		
	}
		
}

package virtualpet;

public class RoboticPet extends VirtualPet {

	private int lubrication;

	public RoboticPet(String name) {
		super(name);

		this.lubrication = 25;
	}

	public int getLubrication() {
		return lubrication;
	}

	public int lubricate() {
		lubrication += 5;
		return lubrication;
	}

	public String printStats() {
		String stats = "Robotic Pet - " + this.getName() + ": \nHunger:" + this.getHunger() + "\nLubrication:" + lubrication + "\nBoredom:" + this.getBoredom()
				+ "\nCleanliness:" + this.getCleanliness() + "\nHealth:" + this.getHealth();
		return stats;

	}

	public void tick() {
		this.tickSuperClassVariables();
		lubrication -= 1;

		this.reducesHealthWhen0();
		if (lubrication <= 0) {
			this.tickHealth();
			System.out.println("Sorry your pet " + this.getName() + " has lost 25 health points!");
		}
	}
}
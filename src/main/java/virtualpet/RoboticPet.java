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
		super.increaseHealth(lubrication);
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
	}
	
	public String check() {
		String checkStatement = "";
		checkStatement += this.checkSuperClassVariables();
		if (lubrication <= 0) {
			checkStatement += "Your pet, "+this.getName()+"joints and such are seizing up.";
		}
		return checkStatement;
	}

	public int increaseLubrication(int lubeUp) {
		this.lubrication += lubeUp;

		return lubrication;
		
	}
	
}

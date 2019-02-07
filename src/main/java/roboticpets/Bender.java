package roboticpets;

//change to Bender please.
public class Bender extends RoboticPet {

	public Bender(String name) {
		super(name);

	}

	public String beer() {
		increaseHealth(25);
		increaseBoredom(20);
		increaseLubrication(25);
		increaseCleanliness(-10);
		increaseHunger(20);
		String beer = "BEER IS GOOD!!!!!!!";
		return beer;
	}

	public String nonalcoholicBeer() {
		increaseHealth(-10);
		increaseBoredom(-20);
		increaseLubrication(10);
		increaseCleanliness(10);
		increaseHunger(10);
		String naBeer = "KISS MY SHINY METAL ASS!";
		return naBeer;
	}

	public String coins() {
		increaseHealth(15);
		increaseBoredom(50);
		increaseLubrication(-15);
		increaseCleanliness(0);
		increaseHunger(20);
		String coins = "CHA-CHING!";
		return coins;
	}

	public String elzarsEntree() {
		increaseHealth(25);
		increaseBoredom(50);
		increaseLubrication(35);
		increaseCleanliness(-30);
		increaseHunger(50);
		String entree = "THIS IS SOME GOOD EATIN'!";
		return entree;

	}
	
	@Override
	public String toString() {
		return "Type: Bender Name: " + this.getName() + "\n";
	}

}

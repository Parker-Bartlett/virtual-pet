package roboticpets;

public class MrCoffee extends RoboticPet {

	public MrCoffee(String name) {
		super(name);

	}

	public String darkRoast() {
		increaseHealth(5);
		increaseBoredom(1);
		increaseLubrication(1);
		increaseCleanliness(-3);
		increaseHunger(1);
		String darkRoast = "Thank you for using the coffee maker.";
		return darkRoast;

	}

	public String breakfastBlend() {
		increaseHealth(4);
		increaseBoredom(1);
		increaseLubrication(1);
		increaseCleanliness(-3);
		increaseHunger(1);
		String breakfastBlend = "Your coffee is ready.";
		return breakfastBlend;

	}

	public String vinegar() {
		increaseHealth(10);
		increaseBoredom(1);
		increaseLubrication(10);
		increaseCleanliness(10);
		increaseHunger(1);
		String vinegar = "Your coffee maker is in in top operating condition.";
		return vinegar;
	}

	public String soulsOfTheDead() {
		increaseHealth(500);
		increaseBoredom(20);
		increaseLubrication(25);
		increaseCleanliness(50);
		increaseHunger(200);
		String souls = "I AM THE DARK LORD JUAN VALDEZ AND I WILL DESTROY YOU AND YOUR KEURIG!";
		return souls;

	}

	@Override
	public String toString() {
		return "Type: MrCoffee Name: " + this.getName() + "\n";
	}
}

package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import roboticpets.MrCoffee;

public class RoboticPetTest {

	
@Test
public void shouldBeAbleToCreatePet() {
	VirtualPet pet = new MrCoffee("");

}

@Test
public void petShouldHaveNameJeff() {
	VirtualPet underTest = new MrCoffee("Jeff");

	String expected = underTest.getName();

	assertEquals(expected, "Jeff");
}

@Test
public void petShouldHaveNameWill() {
	VirtualPet underTest = new MrCoffee("Will");

	String expected = underTest.getName();

	assertEquals(expected, "Will");
}

@Test
public void shouldHaveDefaultHunger() {
	VirtualPet underTest = new MrCoffee("Steve");

	int expected = underTest.getHunger();

	assertEquals(expected, 25);
}

@Test
public void shouldHaveDefaultBored() {
	VirtualPet underTest = new MrCoffee("Steve");

	int expected = underTest.getBoredom();

	assertEquals(expected, 25);
}

@Test
public void shouldHavePlayMethodReturnBoredomPlusFive() {
	VirtualPet underTest = new MrCoffee("Steve");

	underTest.play();

	assertEquals(30, underTest.getBoredom());
}

@Test
public void shouldHaveFeedMethodReturnHungerPlusFive() {
	VirtualPet underTest = new MrCoffee("Steve");

	underTest.feed();

	assertEquals(30, underTest.getHunger());
}

@Test
public void shouldHaveDefaultThirst() {
	VirtualPet underTest = new MrCoffee("Steve");

	int expected = ((MrCoffee) underTest).getLubrication();

	assertEquals(expected, 25);
}

@Test
public void tickShouldDecreaseByOne() {
	VirtualPet underTest = new MrCoffee("Steve");
	underTest.tick();

	assertEquals(((MrCoffee) underTest).getLubrication(), 24);

}

@Test
public void tickShouldDecreaseByTwo() {
	VirtualPet underTest = new MrCoffee("Steve");
	// Call tick twice so first variation decreases thirst from 10 to 9,
	// then second variation decreases 9 to 8
	underTest.tick();
	underTest.tick();

	// int expected = underTest..getThirst().tick().getThirst()));

	assertEquals(((MrCoffee) underTest).getLubrication(), 23);
}

@Test
public void healthShouldReturnOneHundred() {
	VirtualPet underTest = new MrCoffee("Steve");
	int hp = underTest.getHealth();
	assertEquals(hp, 100);

}

}
package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import roboticpets.RoboticPet;

public class RoboticPetTest {

	
@Test
public void shouldBeAbleToCreatePet() {
	VirtualPet pet = new RoboticPet("");

}

@Test
public void petShouldHaveNameJeff() {
	VirtualPet underTest = new RoboticPet("Jeff");

	String expected = underTest.getName();

	assertEquals(expected, "Jeff");
}

@Test
public void petShouldHaveNameWill() {
	VirtualPet underTest = new RoboticPet("Will");

	String expected = underTest.getName();

	assertEquals(expected, "Will");
}

@Test
public void shouldHaveDefaultHunger() {
	VirtualPet underTest = new RoboticPet("Steve");

	int expected = underTest.getHunger();

	assertEquals(expected, 25);
}

@Test
public void shouldHaveDefaultBored() {
	VirtualPet underTest = new RoboticPet("Steve");

	int expected = underTest.getBoredom();

	assertEquals(expected, 25);
}

@Test
public void shouldHavePlayMethodReturnBoredomPlusFive() {
	VirtualPet underTest = new RoboticPet("Steve");

	underTest.play();

	assertEquals(30, underTest.getBoredom());
}

@Test
public void shouldHaveFeedMethodReturnHungerPlusFive() {
	VirtualPet underTest = new RoboticPet("Steve");

	underTest.feed();

	assertEquals(30, underTest.getHunger());
}

@Test
public void shouldHaveDefaultThirst() {
	VirtualPet underTest = new RoboticPet("Steve");

	int expected = ((RoboticPet) underTest).getLubrication();

	assertEquals(expected, 25);
}

@Test
public void tickShouldDecreaseByOne() {
	VirtualPet underTest = new RoboticPet("Steve");
	underTest.tick();

	assertEquals(((RoboticPet) underTest).getLubrication(), 24);

}

@Test
public void tickShouldDecreaseByTwo() {
	VirtualPet underTest = new RoboticPet("Steve");
	// Call tick twice so first variation decreases thirst from 10 to 9,
	// then second variation decreases 9 to 8
	underTest.tick();
	underTest.tick();

	// int expected = underTest..getThirst().tick().getThirst()));

	assertEquals(((RoboticPet) underTest).getLubrication(), 23);
}

@Test
public void healthShouldReturnOneHundred() {
	VirtualPet underTest = new RoboticPet("Steve");
	int hp = underTest.getHealth();
	assertEquals(hp, 100);

}

}
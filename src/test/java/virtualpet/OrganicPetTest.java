package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import organicpets.Dog;
import organicpets.Dog;

public class OrganicPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet pet = new Dog("");

	}

	@Test
	public void petShouldHaveNameJeff() {
		VirtualPet underTest = new Dog("Jeff");

		String expected = underTest.getName();

		assertEquals(expected, "Jeff");
	}

	@Test
	public void petShouldHaveNameWill() {
		VirtualPet underTest = new Dog("Will");

		String expected = underTest.getName();

		assertEquals(expected, "Will");
	}

	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new Dog("Steve");

		int expected = underTest.getHunger();

		assertEquals(expected, 25);
	}

	@Test
	public void shouldHaveDefaultBored() {
		VirtualPet underTest = new Dog("Steve");

		int expected = underTest.getBoredom();

		assertEquals(expected, 25);
	}

	@Test
	public void shouldHavePlayMethodReturnBoredomPlusFive() {
		VirtualPet underTest = new Dog("Steve");

		underTest.play();

		assertEquals(30, underTest.getBoredom());
	}

	@Test
	public void shouldHaveFeedMethodReturnHungerPlusFive() {
		VirtualPet underTest = new Dog("Steve");

		underTest.feed();

		assertEquals(30, underTest.getHunger());
	}

	@Test
	public void shouldHaveDefaultThirst() {
		VirtualPet underTest = new Dog("Steve");

		int expected = ((Dog) underTest).getThirst();

		assertEquals(expected, 25);
	}

	@Test
	public void tickShouldDecreaseByOne() {
		VirtualPet underTest = new Dog("Steve");
		underTest.tick();

		assertEquals(((Dog) underTest).getThirst(), 24);

	}

	@Test
	public void tickShouldDecreaseByTwo() {
		VirtualPet underTest = new Dog("Steve");
		// Call tick twice so first variation decreases thirst from 10 to 9,
		// then second variation decreases 9 to 8
		underTest.tick();
		underTest.tick();

		// int expected = underTest..getThirst().tick().getThirst()));

		assertEquals(((Dog) underTest).getThirst(), 23);
	}

	@Test
	public void healthShouldReturnOneHundred() {
		VirtualPet underTest = new Dog("Steve");
		int hp = underTest.getHealth();
		assertEquals(hp, 100);

	}
	
}

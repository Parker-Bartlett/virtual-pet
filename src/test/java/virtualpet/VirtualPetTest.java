package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet pet = new VirtualPet("");

	}

	@Test
	public void petShouldHaveNameJeff() {
		VirtualPet underTest = new VirtualPet("Jeff");

		String expected = underTest.getName();

		assertEquals(expected, "Jeff");
	}

	@Test
	public void petShouldHaveNameWill() {
		VirtualPet underTest = new VirtualPet("Will");

		String expected = underTest.getName();

		assertEquals(expected, "Will");
	}

	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getHunger();

		assertEquals(expected, 25);
	}

	@Test
	public void shouldHaveDefaultBored() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getBoredom();

		assertEquals(expected, 25);
	}

	@Test
	public void shouldHavePlayMethodReturnBoredomPlusFive() {
		VirtualPet underTest = new VirtualPet("Steve");

		underTest.play();

		assertEquals(30, underTest.getBoredom());
	}

	@Test
	public void shouldHaveFeedMethodReturnHungerPlusFive() {
		VirtualPet underTest = new VirtualPet("Steve");

		underTest.feed();

		assertEquals(30, underTest.getHunger());
	}

	@Test
	public void shouldHaveDefaultThirst() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getThirst();

		assertEquals(expected, 25);
	}

	@Test
	public void tickShouldDecreaseByOne() {
		VirtualPet underTest = new VirtualPet("Steve");
		underTest.tick();

		assertEquals(underTest.getThirst(), 24);

	}

	@Test
	public void tickShouldDecreaseByTwo() {
		VirtualPet underTest = new VirtualPet("Steve");
		// Call tick twice so first variation decreases thirst from 10 to 9,
		// then second variation decreases 9 to 8
		underTest.tick();
		underTest.tick();

		// int expected = underTest..getThirst().tick().getThirst()));

		assertEquals(underTest.getThirst(), 23);
	}

	@Test
	public void healthShouldReturnOneHundred() {
		VirtualPet underTest = new VirtualPet("Steve");
		int hp = underTest.getHealth();
		assertEquals(hp, 100);

	}
	
}

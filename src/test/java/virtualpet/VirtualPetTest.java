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

		assertEquals(expected, 10);
	}

	@Test
	public void shouldHaveDefaultBored() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getBoredom();

		assertEquals(expected, 10);
	}

	@Test
	public void shouldHavePlayMethodReturnBoredomPlusFive() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.play();

		assertEquals(expected, underTest.getBoredom() + 5);
	}

	@Test
	public void shouldHaveFeedMethodReturnHungerPlusFive() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.feed();

		assertEquals(expected, underTest.getHunger() + 5);
	}

	@Test
	public void shouldHaveDefaultThirst() {
		VirtualPet underTest = new VirtualPet("Steve");

		int expected = underTest.getThirst();

		assertEquals(expected, 10);
	}

	@Test
	public void tickShouldDecreaseByOne() {
		VirtualPet underTest = new VirtualPet("Steve");
		underTest.tick();

		assertEquals(underTest.getThirst(), 9);

	}

	@Test
	public void tickShouldDecreaseByTwo() {
		VirtualPet underTest = new VirtualPet("Steve");
		// Call tick twice so first variation decreases thirst from 10 to 9,
		// then second variation decreases 9 to 8
		underTest.tick();
		underTest.tick();

		// int expected = underTest..getThirst().tick().getThirst()));

		assertEquals(underTest.getThirst(), 8);
	}

	// @Test
	// public void tickShouldNotMakeThirstGoNegative() {
	// VirtualPet underTest = new VirtualPet("Steve");
	// // Call tick twice so first variation decreases thirst from 10 to 9,
	// // then second variation decreases 9 to 8
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	// underTest.tick();
	//
	// // int expected = underTest..getThirst().tick().getThirst()));
	//
	// assertEquals(underTest.getThirst(), 0);
	// }

	@Test
	public void healthShouldReturnOneHundred() {
		VirtualPet underTest = new VirtualPet("Steve");
		int hp = underTest.getHealth();
		assertEquals(hp, 100);

	}
	@Test
	public void letsGoToTheShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		
	}
	
	@Test
	public void letsPutaDogInTheShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		
	}
	@Test
	public void returnListofanimals() {
		//act
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new VirtualPet("Booker");
		underTest.addPet(underTestDog);
		int size = underTest.getLength();
		
		//arrange
		
		
		//assert
		assertEquals(1, size);
		
		
		
		
	}

}

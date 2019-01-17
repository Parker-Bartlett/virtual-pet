package virtualpet;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.wecancodeit.VirtualPet;

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
//	    }
//	    
//	    @Test
//	    public void shouldHaveFiveHunger() {
//	        VirtualPet underTest = new VirtualPet("Steve");
//
//	        int expected = underTest.getHunger();
//
//	        assertEquals(expected, 5);
//	    }
//	    
	}
}

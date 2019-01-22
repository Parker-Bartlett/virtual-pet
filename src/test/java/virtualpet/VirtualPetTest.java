package virtualpet;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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

	       // int expected = underTest..getThirst().tick().getThirst()));

	        assertEquals(underTest.getThirst(), 9);
	    }
	  
	  @Test
	    public void tickShouldDecreaseByTwo() {
	        VirtualPet underTest = new VirtualPet("Steve");
	        //Call tick twice so first variation decreases thirst from 10 to 9, then second variation decreases 9 to 8
	        underTest.tick();
	        underTest.tick();

	       // int expected = underTest..getThirst().tick().getThirst()));

	        assertEquals(underTest.getThirst(), 8);
	    }
	  
	  @Test
	    public void tickShouldNotMakeThirstGoNegative() {
	        VirtualPet underTest = new VirtualPet("Steve");
	        //Call tick twice so first variation decreases thirst from 10 to 9, then second variation decreases 9 to 8
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        underTest.tick();
	        	
	       // int expected = underTest..getThirst().tick().getThirst()));

	        assertEquals(underTest.getThirst(), 0);
	    }
}
	
    

	


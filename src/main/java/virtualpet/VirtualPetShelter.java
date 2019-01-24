package virtualpet;

import java.util.ArrayList;

public class VirtualPetShelter {
	
	private	ArrayList<VirtualPet> list = new ArrayList<VirtualPet>();
	
	public VirtualPetShelter() {
		
	}//closer petshelter method
		
	
	/**
	 * 
	 * @param pet
	 */
	// Adds pet to the list
	public void addPet(VirtualPet pet) {
		list.add(pet);	
		
	}	
	
	// Return size of the array
	public int getLength() {
		return list.size();
	}
	
	public void feedAll() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).feed();
		}
	}
	
}//close class

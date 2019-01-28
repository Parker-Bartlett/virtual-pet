package virtualpet;

import java.util.HashMap;

public class VirtualPetShelter {
	
	
	
	private	HashMap<String, VirtualPet> list = new HashMap<String, VirtualPet>();
	
	public VirtualPetShelter() {
		
	}//closer petshelter method
		
	
	/**
	 * 
	 * @param pet
	 */
	// Adds pet to the list
	public void addPet(VirtualPet pet) {
		list.put(pet.getName(), pet);	
		
	}
	
	public void removePet (VirtualPet pet) {
		list.remove(pet.getName());
	}
	
	// Return size of the HashMap
	public int getLength() {
		return list.size();
	}
	
	public void feedAll() {
		for (VirtualPet pet : list.values()) {
			pet.feed();
		}
	}
	
	public void cleanAll() {
		for (VirtualPet pet : list.values()) {
			pet.clean();
		}
	}
	
	public void hydrateAll() {
		for (VirtualPet pet : list.values()) {
			pet.hydrate();
		}
	}
	
	public void playAll() {
		for (VirtualPet pet : list.values()) {
			pet.play();
		}
	}
	
}//close class

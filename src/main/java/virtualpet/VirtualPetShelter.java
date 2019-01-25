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
		for (int i = 0; i < list.size(); i++) {
			list.get(i).feed();
		}
	}
	
	public void cleanAll() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).clean();		
			}
	}
	
	public void hydrateAll() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).hydrate();		
			}
	}
	
	public void playAll() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).play();		
			}
	}
	
}//close class

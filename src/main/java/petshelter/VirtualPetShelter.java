package petshelter;

import java.util.Collection;
import java.util.HashMap;

import organicpets.OrganicPet;
import roboticpets.RoboticPet;
import virtualpet.VirtualPet;

public class VirtualPetShelter {

	private HashMap<String, VirtualPet> list = new HashMap<String, VirtualPet>();

	public VirtualPetShelter() {

	}// closer petshelter method

	/**
	 * 
	 * @param pet
	 */
	// Adds pet to the list
	public void addPet(VirtualPet pet) {
		list.put(pet.getName(), pet);

	}
	
	public boolean checkIfListContains(String name) {
		if (list.containsKey(name)) {
			return true;
		}
		return false;
	}

	public VirtualPet getPet(String petToGet) {
		return list.get(petToGet);
	}

	public void removePet(VirtualPet pet) {
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
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).hydrate();
			}
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).lubricate();
			}
		}
	}

	public void playAll() {
		for (VirtualPet pet : list.values()) {
			pet.play();
		}
	}

	public void tickAll() {
		for (VirtualPet pet : list.values()) {
			pet.tick();
		}
	}
	
	public String checkAll() {
		String checkStatement = "";
		for (VirtualPet pet : list.values()) {
			checkStatement += pet.check();
		}
		return checkStatement;
	}

//	public String listPets() {
//		for (VirtualPet pet : list.values()) {
//			if (pet instanceof OrganicPet) {
//				String listPetsOrganic = "Organic Pet - Name: " + pet.getName();
//				return listPetsOrganic;
//			}
//			if (pet instanceof RoboticPet) {
//				String listPetsRobotic = "Robotic Pet - Name:" + pet.getName();
//				return listPetsRobotic;
//			}
//		}
//		return null;
//	}

	public String statusOfAllPets() {
		String statStatementForAll = "Pet Stats\n";
		for (VirtualPet pet : list.values()) {
			statStatementForAll += pet.printStats() + "\n";
		}
		return statStatementForAll;
	}

	public Collection<VirtualPet> getVirtualPets() {
		return list.values();
	}
}// close class
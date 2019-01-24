package virtualpet;

import java.util.ArrayList;

public class VirtualPetShelter {
//    VirtualPet dog = new VirtualPet("Bosco");
//	VirtualPet cat = new VirtualPet("Mittens");
//	VirtualPet horse = new VirtualPet("Sarah Jessica Parker");
	
	//ArrayList<VirtualPet> list = new ArrayList<VirtualPet>();
	
	 
	
	
	
		ArrayList<VirtualPet> list = new ArrayList<VirtualPet>();
		
		
	public void addPet(VirtualPet pet) {
		list.add(pet);
		
		
	}	
		
	
	
	
	
	

	public VirtualPetShelter() {
		
		
	}//closer petshelter method







	public int getLength() {
		return list.size();
	}
	
	
	
	

	
}//close class

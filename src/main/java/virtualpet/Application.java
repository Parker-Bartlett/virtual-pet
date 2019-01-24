package virtualpet;

import java.util.Scanner;

public class Application {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What would you like to name your pet?");
        String name = input.next();
        
        VirtualPet pet = new VirtualPet(name);
        System.out.println("Meet " + pet.getName() + "!");
        
        //Intro and tutorial
        System.out.println(pet.printStats());
        
        System.out.println("hunger " + pet.feed());
        
        
//        for (int i = 0; i < 11; i++) {
//            pet.tick();
//            System.out.println(pet.getBoredom() +" "+  pet.getHunger() + " " +  pet.getThirst() + " " +  pet.getCleanliness());
//        

        
        input.close();
        } 
    
    
}


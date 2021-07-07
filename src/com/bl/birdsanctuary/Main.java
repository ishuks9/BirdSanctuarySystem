package com.bl.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		
        System.out.println("welcome to bird sanctuary");
        
        Bird duck = new Duck("d1");
        Bird parrot = new Parrot("p1");
        Bird penguin = new Penguin("pn1");
        Bird pigeon = new Pigeon("pg1");
         
        BirdSanctuaryManager dataManager = new BirdSanctuaryManager();
        
        dataManager.add(penguin);
        dataManager.add(parrot);
        dataManager.add(duck);
        dataManager.add(pigeon);
        
        dataManager.print();
        
        dataManager.remove(pigeon);
        System.out.println("this is remove method");
        dataManager.print();
       
	}
}

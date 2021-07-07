package com.bl.birdsanctuary;

public class Pigeon extends Bird {

	public Pigeon(String id) {
		this.id = id;
		color = "grey";
		name = "Pigeon";
	}
	
	@Override
	public void fly() {
		System.out.println("Pigeon is flying");
	}
	
	@Override
	public void swim() {
		
		
	}

}

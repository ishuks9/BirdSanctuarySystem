package com.bl.birdsanctuary;

public class Parrot extends Bird {
	
	public Parrot(String id) {
		this.id = id;
		color = "green";
		name = "Parrot";
	}
	
	@Override
	public void fly() {
		System.out.println("Parrot is flying");
	}
	
	@Override
	public void swim() {
		
		
	}
}

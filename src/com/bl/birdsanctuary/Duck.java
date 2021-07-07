package com.bl.birdsanctuary;

public class Duck extends Bird {
	public Duck(String id) {
		this.id = id;
		color = "white";
		name = "duck";
	}
	
	@Override
	public void fly()
	{
		System.out.println("Duck is flying");
	}
	
	@Override
	public void swim()
	{
		System.out.println("Duck is swimming");
		
	}
     
	
}

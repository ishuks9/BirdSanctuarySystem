package com.bl.birdsanctuary;

public class Penguin extends Bird {
	public Penguin(String id) {
		this.id = id;
		color = "black";
		name = "penguin";
	}
	
	@Override
	public void fly()
	{
		
	}
	
	@Override
	public void swim()
	{
		System.out.println("penguin is swimming");
		
	}
}

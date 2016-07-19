package com.softpath.inheritance;

public class Animal {
	
	protected int age;
	
	protected void eat()
	{
		System.out.println("Animal is eating");
	}
	
	@Override
	public String toString()
	{
		return "I'm an Animal!" ;
	}
}

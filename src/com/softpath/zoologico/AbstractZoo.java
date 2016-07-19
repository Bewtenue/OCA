package com.softpath.zoologico;

public abstract class AbstractZoo {
	

	public abstract void show();
	public abstract void parking();
	
	public void sellTicket()
	{
		System.out.println("The Zoo has selled a ticket in $1");
	}
	
	public void cleaning()
	{
		System.out.println("The Zoo has been selled");
	}
	
	
}

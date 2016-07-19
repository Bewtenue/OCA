package com.softpath.serializacion;

import java.io.Serializable;

public class MXPresidents implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private transient String period;
	private String party;
	
	public MXPresidents (String name,String period,String partido)
	{
		this.name = name;
		this.period = period;
		this.party = partido;
	}
	
	
	@Override
	public String toString(){
		return "Mexican President: " + name + " period: " + period + " partido: " + party;
	}
	
	
}

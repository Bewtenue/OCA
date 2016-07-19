package com.softpath.inheritance;

public class Sub extends Base{
	public Sub(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub("Start");
	}
}

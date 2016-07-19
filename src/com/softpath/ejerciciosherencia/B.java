package com.softpath.ejerciciosherencia;

public final class B extends A{

	
	

	public static void main(String[] args) {
		B obj1 = new B();
		A obj2 = new A();
		obj1.setId("1");
		obj2.setId("1");
		System.out.println(obj2.equals(obj1));
		
	}
}

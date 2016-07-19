package com.softpath.inheritance;

public class Dog extends Animal{
	
	public void ladrar()
	{
		System.out.println("Dog is barking");
	}
	
	public Dog(){
		
	}
	@Override//sirve para declarar que el metodo se esta sobreescribiendo
	//si la clase padre tiene un tipo de modificador de accesibilidad, en la 
	//sobreescritura solo se puede aumentar el tipo de visibilidad y no disminuirla
	//dando por hecho que public es la mayor visibilidad y private la menor
	public void eat()
	{
		System.out.println("The dog is eating");
	}
	
	@Override
	public String toString()
	{
		return "I'm a dog!";
	}
	
	
}

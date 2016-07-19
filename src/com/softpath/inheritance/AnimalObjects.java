package com.softpath.inheritance;

public class AnimalObjects {
	public static void main(String[] args) {
		
		//Dog perro = new Dog();
		//perro.eat();
		
		Animal animal = new Dog();//aunque sea de tipo animal, puede crear objetos de la clase hijo
		//animal.eat();
		
		//Dog dog = new Animal();//No se puede hacer objetos padre de un hijo
		System.out.println(animal);
		
	}
}

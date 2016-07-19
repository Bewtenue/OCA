package com.softpath.interfacepackage;
//por lo menos se tiene que definir un metodo abstracto para que sea una clase
//abstracta
//una clase abstracta no se puede instanciar
public abstract class Printer {
	
	public abstract void print(Object document);
	public void turn()
	{
		System.out.println("Turning on");
	}
	
	
	
	
}

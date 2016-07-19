package com.softpath.objects;

//Para optimizar los programas importar las clases necesarias y no todas

import java.util.ArrayList;
import java.util.List;


public class Box {
	
	int lenght;
	int width;
	int height;
	//final asigna una direccion de memoria definitiva
	final int NUMBER_OF_MONTHS = 12;
	
	//usar this para diferenciar el atributo del objeto de la variable del constructor
	public Box(int lenght, int width, int height)
	{
		this.lenght = lenght;
		this.width = width;
		this.height = height;		
	}
	
	public int getWidht(){
		return this.width;
	}
	
	public static void main(String[] args) {
		Box box = new Box(12,12,12);
		int ancho = box.getWidht();
		System.out.println(ancho);
	}
	
	
}

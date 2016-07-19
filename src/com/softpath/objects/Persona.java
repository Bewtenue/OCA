package com.softpath.objects;

public class Persona {
	
	int dinero;
	
	public int getDinero()
	{	
		return this.dinero;
	}
	
	public int getDinero(float nomina,char c)
	{
		return this.dinero;
	}
	
	public int getDinero(char c, float nomina)
	{
		return this.dinero;
	}
	
	//SOBRECARGA DE METODOS
	
	/*
	 * un metodo puede ser llamado segun los parametros que se hayan puesto
	 * 
	 * */
	
	public int getDinero(int i)
	{
		return i * 2;
	}
	
	public long getDinero(long l)
	{
		return l * 3;
	}
	
	public static void main(String[] args) {
		//Persona persona = new Persona();
		//persona.getDinero(3,'3');
		Persona persona = new Persona();
		persona.getDinero(3L);	
	}
	
	
	
	
}

package com.softpath.objects;

public class ExcepcionDivisionPorZero extends Exception{
	
	@Override
	public String toString(){
		return "No se puede dividir entre 0";
	}
	
}

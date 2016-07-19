package com.softpath.exceptions;
//Tambien puedes hacer tus propias excepciones
public class JesusException extends Exception{
	
	@Override
	public String toString(){
		return "La letra ya esta en mayuscula";
	}
	
	
}

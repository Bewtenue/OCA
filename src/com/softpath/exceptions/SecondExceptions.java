package com.softpath.exceptions;

public class SecondExceptions {
	//esta es otra forma de hacer excepciones
	//el metodo tiene la palabra throws y el tipo de excepcion
	//y donde defines la excepcion es throw
	
	public String capitalize(String s) throws NullPointerException,JesusException
	{
		if(s == null)
		{
			throw new NullPointerException("Estas mandando un valor  null");
		}
		Character firstChar = s.charAt(0);
		if(Character.isUpperCase(firstChar))
		{
			throw new JesusException();
		}
		String theRest = s.substring(1);
		return firstChar.toString().toUpperCase() + theRest;
		
		
	}
	public static void main(String[] args) throws NullPointerException,JesusException{
		SecondExceptions ex = new SecondExceptions();
		//System.out.println(ex.capitalize(null));
		System.out.println(ex.capitalize("Jesus"));
	}
	
}

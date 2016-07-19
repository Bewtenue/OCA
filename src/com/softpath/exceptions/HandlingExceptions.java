package com.softpath.exceptions;

import java.util.Scanner;

//hay 2 maneras de clasificar las excepciones, las de tipo check y las de uncheck
//las de tipo check son las que se lanzan en tiempo de compilacion
//las de tipo uncheck son las que se lanzan en tiempo de ejecucion
//el manejo de excepciones consiste en usar try y poner el bloque de codigo potencial
//a errores, seguido de un catch donde se especifica el tipo de excepcion esperada
//y luego se ejecuta el bloque en caso de que entre una excepcion
//puede haber catchs anidados
//y al final usar finally que es el codigo que se ejecuta independientemente de si 
//se atraparon excepciones o no
// puede haber
// try - catch
// try - n cantidad de catch
// try - finally
// try - catch - finally
// try - n cantidad de catch - finally

public class HandlingExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		try
		{
			double number = Double.parseDouble(input);
			System.out.printf("Result : %s" , number);
		}//Tambien se puede hacer varias tipos de excepciones
		catch(NumberFormatException | ArithmeticException e)
		{
			System.out.println("Eso no lo puedo hacer  " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception from parent class" + e.getMessage());
		}
		finally{
			System.out.println("Executing finally");
		}
		sc.close();
	}
}

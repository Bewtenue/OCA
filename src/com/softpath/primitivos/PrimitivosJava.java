package com.softpath.primitivos;

public class PrimitivosJava {
	
	//En esta clase nosotros declararemos datos primitivos en Java
	
	public static void main(String[] args)
	{
		//Este es un comentario
		/*
		 * Este es otro comentario
		 * 
		 * 
		 * Este es otro comentario
		 * 
		 * Este es otro comentario
		 * */
		//Alcance de las variables
		
		byte x = 127;
		byte y = -128;
		
		short a = -32768;
		short b = 32767;
		
		int w = -2147483648;
		int q = 2147483647;
		
		long lo = -9223372036854775808l;//el compilador interpreta los numeros como enteros
		long lo1 = 9223372036854775807L;//se debe agregar una "l" o una "L" para corregirlo
		
		float f = 14e-45f;
		float f1 = 3.4028234e38F;
		float pi = 3.1416f;
		float positive = 9.00033e+3F;
		
		double d = 4.9e-324;
		double max = 1.797693e308;
		
		char c = 'w';
		char c1 = '\u00A3';
		
		boolean bo = true;
		boolean bo2 = false;
		
		//ser explicito a la hora de declarar variables
		//System.out.println(c1);
		//puedes escribir sysout y presionar ctrl + espacio para acortar tiempo
		//System.out.println();
		
		//Formas de definir variables
		byte salary;
		int salary2;
		short _salario1;
		long salary_per_month;
		double javaCourse;//esta es la mejor convencion para mas de 1 palabra 
						//empiezas con minusculas y las demas letras con mayusculas
		
		//no se permite iniciar con un numero las variable
		//no se puede usar "+" , "-"
		
		final int COUNT_USERS = 50;//una constante debe definirse en mayusculas
		
		
	}
}

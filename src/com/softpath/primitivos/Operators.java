package com.softpath.primitivos;

public class Operators {
	
	public static void main(String[] args){
		
		//Operadores Unarios
		float x = 4.5f;
		float y = -x;
		float z = +x;
		System.out.println(x + " " + y + " " + z);
		//Operador de incremento "--"
		
		int x1 = 4;
		++x1;// 1 + x
		x1++;// x + 1
		
		int x2 = 4;
		int y2 = ++x2;
		// y2 = 5 | x2 = 5
		
		int x3 = 4;
		int y3 = x3++;
		// y3 = 4 | x3 = 5
		
		//Operador de decremento "++"
		
		int a = 4;
		int b = --a;
		// a = 3 | b = 3
		
		int a1 = 4;
		int b2 = a1--;
		// a1 = 3 | b = 4
		
		//Operadores Logicos
		// Negacion "!"
		boolean f = false;
		boolean fFalso = !f;
		
		//Operadores Aritmeticos
		// Suma "+"
		byte op = 3;
		int op1 = op + 5;
		int op2 = 2000000000;
		int error = op2 + op2;
		
		System.out.println(error);
		
		// Resta "-"
		int res = 3;
		int res2 = 4 - res;
		
		//Multiplicacion
		int mult = 2;
		int mult2 = mult * mult;
		//Division
		int div = 4;
		int div2 = div / div;
		
		//Modulo (deja el residuo de una division)
		
		//Operadores de igualdad
		int i, j;
		// i != j | i == j
		
		//Operadores relacionales
		// <,>,<=,>=, instanceof
		System.out.println(3>3);
		
		//Operadores condicionales
		// "&&" , "||" , "?:"
		//ejemplo del "?:"
		int cond = (8 < 4) ? 2:4;
		System.out.println(cond);
		// es bueno usar parentesis para definir como se realiza una expresion
		int ejem = 1;
		int ejem2 = 2;
		int ejem3 = 3;
		int ejem4 = (ejem + ejem2) * ejem3;
		System.out.println(ejem4);
		
		
		
		
		
		
	}
	
	
	
}

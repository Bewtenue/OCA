package com.softpath.primitivos;
import java.util.Scanner;

public class Entero {
	//Programa para verificar si un numero es entero o es impar
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int esPar = sc.nextInt();
		
		if( esPar % 2 == 0)
		{
			System.out.println("El numero es par");
		}
		else
		{
			System.out.println("El numero es impar");
		}
	}
}

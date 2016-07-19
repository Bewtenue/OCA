package com.softpath.innerclasses;

import java.util.Scanner;

public class Calculadora {
	interface CalculadoraInner{
		public int suma(int elemento1, int elemento2);
		public int resta(int elemento1, int elemento2);
	}
	
	public void calcula(){
		
		
		class SumaElementos implements CalculadoraInner{

			@Override
			public int suma(int elemento1, int elemento2) {
				// TODO Auto-generated method stub
				return elemento1+elemento2;
			}

			@Override
			public int resta(int elemento1, int elemento2) {
				// TODO Auto-generated method stub
				return 0;
			}			
		}
		SumaElementos objetoSuma = new SumaElementos();
		
		CalculadoraInner objetoResta = new CalculadoraInner() {
			
			@Override
			public int suma(int elemento1, int elemento2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int resta(int elemento1, int elemento2) {
				// TODO Auto-generated method stub
				return elemento1-elemento2;
			}
		};
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Escoge una opcion");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("0.Salir");
		opcion = sc.nextInt();
		switch(opcion){
		case 1:
			System.out.println("Ingresa el primer numero");
			int elemento1 = sc.nextInt();
			System.out.println("Ingresa el segundo numero");
			int elemento2 = sc.nextInt();
			System.out.println("El resultado es : " + objetoSuma.suma(elemento1, elemento2));
			break;
		case 2:
			System.out.println("Ingresa el primer numero");
			elemento1 = sc.nextInt();
			System.out.println("Ingresa el segundo numero");
			elemento2 = sc.nextInt();
			System.out.println("El resultado es : " + objetoResta.resta(elemento1, elemento2));
			break;
		default:
			System.out.println("Esa no es una opcion valida");
		}
		
		}while(opcion!=0);
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.calcula();
	}
	
}

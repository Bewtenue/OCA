package com.softpath.objects;

import java.util.InputMismatchException;
import java.util.Scanner;

//terminar calculadora
public class Calculadora {
	int num1;
	int num2;
	
	public Calculadora(int num1Value,int num2Value)
	{
		num1 = num1Value;
		num2 = num2Value;
	}
	
	int sumaNumeros(int value1,int value2)
	{
		int res=0;
		res = this.num1 + this.num2;
		return res;
	}
	
	int restaNumeros(int value1,int value2)
	{
		int res=0;
		res = this.num1 - this.num2;
		return res;
	}
	
	int multiplicaNumeros()
	{
		int res=0;
		res = this.num1 * this.num2;
		return res;
	}
	
	float divideNumeros() throws ExcepcionDivisionPorZero
	{
		if((float)this.num2 == 0)
		{
			throw new ExcepcionDivisionPorZero();
		}
		float res=0;
		res = (float)this.num1 / (float)this.num2;
		return res;
	}
	
	
	public static void main(String[] args) throws ExcepcionDivisionPorZero {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int input2 = 0;
		int opcion = 1;
		do
		{
			System.out.println("Que operacion deseas hacer");
			System.out.println("1.Multipliacion");
			System.out.println("2.Division");
			System.out.println("0.Salir");
			try
			{
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Solo se aceptan numeros no se puede introducir : " + e.getMessage());
			}
			
			switch(opcion){
			case 1:
				try
				{
					System.out.println("Ingresa un numero");
					input = sc.nextInt();
					System.out.println("Ingresa segundo numero");
					input2 = sc.nextInt();
					Calculadora calc = new Calculadora(input,input2);
					System.out.println("El resultado de la multiplicacion es : " + calc.multiplicaNumeros() );
				}
				catch(InputMismatchException e)
				{
					System.out.println("Solo se aceptan numeros no se puede introducir : " + e.getMessage());
				}
				break;
			case 2:
				try
				{
					System.out.println("Ingresa un numero");
					input = sc.nextInt();
					System.out.println("Ingresa segundo numero");
					input2 = sc.nextInt();
					Calculadora calc = new Calculadora(input,input2);
					System.out.println("El resultado de la division es : " + calc.divideNumeros() );
				}
				catch(InputMismatchException e)
				{
					System.out.println("Solo se aceptan numeros no se puede introducir : " + e);
				}
				finally{
					
				}
				break;
			case 0:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("No es una opcion disponible");
			}
		}while(opcion!=0);
	}
}

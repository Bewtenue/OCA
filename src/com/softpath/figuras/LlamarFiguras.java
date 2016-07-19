package com.softpath.figuras;

import java.util.Scanner;

public class LlamarFiguras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do{
			System.out.println("Selecciona una opcion");
			System.out.println("1.Cuadrado");
			System.out.println("2.Triangulo");
			System.out.println("3.Circulo");
			System.out.println("0.Salir");
			opcion = sc.nextInt();
			switch(opcion){
			case 1:
				System.out.println("Ingresa el tamaño del lado del cuadrado");
				int basec = sc.nextInt();
				System.out.println("Ingresa la altura del cuadrado");
				int alturac = sc.nextInt();
				System.out.println("Selecciona una opcion");
				System.out.println("1.Area");
				System.out.println("2.Perimetro");
				opcion = sc.nextInt();
				switch(opcion){
				case 1:
					Cuadrado cuadradoA = new Cuadrado(basec,alturac);
					System.out.println("El area del cuadrado es : " + cuadradoA.area());
					
					break;
				case 2:
					Cuadrado cuadradoP = new Cuadrado(basec,alturac);
					System.out.println("El perimetro del cuadrado es : " + cuadradoP.perimetro());
					break;
				default:
					System.out.println("Opcion no valida, regresando al menu principal");
				
				}
				break;
			case 2:
				System.out.println("Selecciona una opcion");
				System.out.println("1.Area");
				System.out.println("2.Perimetro");
				opcion = sc.nextInt();
				switch(opcion){
				case 1:
					System.out.println("Ingresa la base del triangulo");
					int baseTrianguloArea = sc.nextInt();
					System.out.println("Ingresa la altura del triangulo");
					int alturaTrianguloArea = sc.nextInt();
					Triangulo triangulo = new Triangulo(baseTrianguloArea,alturaTrianguloArea);
					System.out.println("El area es : "+ triangulo.area());
					break;
				case 2:
					System.out.println("Ingresa el lado 1 del triangulo");
					int lado1Triangulo = sc.nextInt();
					System.out.println("Ingresa el lado 2 del triangulo");
					int lado2Triangulo = sc.nextInt();
					System.out.println("Ingresa el lado 3 del triangulo");
					int lado3Triangulo = sc.nextInt();
					Triangulo trianguloPer = new Triangulo(lado1Triangulo,lado2Triangulo,lado3Triangulo);
					System.out.println("El area es : "+ trianguloPer.area());
					break;
				default:
					System.out.println("Opcion no valida, regresando al menu principal");
				
				}
				break;
			case 3:
				System.out.println("Ingresa el radio del Circulo");
				double radio = sc.nextDouble();
				System.out.println("Selecciona una opcion");
				System.out.println("1.Area");
				System.out.println("2.Perimetro");
				opcion = sc.nextInt();
				switch(opcion){
				case 1:
					Circulo circuloArea = new Circulo (radio);
					System.out.println("El area del circulo es : " + circuloArea.area());
					break;
				case 2:
					Circulo circuloPerimetro = new Circulo(radio);
					System.out.println("El perimetro del circulo es : " + circuloPerimetro.perimetro());
					break;
				default:
					System.out.println("Opcion no valida, regresando al menu principal");
				
				}
				break;
			case 0:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("No es opcion valida");
			}
		}while(opcion !=0);
		
		
	}
}

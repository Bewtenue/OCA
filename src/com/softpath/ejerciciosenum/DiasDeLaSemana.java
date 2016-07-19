package com.softpath.ejerciciosenum;

import java.util.Scanner;

enum Dias{
	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
}

public class DiasDeLaSemana {
	
	Dias dias;
	String entrada;
	
	public DiasDeLaSemana(String entrada){
		this.entrada = entrada;
	}
	
	public DiasDeLaSemana(){
		
	}
	
	public void empiezaLaSemana(){
		switch(entrada){
		case "DOMINGO":
			if(Dias.DOMINGO.toString().equals(entrada.toUpperCase()) )
			{
				System.out.println("Hoy es domingo y toca descansar");
			}
			break;
		case "LUNES":		
			if(Dias.LUNES.toString().equals(entrada.toUpperCase()) )
			{
			System.out.println("Hoy es lunes y toca Gym");
			}
			break;
		case "MARTES":
			if(Dias.MARTES.toString().equals(entrada.toUpperCase()) )
			{
				System.out.println("Hoy es martes y toca salir con tu novia");
			}
			break;
		case "MIERCOLES":
			if(Dias.MIERCOLES.toString().equals(entrada.toUpperCase()) )
			{
				System.out.println("Hoy es miercoles y toca ayudar en casa");
			}
			break;
		case "JUEVES":
			if(Dias.JUEVES.toString().equals(entrada.toUpperCase()) )
			{

				System.out.println("Hoy es jueves y toca recoger cuarto");
			}
			break;
		case "VIERNES":
			if(Dias.VIERNES.toString().equals(entrada.toUpperCase()) )
			{
				System.out.println("Hoy es viernes y toca hacer de comer");
			}
			break;
		case "SABADO":
			if(Dias.SABADO.toString().equals(entrada.toUpperCase()) )
			{
				System.out.println("Hoy toca salir a la calle");
			}
			break;
		default:
			System.out.println("ESE NO ES UN DIA DE LA SEMANA");
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un dia de la semana");
		String entrada = sc.nextLine().toUpperCase();
		DiasDeLaSemana semana = new DiasDeLaSemana(entrada);
		semana.empiezaLaSemana();
		
	}
	
	
}

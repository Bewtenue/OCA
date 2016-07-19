package com.softpath.primitivos;

import java.util.Scanner;

public class Switch {
//mayor a 18, menor a 18 y mayor a 65
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int edad = sc.nextInt();
		int casos = 0;
		if(edad < 18)
		{
			casos = 1;
		}
		else if(edad > 85)
		{
			casos = 2;
		}
		switch(casos){
		case 1:
			System.out.println("Eres menor de edad");
			break;
		case 2:
			System.out.println("Estas viejo");
			break;
		default:
			System.out.println("Eres mayor de edad");
		}
	}
}

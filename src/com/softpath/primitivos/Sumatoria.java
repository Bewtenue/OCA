package com.softpath.primitivos;
import java.util.Scanner;

public class Sumatoria {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sumatoria = sc.nextInt();
		int i = 0;
		int resultado=0;
		/*while(i <= sumatoria){
			resultado = resultado + i;
			i++;
		}*/
		do{
			resultado = resultado + i;
			i++;
		}while(i<=sumatoria);
		System.out.println("La sumatoria es " + resultado);
	}
}

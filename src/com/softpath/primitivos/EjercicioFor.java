package com.softpath.primitivos;

import java.util.Scanner;

public class EjercicioFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int entrada = sc.nextInt();
		int i = -1;
		/*
		for(i = 0; i <= entrada; i++){
			if (i % 5 == 0){
				System.out.println(i);
			}
		}
		*/
		
		for( ; ; )
		{
			i++;
			if(i % 5 == 0)
			{
				System.out.println(i);
				continue;
			}
			if( i > entrada)
				break;
		}
	}
}

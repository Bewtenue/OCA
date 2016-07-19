package com.softpath.primitivos;
import java.util.Scanner;

public class Statements {
	
	public static void main(String[] args) 
	{
		/*
		//IF ELSE
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		//System.out.println(x);
		
		if(x > 4)
		{
			System.out.println("El numero es mayor a 4");
		}
		else if(x < 4 ){
			System.out.println("El numero es menor a 4");
		}
		else{
			System.out.println("Es igual");
		}
		
		
		boolean algo = true;
		
		if(algo)
		{
			System.out.println("algo es verdadero");
		}
		*/
		
		
		//WHILE
		/*int i = 0;
		while(i<3)
		{
			System.out.println(i);
			i++;
		}*/
		
		// DO WHILE
		/*int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i < 3);
		*/
		
		// FOR
		/*
		for(int j = 0; j < 3 ; j++)
		{
			System.out.println(j);
		}
		*/
		/*
		for(int j = 10; j > 0; j--){
			System.out.println(j);
		}*/
		/*
		int j = 10;
		for(; j > 0; j--){
			System.out.println(j);
		}
		*/
		/*
		int j = 0;
		for(; j < 10; )
		{
			System.out.println(j);
			j++;
		}
		*/
		/*
		int j = 0;
		for(;;){
			System.out.println(j);
		}
		*/
		/*
		int j = 0;
		for( ; ; )
		{
			System.out.println(j);
			j++;
			if(j > 10)
				break;
		}
 		*/
		/*
		int j = 0;
		for( ; ; )
		{
			if(j % 2 == 0)
				continue;
			j++;
			if(j>10)
				break;
		}
		*/
		
		//////////SWITCH
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1: 
			System.out.println("Number 1");
			break;
		case 2:
			System.out.println("Number 2");
			break;
		default:
			System.out.println("Neither 1 nor 2");
		}
		
		
		
		
		
		
	}
	
}

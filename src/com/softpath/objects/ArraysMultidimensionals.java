package com.softpath.objects;

public class ArraysMultidimensionals {
	public static void main(String[] args) {
		
		int [][] numbers = new int [2][3];
		for(int i = 0;i < 2;i++)//filas
			for(int j = 0; j < 3;j++){//columnas
				numbers[i][j] = j + i;
			}
		for(int i = 0;i < 2;i++)//filas
		{			
			for(int j = 0; j < 3;j++)//columnas
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}

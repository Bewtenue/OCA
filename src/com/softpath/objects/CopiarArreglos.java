package com.softpath.objects;

public class CopiarArreglos {
	public static void main(String[] args) {
		int arreglo[] = {1,2,3,4,5};
		int tamaño = arreglo.length;
		int copiaDeArreglo[] = new int[tamaño];
		
		for(int i = 0; i < tamaño;i++)		
			copiaDeArreglo[i]= arreglo[i];
		
		for(int copia: copiaDeArreglo)
			System.out.println(copia);
			
		
	}
}

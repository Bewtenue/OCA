package com.softpath.objects;

public class CopiarArreglos {
	public static void main(String[] args) {
		int arreglo[] = {1,2,3,4,5};
		int tama�o = arreglo.length;
		int copiaDeArreglo[] = new int[tama�o];
		
		for(int i = 0; i < tama�o;i++)		
			copiaDeArreglo[i]= arreglo[i];
		
		for(int copia: copiaDeArreglo)
			System.out.println(copia);
			
		
	}
}

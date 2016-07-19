package com.softpath.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparaModelo {

	public static void main(String[] args) {
		Coche [] coches = {new Coche("Beettle","Volkswagen","2000"),
				new Coche("KG-TT7","BMW","2010"),new Coche("IT-SERIES 12","Ferrari","2005"),
				new Coche("JAS-SS","Mercedez Benz","2001"),new Coche("Murcielago","Lamborgini","2007")
		};
		
		System.out.println(Arrays.toString(coches));
		Arrays.sort(coches);
		System.out.println("DESPUES DE ORDENAR POR MODELO DE MANERA DESCENDENTE");
		System.out.println(Arrays.toString(coches));
	}

	
}

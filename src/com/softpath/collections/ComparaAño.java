package com.softpath.collections;
import java.util.Arrays;
import java.util.Comparator;

public class ComparaA�o implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		// TODO Auto-generated method stub
		return o1.getA�o().compareTo(o2.getA�o());
	}
	
	
	public static void main(String[] args) {
		Coche [] coches = {new Coche("Beettle","Volkswagen","2000"),
				new Coche("KG-TT7","BMW","2010"),new Coche("IT-SERIES 12","Ferrari","2005"),
				new Coche("JAS-SS","Mercedez Benz","2001"),new Coche("Murcielago","Lamborgini","2007")
		};
		
		System.out.println(Arrays.toString(coches));
		Arrays.sort(coches, new ComparaA�o());
		System.out.println("Despues de ordenar");
		System.out.println(Arrays.toString(coches));
	}
}

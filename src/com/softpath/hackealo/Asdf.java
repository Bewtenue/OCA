package com.softpath.hackealo;

import java.util.Arrays;


public class Asdf {
	 	//String lista[] = { "miel", "extraterrestre", "al", "automovil", "auto", "revestir" };
	    String alfabeto = "zyxwvutsrqponmlkjihgfedcba";
	   
	   public String[] ordenar_extraterrestre(String desordenadas[], String orden_alfabeto)
	   {
	     String ordenada[] = { "revestir", "miel", "extraterrestre", "auto", "automovil", "al" };
	     Arrays.sort(ordenada);
	     Arrays.sort(desordenadas);
	 	    for(int i = 0; i < desordenadas.length; i++){
	 	    	ordenada[i] = ordenarPalabra(desordenadas[i],orden_alfabeto);
	 	    }       
	     return ordenada;
	   }
	     
	   public String ordenarPalabra(String palabra, String ordenAlfabeto){
	 	 String palabraOrdenada= "";
	 	    for(int i = 0; i < palabra.length(); i++){
	 	    	int indice = (26 - ordenAlfabeto.indexOf(palabra.charAt(i))) - 1;
	 	        palabraOrdenada += ordenAlfabeto.charAt(indice);
	 	    }
	 	 return palabraOrdenada;
	   } 
	     
	  
	  public static void main(String[] args) {
			Asdf asdfg = new Asdf();
			String lista[] = { "miel", "extraterrestre", "al", "automovil", "auto", "revestir" };
			String alfabeto = "zyxwvutsrqponmlkjihgfedcba";
			String list[] = new String[6];
			
			list = asdfg.ordenar_extraterrestre(lista, alfabeto);
			
			for (int i = 0;i <list.length;i++){
				System.out.println("original = "+ lista[i]);
				System.out.println("alien    = "+ list[i]);
			}
		}
	  
	  
}

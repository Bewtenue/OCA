package com.softpath.hackealo;


////////HACER METODO DE ORDENAMIENTO!!!



import java.util.Arrays;

/*
 * Un grupo de científicos está analizando una forma de vida inteligente extraterrestre en la reconocida área 52. 
 * Han descubierto que, sorprendentemente, estos usan las mismas letras que nosotros (26 letras, excluyendo la ñ) 
 * aunque su alfabeto posee un orden distinto. Se nos encomienda la tarea de reordenar un diccionario en español 
 * para que los extraterrestres puedan buscar palabras en nuestra lengua más fácilmente. 
 * Diseñar un algoritmo que dada un string que representa todas las letras del alfabeto ordenadas según 
 * los extraterrestres y una lista de palabras, devuelva una lista de palabras ordenadas (en el orden que entiendan 
 * los extraterrestres)
 * 
 * */
public class Extraterrestre{
	// Para testear tu código en nuestros servidores debes mantener la
	// estructura expuesta abajo.
	// Eres libre de crear nuevas funciones/procedimientos.
	// Recuerda que el código que escribas podrá ser visto por las empresas a
	// las que te postules.

	String lista[] = { "miel", "extraterrestre", "al", "automovil", "auto", "revestir" };
	String alfabeto = "zyxwvutsrqponmlkjihgfedcba";
	String ssssssss = "abcdefghijklmnopqrstuvwxyz";
	final int CANT_LETRAS = 26;

	/*
	 * funcion que retorna una palabra segun el alfabeto dado
	 */

	  public String[] ordenar_extraterrestre(String desordenadas[], String orden_alfabeto)
	  {
	    String ordenada[] = new String[desordenadas.length];
	    Arrays.sort(desordenadas);
	    /*for (String string : desordenadas) {
			System.out.println(string);
		}*/
	    for(int i = 0; i < desordenadas.length; i++){
	    	ordenada[i] = ordenarPalabra(desordenadas[i],orden_alfabeto);
	    }
	      
	    return ordenada;
	  }
	  
	  public String ordenarPalabra(String palabra,String ordenAlfabeto){
	  	String palabraOrdenada = "";
	    for(int i = 0; i < palabra.length(); i++){
	    	int indice = (26 - ordenAlfabeto.indexOf(palabra.charAt(i))) - 1;
	        palabraOrdenada += ordenAlfabeto.charAt(indice);
	    }
	      return palabraOrdenada;
	  }
	    
	
	public static void main(String[] args) {
		Extraterrestre ext = new Extraterrestre();
		
		String list[] = new String[ext.lista.length];
		list = ext.ordenar_extraterrestre(ext.lista, ext.alfabeto);
		
		for (int i = 0;i <list.length;i++){
			System.out.println("original = "+ext.lista[i]);
			System.out.println("alien    = "+list[i]);
		}
	}
	
	
}
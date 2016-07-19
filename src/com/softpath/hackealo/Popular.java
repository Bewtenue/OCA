package com.softpath.hackealo;
/*
 * Debido al reciente éxito de la aplicación de mensajería “GuatsApp”, se nos pide realizar un algoritmo que
 *  nos diga quiénes son sus usuarios más populares. 
 *  Tenemos un listado de mensajes definidos como (string remitente, string destinatario, string texto). 
 *  Queremos saber cuál es el usuario que ha recibido más caracteres de texto.
 * */



public class Popular {
	// Para testear tu código en nuestros servidores debes mantener la estructura expuesta abajo.
	// Eres libre de crear nuevas funciones/procedimientos.
	// Recuerda que el código que escribas podrá ser visto por las empresas a las que te postules.
	
	   String mensaje1[] = { "juan", "pedro", "hola como andas?" };
	   String mensaje2[] = { "agus", "pedro", "hola! todo bien?" };
	   String mensaje3[] = { "jorge", "matias", "buen dia matias!!" };
	  public String quien_es_el_mas_popular(String mensaje1[], String mensaje2[], String mensaje3[])
	  {
		  
		  String remitente[] = new String[3];
		  remitente[0]= "asd";
		  remitente[1]= "asdf";
		  remitente[2]= "asdfg";
		  
		  return "pedro";
	  }
	public static void main(String[] args) {
		Popular pop = new Popular();
		pop.quien_es_el_mas_popular(pop.mensaje1, pop.mensaje2, pop.mensaje3);
	}
}

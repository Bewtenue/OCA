package com.softpath.hackealo;
/*
 * Debido al reciente �xito de la aplicaci�n de mensajer�a �GuatsApp�, se nos pide realizar un algoritmo que
 *  nos diga qui�nes son sus usuarios m�s populares. 
 *  Tenemos un listado de mensajes definidos como (string remitente, string destinatario, string texto). 
 *  Queremos saber cu�l es el usuario que ha recibido m�s caracteres de texto.
 * */



public class Popular {
	// Para testear tu c�digo en nuestros servidores debes mantener la estructura expuesta abajo.
	// Eres libre de crear nuevas funciones/procedimientos.
	// Recuerda que el c�digo que escribas podr� ser visto por las empresas a las que te postules.
	
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

package com.softpath.objects;

public class BuilderVsBuffer {
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder(16);//el builder no tiene sus metodos sincronizados,
		//si sabemos el tamaño del string que recibiremos es bueno definir la cantidad, aunque pueda aumentar automaticamente
		StringBuilder build2 = new StringBuilder("Java is cool");
		System.out.println(build2.capacity());//por default la capacidad es 28
		System.out.println(build2.length());//regresa la longitud del string builder
		build2.append(" hola a todos").append(" otra cosa");//se utiliza para concatenar en el StrBld,se pueden anidar
		build2.insert(4, " hola a todos");//inserta una cadena desde la posicion mencionada
		build2.toString();
		
		//StringBuffer buffer;//el string buffer tiene sus metodos sincronizados, se puede hacer concurrencia con string buffer
		
		
		
	}
}

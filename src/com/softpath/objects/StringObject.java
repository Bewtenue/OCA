package com.softpath.objects;

public class StringObject {
	public static void main(String[] args) {
		
		String s = "Somos programadores Java";
		String s1 = new String("Otro String");
		/*
		String c1 = "Java";
		String c2 = "Java";
		
		if(c1==c2) 
			System.out.println("Son iguales");
		*/
		String c1 = new String("Java");
		String c2 = new String("Java");
		String c3 = "Java";
		
		if(c1==c2)//solo compara referencias y no su valor
			System.out.println("Son iguales");
		if(c1.equals(c2))
			System.out.println("Son iguales usando equals");
		if(c1.equals(c3))
			System.out.println("Son iguales usando equals... tambien");
		
		//se puede concatenar string a otro string
		
		String s2 = "Hola que tal "+"como estan todos";
		//Se puede concatenar string a un primitivo
		String s3 = "Este es el numero seis" + 6.8f;
		
		String s4 = "Hola \"Jiamin\" a todos"; 
		System.out.println(s4);
		
		String input = "one";
		//en los switchs se permiten enteros,chars, string y enumeraciones
		switch(input){
		case "one":
			System.out.println("You entered 1");
			break;
		case "two":
			System.out.println("You entered 2");
			break;
		default:
			System.out.println("You entered neither 1 nor 2");
			break;
		}
		////METODOS DE LA CLASE STRING
		
		//char a = "Java".charAt(0);
		//String a = "Java ".concat("esta muy chido");//produce un string como resultado y funciona igual que concatenando con "+"
		//boolean a = "Java".equals("Java");//compara por valor
		//boolean a = "Java".endsWith("va");//verifica si el string termina con el patron que ponemos
		//int a = "Java is cool".indexOf("cool");//regresa el indice de la primera incidencia que encuentra
		//int a = "Java is cool cool".indexOf("cool",9);//se le puede agregar otro valor para mencionar desde donde empieza a buscar la incidencia
		//int a = "Java is cool".lastIndexOf("cool");//regresa la ultima incidencia de la cadena del parametro pasado
		//int a = "Java is cool cool cool".lastIndexOf("cool",12);//tambien se puede mencionar desde donde comienza a leer en sentido de derecha a izquierda en este caso regresa 8
		//String a = "Java is cool and is great".substring(4,10);//te devuelve una cadena segun el rango mencionado
		//String a = "Java is cool and is great".replace('a', 'o')//remplaza todos los caracteres mencionados por el caracter mencionado
		//int a = "Java is cool and is great".length();//regresa la longitud del string
		//boolean a = "Java is cool and is great".isEmpty();//pregunta si la cadena esta vacia
		//String a[] = "Java is cool and is great".split(" ");//regresa un arreglo dividido por la expresion regular mencionada
		//boolean a = "Java is cool and is great".startsWith("a");//Pregunta si empieza con una cadena
		//boolean a = "Java is cool and is great".endsWith("a");//Pregunta si termina
		//String a = "Java is cool and is great    ".trim();//quita los espacios de al final
		//String a = "Java is cool and is GREAT".toLowerCase();//Vuelva todas las letras minusculas
		//String a = "java is cool and is great".toUpperCase();//Vuelve todas las letras a mayusculas
		//System.out.println(a);
		
		
		String firstName = "Alfonso";
		String lastName = "Adams";
		System.out.printf("El primer nombre es: %s y el ultimo nombre "+" es %s",firstName,lastName);
		
	}
}

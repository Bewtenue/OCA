package com.softpath.objects;

class Point
{
	
	//los valores por defecto para los primitivos son 0, 0.0 para double,
	public int x;// 0.0f para flotante, 0L para long , '' cadena vacia para char
	public int y;//null para String	
	
}

class Test {
	// al ser un primitivo solo pasa su valor y no la referencia
	public static void increment(int x)
	{
		x++;
	}
	//pone en 0 el valor de las propiedades de la referencia del objeto
	public static void reset(Point point)
	{
		point.x = 0;
		point.y = 0;
	}
	
	public static void main(String[] args) {
		//los objetos se pasan por referencia
		//un primitivo se pasa por valor
		int a = 9;
		increment(a);
		System.out.println(a);
		Point p = new Point();
		p.x = 400;
		p.y = 600;
		reset(p);
		System.out.println("Punto x : "+ p.x +" Punto y : "+ p.y);
	}
}

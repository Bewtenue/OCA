package com.softpath.generics;

import com.softpath.figuras.Circulo;
import com.softpath.figuras.Cuadrado;
import com.softpath.figuras.Triangulo;
import com.softpath.inheritance.Dog;

public class EjercicioGenerico<T1,T2,T3,T4> {
	
	private T1 object1;
	private T2 object2;
	private T3 object3;
	private T4 object4;
	
	
	public EjercicioGenerico(T1 first,T2 second,T3 third,T4 fourth)
	{
		object1 = first;
		object2 = second;
		object3 = third;
		object4 = fourth;
	}


	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}

	public T3 getThird() {
		return object3;
	}


	public T4 getFouth() {
		return object4;
	}

	public static void main(String[] args) {
		EjercicioGenerico<Circulo, Cuadrado, Triangulo, Circulo> ejercicioGenerico = new EjercicioGenerico<Circulo, Cuadrado, Triangulo, Circulo>(new Circulo(1.2),new Cuadrado(4,4),new Triangulo(4,4),new Circulo(20.2));
		System.out.println(ejercicioGenerico.getSecond().getClass());
	}
	
	
	
}

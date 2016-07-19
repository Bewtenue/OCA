package com.softpath.figuras;

public class Triangulo extends AbstractFigura{
	
	int base;
	int altura;
	int lado1;
	int lado2;
	int lado3;
	
	
	public Triangulo(int base, int altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}


	public Triangulo(int lado1, int lado2, int lado3) {
		// TODO Auto-generated constructor stub
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		int area = (this.base * this.altura) / 2 ;
		return area;
	}
	

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		int perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	

}

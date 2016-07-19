package com.softpath.figuras;

public class Cuadrado extends AbstractFigura{
	
	int base;
	int altura;
	
	public Cuadrado(int base, int altura){
		this.base   = base;
		this.altura = altura;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = this.base * this.altura;
		return area;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		
		int perimetro = (this.base * 2) + (this.altura * 2);
		return perimetro;
	}

}

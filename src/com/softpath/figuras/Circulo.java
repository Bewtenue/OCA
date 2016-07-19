package com.softpath.figuras;

import com.softpath.collections.Person;

public class Circulo extends AbstractFigura{
	
	double radio;
	double otracosa;
	
	public Circulo(double radio) {
		// TODO Auto-generated constructor stub
		this.radio = radio;
	}
	
	public Circulo(double radio,double otracosa) {
		// TODO Auto-generated constructor stub
		this.radio = radio;
		this.otracosa= otracosa;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = (this.radio * this.radio) * Math.PI ;
		return area;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		double perimetro = 2 * (Math.PI * this.radio);
		return perimetro;
	}
	
	
	//OVERRRIDE del metodo equals 
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || obj.getClass() != this.getClass()) {
	            return false;
	        }

	        Circulo guest = (Circulo) obj;
	        return (this.radio == guest.radio) && (this.otracosa == guest.otracosa);
	        
	 	}
	
	
	public static void main(String[] args) {
		
		Circulo circ1 = new Circulo(20.5,4);
		Circulo circ2 = new Circulo(20.5,8);
		System.out.println(circ1.equals(circ2));
		
	}
	
}

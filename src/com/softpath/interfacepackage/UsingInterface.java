package com.softpath.interfacepackage;

public class UsingInterface {
	public static void main(String[] args) {
		CalculadoraDAO calc = new CalculadoraDAO();
		System.out.println(calc.suma(3, 4));
		System.out.println(calc.resta(7, 2));
	}
}

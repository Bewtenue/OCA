package com.softpath.objects;

public class Oxxo {
	
	public int cantidadEmpleados;
	String gerente;
	private double cantidadDinero;
	protected int inventario;
	
	Oxxo(){
		
	}
	
	Oxxo(int cantidadEmpleadosVal,String gerenteVal,double cantidadDineroVal){
		cantidadEmpleados = cantidadEmpleadosVal;
		gerente = gerenteVal;
		cantidadDinero = cantidadDineroVal;
	}
	
	public double getCantidadDinero(){
		return this.cantidadDinero;
	}
	
	String cambiarGerente(String nuevoGerente){
		return nuevoGerente;
	}
	
	protected int cambiarInventario(){
		return inventario;
	}
	
}

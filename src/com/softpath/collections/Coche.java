package com.softpath.collections;

public class Coche implements Comparable<Coche>{
	
	private String modelo;
	private String marca;
	private String a�o;
	
	public Coche(String modelo,String marca,String a�o){
		this.modelo = modelo;
		this.marca = marca;
		this.a�o = a�o;
	}
	
	@Override
	public String toString()
	{
		return this.modelo + "\t" + this.marca + "\t" + this.a�o+"\n";
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getA�o() {
		return a�o;
	}
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public int compareTo(Coche o) {
		return o.marca.compareTo(this.marca);
	}
	
	
}

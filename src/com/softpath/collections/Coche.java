package com.softpath.collections;

public class Coche implements Comparable<Coche>{
	
	private String modelo;
	private String marca;
	private String año;
	
	public Coche(String modelo,String marca,String año){
		this.modelo = modelo;
		this.marca = marca;
		this.año = año;
	}
	
	@Override
	public String toString()
	{
		return this.modelo + "\t" + this.marca + "\t" + this.año+"\n";
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
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	
	@Override
	public int compareTo(Coche o) {
		return o.marca.compareTo(this.marca);
	}
	
	
}

package com.softpath.collections;

public class Student implements Comparable<Student>{
	
	String id;
	String name;
	Double calificacion;
	
	public Student(String id, String name, Double calificacion)
	{
		this.id = id;
		this.name = name;
		this.calificacion = calificacion;
	}
	
	@Override
	public String toString()
	{
		return id + "\t" + name + "\t" + calificacion+"\n";
	}
	
	///Se puede cambiar el metodo compareTo para hacer el sort segun el atributo que le 
	//mandemos segun el orden natural A-Z, 0-9
	@Override
	public int compareTo(Student o) {
		return o.id.compareTo(this.id);
	}
	
}

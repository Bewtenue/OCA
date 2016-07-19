package com.softpath.ejerciciosherencia;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * guardar objetos dentro de una coleccion y si se trata de guardar un objeto igual en
 * la coleccion, le diga al usuario que el objeto ya existe
 * 
*/
public class A {
	
	private String id;
	private String cadena;
	public A()
	{
		
	}
	
	public A(String id) {
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		{
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
		}
			
		A guest = (A) obj;
		if (cadena == null) {
			if (guest.cadena != null)
				return false;
		} else if (!cadena.equals(guest.cadena))
			return false;
		if (id == null) {
			if (guest.id != null)
				return false;
		} else if (!id.equals(guest.id))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		LinkedList<A> listaObjetos = new LinkedList<>();
		LinkedList<A> listaTemporal = new LinkedList<>();
		int opcion=1;
		Scanner sc = new Scanner (System.in);
		while(opcion!=2)
		{
			System.out.println("Agrega un id");
			String idEntrada = sc.next();
			if(listaObjetos.isEmpty())
			{
				listaObjetos.add(new A(idEntrada));
			}
			else{
				listaTemporal.add(new A(idEntrada));
				System.out.println("LISTA ANTES");
				System.out.println(listaObjetos);
				boolean estaEnLista = false;
				for (A a : listaObjetos) {
					System.out.println(a);
					if(a.equals(listaTemporal.getFirst()) || listaTemporal.getFirst().equals(a) ){
						
						estaEnLista = true;
						break;
					}
					else
					{
						System.out.println("Elemento en a : "+ a);
						System.out.println("Elemento en listaTemporal : "+ listaTemporal.getFirst());
						estaEnLista = false;										
					}					
				}
				if(estaEnLista){
					System.out.println("Ese elemento ya esta en la lista");
					listaTemporal.removeLast();
				}else{
					listaObjetos.add(new A(listaTemporal.getFirst().id));
					listaTemporal.removeLast();
					System.out.println("Elemento añadido");
				}
			}
			
			System.out.println("LISTA DESPUES");
			System.out.println(listaObjetos);
			System.out.println("Desea agregar otro objeto? \n1.Si\n2.No");
			opcion = sc.nextInt();
		}
		
	}
	
	
}

package com.softpath.collections;

import java.util.LinkedList;

public class LinkedListObject {
	//////////LISTAS LIGADAS
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		//LinkedList<String> linkedlist = new LinkedList<>();//Tambien esto es valido
		
		linkedlist.add("1");
		linkedlist.add("2");
		linkedlist.add("3");
		linkedlist.add("4");
		linkedlist.add("5");
		
		System.out.println(linkedlist);
		
		linkedlist.addFirst("0");
		linkedlist.addLast("6");
		
		System.out.println(linkedlist);
		
		Object firstval = linkedlist.get(3);
		System.out.println(firstval);
		
		String value = linkedlist.getLast();
		System.out.println(value);
		
		//linkedlist.set(4, "3.5"); //Actualiza el valor de la lista en la posicion
		//System.out.println(linkedlist);
		
		linkedlist.add(4, "3.5");//agrega
		System.out.println(linkedlist);
		
		
		
		
	}
	
	
	
	
	
	
}

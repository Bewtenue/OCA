package com.softpath.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class ListSetMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<String>();
		HashSet <String> hset = new HashSet<>();
		HashMap<Integer,String> hmap = new HashMap<>();	
		
		for(int i = 0 ;i<=5 ; i++){
			System.out.println("Ingresa el dato numero "+ (i + 1));
			String entrada = sc.next();
			linkedlist.add(entrada);
			hset.add(entrada);
			hmap.put(i, entrada);			
		}
		System.out.println("////LISTA LIGADA////");
		System.out.println(linkedlist);
		System.out.println("////HASH SET////");
		System.out.println(hset);
		System.out.println("////HASH MAP////");
		for(Map.Entry<Integer, String> entry : hmap.entrySet()){
			Integer key = entry.getKey();
			String cadena = entry.getValue();
			System.out.println("[" + key +"," + cadena + "]");
		}
		
	}
}

package com.softpath.collections;

import java.util.HashMap;
import java.util.Map;

public class MapObject {
	public static void main(String[] args) {
		///IMPLEMENTACIONES DE MAP
		//HASHMAP
		
		//la diferencia entre un hashmap y un hashtable es que el hash table es sincronizado
		
		HashMap<Integer,String> hmap = new HashMap<>();	
		hmap.put(2, "Jiamin");
		hmap.put(3, "Jesus");
		hmap.put(22, "Aldo");
		hmap.put(5, "Alfonso");
		hmap.put(6, "Rafael");
		
		for(Map.Entry<Integer, String> entry : hmap.entrySet())
		{
			Integer key = entry.getKey();
			String cadena = entry.getValue();
			System.out.println("[" + key +"," + cadena + "]");
		}
		
		
	}
}

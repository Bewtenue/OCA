package com.softpath.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetObject {
	
	public static void main(String[] args) {
		
		HashSet <String> hset = new HashSet<>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Orange");
		hset.add(null);
		hset.add("Grapes");
		System.out.println(hset);
		
		hset.add("Grapes");//un set no puede tener elementos repetidos
		System.out.println(hset);
		
		Set <String> treeset = new TreeSet<>();//no permite valores nulos y esta ordenado de manera natural
		treeset.add("Apple");
		treeset.add("Mango");
		treeset.add("Orange");
		treeset.add("Grapes");
		System.out.println(treeset);
		
		
		
	}
}

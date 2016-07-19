package com.softpath.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class MapaNavegable {

	public static void main(String[] args) {
		NavigableMap<Integer,String> examScores = new TreeMap<>();		
		examScores.put(50, "Aldo");
		examScores.put(40, "Pedro");
		examScores.put(20, "Rafael");
		examScores.put(80, "Jiamin");
		examScores.put(60, "Ramon");
		
		System.out.println(examScores);
		System.out.println(examScores.descendingMap());
		
		System.out.println(examScores.tailMap(50));
		
		System.out.println(examScores.firstEntry());
		
	}
	
}

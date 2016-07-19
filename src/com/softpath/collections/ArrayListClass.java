package com.softpath.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
//implementaciones de Listas, ArrayList, Vector, LinkedList
public class ArrayListClass {
	
	public static void main(String[] args) {
		
		List<String> firstList = new ArrayList<>();//en los parentesis se le puede poner el tamaño del arraylist
		ArrayList<String> secondList = new ArrayList<>();
		List<String> firstList3 = new Vector<>();//la clase Vector tiene sus metodos sincronizados
		firstList.add("C");
		firstList.add("C++");
		firstList.add("Java");
		firstList.add("Ensamblador");
		
		/*for(String f : firstList)
		{
			System.out.println(f);
		}*/
		
		System.out.println(firstList); //Java ya imprime inteligentemente las ArrayList
		firstList.set(1, "C#");
		System.out.println(firstList);
		
		System.out.println(firstList.get(2));
		
		
		firstList.add(0, "Ruby");
		System.out.println(firstList);
		
		firstList.remove(2);
		System.out.println("After removing " + firstList);
		
		System.out.println("Running from Iterator");
		Iterator<String> itr = firstList.iterator();
		while(itr.hasNext())
		{
			Object a = itr.next();
			System.out.println(a);
		}
		
		
		
		
	}
	
}

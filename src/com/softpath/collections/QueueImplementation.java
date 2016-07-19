package com.softpath.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
	public static void main(String[] args) {
		
		Queue<String> secuencia = new LinkedList<>();
		secuencia.add("Ramon");
		secuencia.add("Perla");
		secuencia.add("Rosa");
		secuencia.add("Robert");
		secuencia.add("Jose");
		
		System.out.println(secuencia);
		
		while(!secuencia.isEmpty())
		{
			System.out.println("Quitando elementos de la queue : " + secuencia.remove());
			
		}
		
		System.out.println(secuencia);
		
	}
}

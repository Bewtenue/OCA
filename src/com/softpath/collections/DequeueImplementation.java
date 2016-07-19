package com.softpath.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueImplementation {
	
	private Deque<String> dequeue = new ArrayDeque<>();
	
	void AddinDeQueue(String name)
	{
		dequeue.addLast(name);
		
	}
	
	void removeFront()
	{
		dequeue.removeFirst();
	}
	
	void removeBack()
	{
		dequeue.removeLast();
	}
	
	void printQueue()
	{
		System.out.println(dequeue);
	}
	
	
	public static void main(String[] args) {
		
		DequeueImplementation imp = new DequeueImplementation();
		imp.AddinDeQueue("Rafael");
		imp.AddinDeQueue("Gonzalo");
		imp.AddinDeQueue("Jorge");
		imp.AddinDeQueue("Ramiro");
		imp.AddinDeQueue("Robert");
		
		imp.printQueue();
		imp.removeFront();
		imp.removeBack();
		imp.printQueue();
		
	}
}

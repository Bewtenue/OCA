package com.softpath.hilos;

class Counter{
	public static long count = 0L;
}

public class UserCounter implements Runnable {

	public synchronized void increment()
	{
		Counter.count++;
		System.out.println(Counter.count + " ");
	}
	
	/////Es un monitor, utiliza la palabra reservada synchronized para que se ocupe el metodo
	//y no pueda ser accedido hasta que se libere el recurso
	/*public void increment()
	{
		synchronized(this){
			Counter.count++;
			System.out.println(Counter.count + " ");
		}
		
	}*/
	
	@Override
	public void run() 
	{
		increment();
		increment();
		increment();
		
	}

}

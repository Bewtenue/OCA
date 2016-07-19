package com.softpath.hilos;

public class MyThread1 extends Thread{
	
	public void run()
	{
		try{
			sleep(5000);
			System.out.println("Hola desde la ejecucion del Thread");
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Thread myThread = new MyThread1();
		myThread.start();
		System.out.println("El nombre del thread es: " + Thread.currentThread());
		
		
	}
	
}

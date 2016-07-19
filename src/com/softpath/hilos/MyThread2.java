package com.softpath.hilos;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Running from interface runnable");
		
	}
	
	
	public static void main(String[] args) {
		Thread myThread = new Thread(new MyThread2());
		myThread.setName("Hilo de Jesus");
		myThread.setPriority(9);//´valores del 1 al 10 , 1 como la mas baja y 10 la mas alta
		System.out.println("Minima prioridad " + Thread.MIN_PRIORITY);
		System.out.println("Normal prioridad " + Thread.NORM_PRIORITY);
		System.out.println("Maxima prioridad " + Thread.MAX_PRIORITY);
		myThread.start();
		System.out.println("El thread es " + Thread.currentThread());
		
		
	}
}

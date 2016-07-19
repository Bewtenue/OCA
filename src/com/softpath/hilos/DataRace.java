package com.softpath.hilos;

public class DataRace {
	
	public void ejemplo(){
		System.out.println("Has nada");
	}
	
	public static void main(String[] args) {
		UserCounter c = new UserCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		
	}
}

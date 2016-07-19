package com.softpath.hilos;

public class TimeBomb extends Thread{
	
	Integer [] timer = {0,1,2,3,4,5,6,7,8,9};
	
	
	public void run()
	{
		for(int i = 9;i>=0;i--)
		{
			try
			{
				System.out.println(timer[i]);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		TimeBomb timer = new TimeBomb();
		System.out.println("Comienza la cuenta regresiva");
		timer.start();
		try
		{
			timer.join();
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Boom!");
	}
}

package com.softpath.hilos;

import java.util.Random;

public class PreguntasProfe extends Thread {
	
	public static int totalPreguntasHechas=0;
	private int preguntasHechas = 0;
	public int cantHilos;
	
	public void pedirCalificacion(){
		
	}
	
	public void hacerPregunta(){
		totalPreguntasHechas++;
		this.preguntasHechas++;
		System.out.println("El alumno "+ this.getName() + " hiso una pregunta");
		//this.notifyAll();
	}
	
	public void preguntasAlumno(){
		System.out.println("El alumno "+ this.getName() +" hiso "+ this.preguntasHechas + "pregunta(s)");
	}
	
	public void run(){
		Random rnd = new Random();
		for(int i = 0; i <= rnd.nextInt(5);i++){
			try {
				Thread.sleep(rnd.nextInt(2000));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			this.hacerPregunta();
		}
	}
	
	public static void main(String[] args) {
		Thread alumno1 = new PreguntasProfe();
		Thread alumno2 = new PreguntasProfe();
		Thread alumno3 = new PreguntasProfe();
		Thread alumno4 = new PreguntasProfe();
		Thread alumno5 = new PreguntasProfe();
		alumno1.setName("Jiamin");
		alumno2.setName("Aldo");
		alumno3.setName("Alfonso");
		alumno4.setName("Jesus");
		alumno5.setName("Rafael");
		/*alumno1.setPriority(1);
		alumno2.setPriority(3);
		alumno3.setPriority(5);
		alumno4.setPriority(7);
		alumno5.setPriority(10);*/
		alumno1.start();
		alumno2.start();
		alumno3.start();
		alumno4.start();
		alumno5.start();
		
		try {
			alumno1.join();
			alumno2.join();
			alumno3.join();
			alumno4.join();
			alumno5.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println("Los alumnos hicieron " + totalPreguntasHechas + " preguntas");
			
		
		
	}
	
}

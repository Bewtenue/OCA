package com.softpath.objects;

public class CoffeeMachine {
	/*
	 * 3 atributos, 2 estaticos, 1 entero
	 * sujeto es para definir que sujeto es el que toma cafe
	 * como son estaticos, son propiedades de la clase y no del objeto
	 * 
	 * */
	static int ltrsEnMaquina = 20;
	int sujeto;
	static boolean seAcaboElCafe=false;
	
	
	CoffeeMachine(int sujeto){
		this.sujeto = sujeto;
	}
	
	int consumeCoffee(){
		ltrsEnMaquina--;
		return this.quienSeAcaboElCafe();
	}
	
	int quienSeAcaboElCafe(){
		if(ltrsEnMaquina <= 0){
			seAcaboElCafe=true;
			System.out.println("El sujeto " + this.sujeto + " se acabo el cafe");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		CoffeeMachine sujeto1 = new CoffeeMachine(1);
		CoffeeMachine sujeto2 = new CoffeeMachine(2);
		CoffeeMachine sujeto3 = new CoffeeMachine(3);
		CoffeeMachine sujeto4 = new CoffeeMachine(4);
		
		for(int i=1;;i++){
			switch(i){
			case 1:
				sujeto1.consumeCoffee();
				break;
			case 2:
				sujeto2.consumeCoffee();
				break;
			case 3:
				sujeto3.consumeCoffee();
				break;
			case 4:
				sujeto4.consumeCoffee();
				break;
			}
			if(i>4)
			{
				i=1;
			}
			else if(seAcaboElCafe==true)
				break;
		}
		
		
	}
}

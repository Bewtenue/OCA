package com.softpath.objects;

class Addition {
	//una buena practica es poner una constante como estatica
	static int cont = 10;
	
	void incrementCount(){
		cont++;
	}
	
	int getCount(){
		return cont;
	}
}
